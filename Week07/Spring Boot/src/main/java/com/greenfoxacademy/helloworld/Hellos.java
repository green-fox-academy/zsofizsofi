package com.greenfoxacademy.helloworld;

public class Hellos {
    private String hello;
    private double [] color;
    private double fontSize;

    public Hellos(String hello, double[] color, double fontSize) {
        this.hello = hello;
        this.color = color;
        this.fontSize = fontSize;
    }

    public String getHello() {
        return hello;
    }

    public double[] getColor() {
        return color;
    }

    public double getFontSize() {
        return fontSize;
    }
}
