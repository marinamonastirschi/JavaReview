package com.syntax.review9;

public class ShapeTest {
    public static void main(String[] args) {
        // new Shape("Circle","yellow") can't create an object of abstract class
        Triangle triangle=new Triangle("triangle","purple",12,18);
        triangle.print();
        System.out.println("area ="+triangle.calculateArea());
        triangle.printInfo();

        Rectangle rectangle=new Rectangle("rectangle","red",15,8);
        rectangle.printInfo();
        System.out.println("Area of rectangle "+rectangle.calculateArea());

        Shape [] bigShape={new Triangle("triangle","pink",125,180),
                           new Rectangle("rectangle","blue",5,3),
                           new Rectangle("rectangle","brown",100,200)};
        for(Shape sh:bigShape){
            double area=sh.calculateArea();
            sh.printInfo();
            System.out.println("The area of "+sh.color+" "+sh.type+" = "+area);
        }


    }
}
