package com.rollingstone.service;

import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.management.MBeanServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rollingstone.model.ProductInfo;
import com.rollingstone.repository.ProductInfoRepository;

@Service
public class ProductInfoService {

	private static final Logger log = LoggerFactory.getLogger(ProductInfoService.class);
	
	@Autowired
	private ProductInfoRepository productInfoRepository;
	
	  private static final String HOTSPOT_BEAN_NAME =
		         "com.sun.management:type=HotSpotDiagnostic";
	  
	  // field to store the hotspot diagnostic MBean 
	    private static volatile Object hotspotMBean;
	    
	public List<ProductInfo> getAllProducts() {
		Iterable<ProductInfo> pageOfProducts = productInfoRepository.findAll();
		List<ProductInfo> products = new ArrayList<ProductInfo>();
		for (ProductInfo product : pageOfProducts) {
			products.add(product);
		}
		log.info("In Real Service getAllProducts size :" + products.size());

		return products;
	}
	
    public void dumpHeap(String fileName, boolean live) {
        // initialize hotspot diagnostic MBean
        initHotspotMBean();
        try {
            Class clazz = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method m = clazz.getMethod("dumpHeap", String.class, boolean.class);
            m.invoke( hotspotMBean , fileName, live);
        } catch (RuntimeException re) {
            throw re;
        } catch (Exception exp) {
            throw new RuntimeException(exp);
        }
    }
    
    // initialize the hotspot diagnostic MBean field
    private void initHotspotMBean() {
        if (hotspotMBean == null) {
            synchronized (ProductInfoService.class) {
                if (hotspotMBean == null) {
                    hotspotMBean = getHotspotMBean();
                }
            }
        }
    }
    
    // get the hotspot diagnostic MBean from the
    // platform MBean server
    private Object getHotspotMBean() {
        try {
            Class clazz = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            Object bean = 
                ManagementFactory.newPlatformMXBeanProxy(server,
                HOTSPOT_BEAN_NAME, clazz);
            return bean;
        } catch (RuntimeException re) {
            throw re;
        } catch (Exception exp) {
            throw new RuntimeException(exp);
        }
    }
	
}
