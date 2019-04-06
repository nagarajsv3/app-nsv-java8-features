package com.nsv.jsmbaba.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {

        Customer naga = new Customer("naga","newark");
        Customer dhoni = new Customer("dhoni","ranchi");
        Customer kohli = new Customer("kohli","delhi");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(naga);
        customerList.add(dhoni);
        customerList.add(kohli);

        Predicate<Customer> customerPredicate = new Predicate<Customer>() {
            @Override
            public boolean test(Customer customer) {
                return customer.getName().equalsIgnoreCase("naga");
            }
        };


        customerList.forEach((customer) -> {
            if(customerPredicate.test(customer)) System.out.println(customer);
        });

        System.out.println("***************************************");

        Predicate<Customer> customerPredicateLambda = (customer) -> {return customer.getName().equalsIgnoreCase("naga");};

        customerList.forEach((customer -> {if(customerPredicateLambda.test(customer)) System.out.println(customer);}));

    }
}
