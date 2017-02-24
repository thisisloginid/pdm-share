package com.neo.pdm.core.model;

import java.util.HashMap;
import java.util.Map;

public class ResourceInfo {
    private Map<String, Map<String, Object>> resources;
    
    private ResourceInfo(){
        this.resources = new HashMap<String, Map<String, Object>>();
    }

    private static final class SingletonHolder{
        static final ResourceInfo resource = new ResourceInfo();
        private SingletonHolder(){}
    }
    
    public static ResourceInfo getInstance(){
        return SingletonHolder.resource;
    }

    public Map<String, Map<String, Object>> getResources() {
        return resources;
    }
    public void setResources(Map<String, Map<String, Object>> resources) {
        this.resources = resources;
    }
}
