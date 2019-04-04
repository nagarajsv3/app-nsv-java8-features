package com.nsv.jsmbaba.predicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CustomerMain {

    public static void main(String[] args) {
        Customer naga = new Customer("naga","newark");
        Customer dhoni = new Customer("dhoni","ranchi");
        Customer kohli = new Customer("kohli","delhi");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(naga);
        customerList.add(dhoni);
        customerList.add(kohli);

        for (Customer customer: customerList) {
            System.out.println(customer);
        }

        System.out.println("***********************************");

        customerList.forEach(customer -> {
            System.out.println(customer);
        });

        System.out.println("***********************************");

        Consumer<Customer> customerConsumer = customer -> {
            System.out.println(customer);
        };
        customerList.forEach(customerConsumer);

        System.out.println("*********************************");
        Map<String,Customer> customerMap = new HashMap<>();
        customerMap.put(naga.getName(),naga);
        customerMap.put(dhoni.getName(),dhoni);
        customerMap.put(kohli.getName(),kohli);

        for (Map.Entry<String,Customer> entry: customerMap.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        System.out.println("*********Using Biconsumer Functional Interface**********");
        customerMap.forEach((key,value)->{
            System.out.println(key+"\t"+value);
        });

        System.out.println("*********Using Biconsumer Functional Interface Instance-Ananymous Type**********");
        BiConsumer<String, Customer> customerBiConsumer = new BiConsumer<String, Customer>() {
            @Override
            public void accept(String s, Customer customer) {
                System.out.println(s+"\t"+customer);
            }
        };

        customerMap.forEach(customerBiConsumer);

    }
}
