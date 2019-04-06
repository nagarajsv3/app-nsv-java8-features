package com.nsv.jsmbaba.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterCollectMain {

    public static void main(String[] args) {

        Customer naga = new Customer("naga","newark");
        Customer dhoni = new Customer("dhoni","ranchi");
        Customer kohli = new Customer("kohli","delhi");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(naga);
        customerList.add(dhoni);
        customerList.add(kohli);

        customerList.forEach(customer -> {
            System.out.println(customer);
        });

        System.out.println("********************************************************");
        Predicate<Customer> customerCityPredicate = (customer) -> {
            if (customer.getCity().equalsIgnoreCase("ranchi")){
                return true;
            }
            else return false;
        };
        List<Customer> ranchicustomers = customerList.stream().filter(customerCityPredicate).collect(Collectors.toList());

        ranchicustomers.forEach((ranchiCustomer)->{
            System.out.println(ranchiCustomer);
        });

        System.out.println("*************Practise*******************************************");

        Predicate<Customer> customerNewarkPredicate = (cust) -> {
            if(cust.getCity().equalsIgnoreCase("newark")) return true;
            else return false;
        };

        List<Customer> newarkCustomer = customerList.stream().filter(customerNewarkPredicate).collect(Collectors.toList());
        newarkCustomer.forEach((customer -> {
            System.out.println(customer);
        }));

        System.out.println("********customer - naga*********");
        List<Customer> customersmatchingnaga = customerList.stream().filter((customer -> { if (customer.getName().equalsIgnoreCase("dhoni")) return true; else return false;})).collect(Collectors.toList());
        customersmatchingnaga.forEach((custNaga)-> {
            System.out.println(custNaga);
        });

    }
}
