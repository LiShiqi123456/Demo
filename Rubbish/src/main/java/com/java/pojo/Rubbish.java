package com.java.pojo;

public class Rubbish {
    private int RuId;
    private String RuName;
    private int RuClass;
    private String ClassName;

    public int getRuId() {
        return RuId;
    }

    public void setRuId(int ruId) {
        RuId = ruId;
    }

    public String getRuName() {
        return RuName;
    }

    public void setRuName(String ruName) {
        RuName = ruName;
    }

    public int getRuClass() {
        return RuClass;
    }

    public void setRuClass(int ruClass) {
        RuClass = ruClass;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    @Override
    public String toString() {
        return "Rubbish{" +
                "RuId=" + RuId +
                ", RuName='" + RuName + '\'' +
                ", RuClass=" + RuClass +
                ", ClassName='" + ClassName + '\'' +
                '}';
    }
}
