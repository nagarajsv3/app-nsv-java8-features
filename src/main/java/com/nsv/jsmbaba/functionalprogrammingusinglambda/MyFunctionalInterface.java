package com.nsv.jsmbaba.functionalprogrammingusinglambda;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print();
    static void staticMethod(){
        System.out.println("Inside Static Method of Functional Interface");
    }

    default void defaultMethod(){
        System.out.println("Inside Default Method of Functional Interface");
    }
}
