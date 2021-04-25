package com.bjsxt.test;

import java.util.ArrayList;
import java.util.List;

public class Atest {
    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("D");
        list.add("e");
        list.forEach(System.out::println);

    }
}
