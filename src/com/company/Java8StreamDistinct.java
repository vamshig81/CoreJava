package com.company;

import java.util.Arrays;
import java.util.List;

public class Java8StreamDistinct {
    public static void main(String[] a) {
        List<String> stringList = Arrays.asList("AA","BB","CC,", "AA", "BB");
        Long result = stringList.stream().distinct().count();

        System.out.println("count result "+result);

        System.out.println(" "+Runtime.getRuntime());


    }
}
