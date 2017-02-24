package com.neo.pdm.core.model;

import java.util.Map;

public class DefaultUserInfo {
    private String id;
    private String name;
    private String age;
    private String sex;
    private String level;
    private String score;
    
    private Map<String, Object> userMap;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public Map<String, Object> getUserMap() {
        return userMap;
    }
    public void setUserMap(Map<String, Object> userMap) {
        this.userMap = userMap;
    }
}
