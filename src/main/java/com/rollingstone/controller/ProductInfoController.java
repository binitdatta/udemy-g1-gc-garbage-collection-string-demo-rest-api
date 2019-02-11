package com.rollingstone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rollingstone.model.ProductInfo;
import com.rollingstone.service.ProductInfoService;

@RestController	
public class ProductInfoController {

	ProductInfoService productService;
	
	  private static final String HOTSPOT_BEAN_NAME =
		         "com.sun.management:type=HotSpotDiagnostic";
	  
	  // field to store the hotspot diagnostic MBean 
	    private static volatile Object hotspotMBean;
	
	public ProductInfoController(ProductInfoService productService) {
		this.productService = productService;
	}
	
	 @RequestMapping(value = "/rollingstone-g1-gc-demo/products", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public List<ProductInfo> getProducts() {
	        List<ProductInfo> list = productService.getAllProducts();
	        return list;
	    }
	 
	 @RequestMapping(value = "/rollingstone-g1-gc-demo/products/load", //
	            method = RequestMethod.GET, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public List<ProductInfo> getProductsLoad() {
	        List<ProductInfo> list = new ArrayList<ProductInfo>();
	        
	        for (int i=0; i< 100; i++) {
	        	list.addAll(productService.getAllProducts());
	        }
	        return list;
	    }
	 
	 @RequestMapping(value = "/rollingstone-g1-gc-demo/products/heapdump/{filename}", //
	            method = RequestMethod.POST, //
	            produces = { MediaType.APPLICATION_JSON_VALUE, //
	                    MediaType.APPLICATION_XML_VALUE })
	    @ResponseBody
	    public String dumpheap(@PathVariable("filename") String filename) {
		 productService.dumpHeap("./"+filename+".hprof", true);
		 return "Done Dumping Heal";
	    }
}
