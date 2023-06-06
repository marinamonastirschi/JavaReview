package com.syntax.review8;

import com.syntax.review1.Hello;
import jdk.jshell.spi.ExecutionControl;

public class ConstructorExample {

    ConstructorExample(){
        System.out.println("I created this constructor");
    }
    ConstructorExample(String str){
        System.out.println("I am parametrized constructor");
    }

    public static void main(String[] args) {
        /* how to create a constructor
        1. must have same name as a class
        2.no return type, not even void
         */
        //If we want to create our own constructor we can create:1. non argument 2.parametrized constructor


        new ConstructorExample();// calling a constructor of ConstructorExample class
                                 // when we do not create-> compiler creates a default constructor for us
                                 //why- constructor is used to initialize the state of the object
        new ConstructorExample("Hello ");
    }
}
