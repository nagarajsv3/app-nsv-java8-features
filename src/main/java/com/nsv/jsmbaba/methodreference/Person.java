package com.nsv.jsmbaba.methodreference;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private String id;
    private int age;

    public static int comparePersons(Person p1, Person p2){
        return p1.getName().compareTo(p2.getName());
    }

}
