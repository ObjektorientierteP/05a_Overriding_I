package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Child child = new Child();
        output(child.sayHello());

        // Wenn nicht in child gefunden, wird eine Stufe Höher und dort sucht (Parent)
        output(child.sayHello("Hi from "));
 

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

