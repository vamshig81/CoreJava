package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilter {
    public static void main(String[] a) {
        List<String> stringList = Arrays.asList("Sunny Leone","Katrina", "Jacqueline","Simran","Shriya");
        //filter some and print
        List l3 = stringList.stream().filter(element->element.contains("y")).collect(Collectors.toList());

        System.out.println("contains "+ l3);

        List l1= stringList.stream().filter(element->element.startsWith("K")).collect(Collectors.toList());

        System.out.println(l1);

        List l2 = stringList.stream().filter(element->element.endsWith("a")).collect(Collectors.toList());

        System.out.println(l2);

        List l4 = stringList.parallelStream().filter(element->element.matches("shriya")).collect(Collectors.toList());

        System.out.println(l4);
    }
}
