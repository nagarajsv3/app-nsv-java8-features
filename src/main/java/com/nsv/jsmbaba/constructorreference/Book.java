package com.nsv.jsmbaba.constructorreference;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book {
    private String id;
    private String name;

    public Book(String id) {
        this.id = id;
    }

    public Book(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
