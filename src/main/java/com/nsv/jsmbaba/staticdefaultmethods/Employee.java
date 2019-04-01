package com.nsv.jsmbaba.staticdefaultmethods;

public class Employee implements Person {
    @Override
    public void doSomeThing() {
        System.out.println("Inside Employee dosomething");
    }

    @Override
    public void eat() {
        System.out.println("Inside Employee eat method");
    }


}
