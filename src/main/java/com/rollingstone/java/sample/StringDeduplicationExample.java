package com.rollingstone.java.sample;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import javax.management.MBeanServer;

@SuppressWarnings("restriction")
public class StringDeduplicationExample {
	
	 static String fileName = "C:\\udemy\\G1GC\\G1Test2.hprof";
	 
	 // This is the name of the HotSpot Diagnostic MBean
    private static final String HOTSPOT_BEAN_NAME =
         "com.sun.management:type=HotSpotDiagnostic";

    // field to store the hotspot diagnostic MBean 
    private static volatile Object hotspotMBean;
    
    /**
     * Call this method from your application whenever you 
     * want to dump the heap snapshot into a file.
     *
     * @param fileName name of the heap dump file
     * @param live flag that tells whether to dump
     *             only the live objects
     */
    static void dumpHeap(String fileName, boolean live) {
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
    private static void initHotspotMBean() {
        if (hotspotMBean == null) {
            synchronized (StringDeduplicationExample.class) {
                if (hotspotMBean == null) {
                    hotspotMBean = getHotspotMBean();
                }
            }
        }
    }
    
    public static List<String>myStrings = new ArrayList<String>();
    public static void main(String[] args) throws Exception {
        for (int counter = 0; counter < 200; ++counter) {
            for (int secondCounter = 0; secondCounter < 1000; ++secondCounter) {
                // Add it 1000 times.
                myStrings.add(("Hello World-" + counter));
            }
                     System.out.println("Hello World-" + counter + " has been added 1000 times");
        }
        if (args[0] != null){
        	fileName = args[0];
        }
		dumpHeap(fileName,true);
    }
    
    // get the hotspot diagnostic MBean from the
    // platform MBean server
    private static Object getHotspotMBean() {
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


