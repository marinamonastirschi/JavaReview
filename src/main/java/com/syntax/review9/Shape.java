package com.syntax.review9;

interface Drawable{
    // we can have only public static final variables

    boolean DRAW=true;

    // all methods by default are public and abstract
    void drawing();
}

public abstract class Shape {
    public static final String STR="Hello"; // constant - that is not changeable
    String type;
    protected  String color;
    Shape(String type, String color){
        this.type=type;
        this.color=color;
    }
    protected void printInfo(){
        System.out.println("We build "+color+" "+type);
    }
    public abstract double calculateArea();
}
class Triangle extends Shape{
    double base;
    double height;
    Triangle(String type, String color, double base, double height){
        super(type, color);
        this.base=base;
        this.height=height;
    }
    public double calculateArea(){
        return (base*height)/2;
    }
    public void print(){
        System.out.println(type+" has dimension as "+base+" "+height);
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(String type, String color, double length, double width){
        super(type, color);
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
