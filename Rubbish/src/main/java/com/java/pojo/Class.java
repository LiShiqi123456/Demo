package com.java.pojo;

public class Class {
    private int ClassId;
    private String ClassName;

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    @Override
    public String toString() {
        return "Class{" +
                "ClassId=" + ClassId +
                ", ClassName='" + ClassName + '\'' +
                '}';
    }
}
