package com.neo.pdm.core.util;

public class Util {

    public static boolean isNull(String s){
        return s==null?true:false;
    }
    public static boolean isNullOrEmpty(String s){
        return null==s||"".equals(s)?true:false;
    }
    public static boolean isNull(Object object){
        return object==null?true:false;
    }
    public static String nvl(String s){
        return s==null?"":s;
    }
    public static String nvl(String s, String d){
        return s==null?d:s;
    }
}
