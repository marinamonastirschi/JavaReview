package com.syntax.review8;

public class SuperMArket {
    public static void main(String[] args) {
        Apple app=new Apple("Fuji","red");
        app.name="Fuji apple";
        app.makeJuice();// its own method
        app.eat();// comes from parent
    }
}
