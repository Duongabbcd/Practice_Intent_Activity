package com.example.practice_intent_activity;

import java.io.Serializable;

public class Student implements Serializable {
    private int sourceImg ;
    private String name ;
    private double mark ;

    public Student(int sourceImg, String name, double mark) {
        this.sourceImg = sourceImg;
        this.name = name;
        this.mark = mark;
    }

    public int getSourceImg() {
        return sourceImg;
    }

    public void setSourceImg(int sourceImg) {
        this.sourceImg = sourceImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
