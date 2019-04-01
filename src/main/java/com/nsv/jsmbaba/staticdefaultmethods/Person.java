package com.nsv.jsmbaba.staticdefaultmethods;

public interface Person {

    void doSomeThing();

    static void print(){
        System.out.println("inside new java 8 static method");
    }

    default void eat(){
        System.out.println("person eats food");
    }
}
