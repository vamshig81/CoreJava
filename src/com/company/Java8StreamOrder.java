package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamOrder {
    public static void main(String[] q) {
        List<Integer> integerList = Arrays.asList(5,3,9,10,1,2);
        //find the Natural Order and reverse order
        integerList = integerList.stream()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());

        System.out.println("reverse order "+integerList);

        integerList = integerList.stream()
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.toList());
        System.out.println("Natural Order "+integerList);

    }
}
