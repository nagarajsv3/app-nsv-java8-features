package com.nsv.jsmbaba.staticdefaultmethods;

public class StaticDefaultMain {
    public static void main(String[] args) {
        Person person = new Employee();
        person.doSomeThing();
        person.eat();
        Person.print();

    }
}
