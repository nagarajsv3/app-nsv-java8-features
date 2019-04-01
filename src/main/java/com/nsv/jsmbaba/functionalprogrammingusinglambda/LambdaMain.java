package com.nsv.jsmbaba.functionalprogrammingusinglambda;

import java.util.Comparator;
import java.util.TimerTask;

public class LambdaMain {

    public static void main(String[] args) {

        //Comparator Using Ananymous InnerType
        Comparator<Customer> customerComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        //Comparator Using Lambda
        Comparator<Customer> customerComparatorLambda = (o1,o2) -> {return o1.getName().compareTo(o2.getName());};

        Comparator<Customer> customerComparatorLambdaPra = (o1,o2) -> {return o1.getName().compareTo(o2.getName());};

        MyFunctionalInterface myFunctionalInterface = ()->{System.out.println("Printing using MyFunctionalInterface using Lambdas");};

        MyFunctionalInterface practiseInterface = () -> {System.out.println("Print - MyFunctionalInterface - Lambdas");};


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Thread is running");
            }
        };

        Runnable runnableWithLambda = () -> { System.out.println("My Thread is running with Lambdas");};

        Thread thread = new Thread(runnableWithLambda);
        thread.start();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer Task is running");
            }
        };




    }
}
