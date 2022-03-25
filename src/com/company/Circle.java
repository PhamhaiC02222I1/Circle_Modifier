package com.company;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Circle {
    private double radius =1.0;
    private String color ="Red";

    public Circle(){

    }

    protected Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea(){
        return 2*Math.PI*this.radius*this.radius;
    }
}
