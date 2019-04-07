package com.nsv.jsmbaba.stream;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterCollectMain {

    public static void main(String[] args) {

        Customer naga = new Customer("naga","newark");
        Customer baba = new Customer("baba","newark");
        Customer dhoni = new Customer("dhoni","ranchi");
        Customer kohli = new Customer("kohli","delhi");

        List<Customer> customerList = new ArrayList<>();
        customerList.add(naga);
        customerList.add(dhoni);
        customerList.add(kohli);
        customerList.add(baba);

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

        System.out.println("******collect as Set*************************************");
        Set<Customer> newarkCustomerSet = customerList.stream().filter(customerNewarkPredicate).collect(Collectors.toSet());

        System.out.println("******group by Map-*************************************");
        Map<String, List<Customer>> groupedByCityMap = customerList.stream().collect(Collectors.groupingBy(customer -> customer.getCity(), Collectors.toList()));

        groupedByCityMap.forEach((key,value) -> {
            System.out.println(key+"\t"+value);
        });

        Map<String, List<Customer>> customerListMap = customerList.stream().collect(Collectors.groupingBy((cust) -> cust.getCity(), Collectors.toList()));

        Map<String, Set<Customer>> groupedByCityMapSet = customerList.stream().collect(Collectors.groupingBy(customer -> customer.getCity(), Collectors.toSet()));

        groupedByCityMapSet.forEach((key,value) -> {
            System.out.println(key+"\t"+value);
        });

        System.out.println("******parallel stream*********");
        customerList.stream().parallel().forEach(cust -> {
            System.out.println(cust);
        });

        System.out.println("******parallel stream -2");
        customerList.parallelStream().forEach(cust -> System.out.println(cust));

        Person p1 = new Person("Virat",30);
        Person p2 = new Person("Dhoni",32);
        Person p3 = new Person("Abd", 34);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        System.out.println("*******Aggregation-Find Avaerga using maptoDoble*********");
        OptionalDouble average = persons.stream().mapToDouble(person -> {
            return person.getAge();
        }).average();

        if(average.isPresent()) System.out.println(average.getAsDouble());


        OptionalDouble average1 = persons.stream().mapToDouble(person -> person.getAge()).average();

    }
}