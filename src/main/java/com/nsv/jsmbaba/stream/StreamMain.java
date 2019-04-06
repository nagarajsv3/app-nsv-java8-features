package com.nsv.jsmbaba.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        String[] colors = {"red","blue","white"};
        System.out.println("*******Stream.of()********");
        Stream<String> stringStream = Stream.of(colors);
        stringStream.forEach((color) -> {
            System.out.println(color);
        });

        System.out.println("*******Arrays.stream()********");
        Stream<String> stream = Arrays.stream(colors);

        stream.forEach(color -> {
            System.out.println(color);
        });

        System.out.println("*******Arrays.parallelSort()********");
        Arrays.parallelSort(colors);
        Arrays.stream(colors).forEach(color -> {
            System.out.println(color);
        });

    }
}
