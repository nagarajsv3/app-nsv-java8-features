package com.nsv.jsmbaba.constructorreference;

public class ConstructorReferenceMain {

    public static void main(String[] args) {

        System.out.println("****CreateBook-FunctionalInterface-Using Lambdas*****");
        CreateBook cb = (id) -> {return new Book(id);};
        Book book = cb.createBook("1");
        System.out.println(book);

        System.out.println("****CreateBook-FunctionalInterface-Using Constructor Reference*****");
        CreateBook cb2 = Book::new;
        Book book2 = cb2.createBook("2");
        System.out.println(book2);

        CreateBookWithName cbn1 = (id,title) -> {return new Book(id,title);};
        Book functionalProgBook = cbn1.createBook("3", "Functional Programming using Java8");
        System.out.println(functionalProgBook);

        CreateBookWithName cbn2 = Book::new;
        Book bookreference = cbn2.createBook("4", "Object creation using Constructor reference");
        System.out.println(bookreference);

        System.out.println("************Practise*******************************");
        CreateBook cbp1 = (id) -> {return new Book(id);};
        Book cbp1Book = cbp1.createBook("11");
        System.out.println(cbp1Book);

        CreateBook cbp2 = Book::new;
        Book cbp2Book = cbp2.createBook("12");
        System.out.println(cbp2Book);

        CreateBookWithName cbpn1 = (id, title) -> {return new Book(id,title);};
        Book java8Book = cbpn1.createBook("13", "Java8");
        System.out.println(java8Book);

        CreateBookWithName cbpn2 = Book::new;
        Book java8ConstructorRef = cbpn2.createBook("14", "Java8ConstructorRef");
        System.out.println(java8ConstructorRef);


    }
}
