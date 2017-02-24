package com.neo.pdm.core.model;

import java.util.Map;

public class ModuleInfo {
    private String klass;
    private String method;
    private String result;
    private Map<String, String> argument;
    private boolean transaction;
    
    public String getKlass() {
        return klass;
    }
    public void setKlass(String klass) {
        this.klass = klass;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public Map<String, String> getArgument() {
        return argument;
    }
    public void setArgument(Map<String, String> argument) {
        this.argument = argument;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public boolean isTransaction() {
        return transaction;
    }
    public void setTransaction(boolean transaction) {
        this.transaction = transaction;
    }
}