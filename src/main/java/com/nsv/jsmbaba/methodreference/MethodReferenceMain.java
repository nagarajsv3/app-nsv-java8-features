package com.nsv.jsmbaba.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceMain {

    public static void main(String[] args) {
        Person naga = new Person("Naga","A1",29);
        Person dhoni = new Person("Dhoni","A2",33);
        Person virat = new Person("Virat","A3",30);
        Person abd = new Person("Abd","A4",30);


        List<Person> personList = new ArrayList<>();
        personList.add(naga);
        personList.add(dhoni);
        personList.add(virat);
        personList.add(abd);
        System.out.println("******personlist-before sorting*******");
        System.out.println(personList);

        System.out.println("*******personlist-after sorting*******");
        //Way 1 - Using Comparator Instance
        //System.out.println("*******sorting - Using Comparator Instance*******");
        //Comparator<Person> personComparator = (p1,p2) -> p1.getName().compareTo(p2.getName());
        //Collections.sort(personList,personComparator);

        //Way 2 - Using Ananymous Comparator
        //System.out.println("*******sorting - Using Ananymous Comparator*******");
        //Collections.sort(personList,(p1,p2) -> p1.getName().compareTo(p2.getName()));

        //Way 3 - Using Static Method Reference
        //System.out.println("*******sorting - Using Static Method Reference*******");
        //Collections.sort(personList, Person :: comparePersons);

        //Way 4 - Using Instance Method Reference
        System.out.println("*******sorting - Using Instance Method Reference*******");
        MethodReferenceMain main = new MethodReferenceMain();
        Collections.sort(personList, main :: comparePersons);

        //Way 4 - Using Abitrary Method Reference
        System.out.println("*******sorting - Using Abitrary Method Reference*******");
        Collections.sort(personList,Helper::comparePersons);


        System.out.println(personList);




    }

    public int comparePersons(Person p1, Person p2){
        return p1.getName().compareTo(p2.getName());
    }
}
