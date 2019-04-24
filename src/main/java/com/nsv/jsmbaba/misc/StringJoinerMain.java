package com.nsv.jsmbaba.misc;

import java.util.StringJoiner;

public class StringJoinerMain {
    public static void main(String[] args) {

        String s1 = String.join(" & ","Naga","Virat","Dhoni");
        System.out.println(s1);

        String[] arrStr = {"Watson","Bravo","Tahir"};
        String s2 = String.join(" | ", arrStr);
        System.out.println(s2);

        StringJoiner sj = new StringJoiner(",\n","{","}");
        sj.add("Naga").add("Dhoni").add("Virat");
        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner("&");
        sj2.add("Tahir").add("Warner").add("Rahul");
        System.out.println(sj2);

        StringJoiner merge = sj.merge(sj2);
        System.out.println(merge);


    }
}
