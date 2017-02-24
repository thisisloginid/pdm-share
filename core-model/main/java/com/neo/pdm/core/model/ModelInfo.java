package com.neo.pdm.core.model;

import java.util.HashMap;
import java.util.Map;

public class ModelInfo {
    private String screenid;
    private String actionid;
    
    Map<String, Object> userMap;

    public String getScreenid() {
        return screenid;
    }

    public void setScreenid(String screenid) {
        this.screenid = screenid;
    }

    public String getActionid() {
        return actionid;
    }

    public void setActionid(String actionid) {
        this.actionid = actionid;
    }

    public Map<String, Object> getUserMap() {
        if( this.userMap == null ){
            this.userMap = new HashMap<String, Object>();
        }
        return userMap;
    }

    public void setUserMap(Map<String, Object> userMap) {
        this.userMap = userMap;
    }
}
