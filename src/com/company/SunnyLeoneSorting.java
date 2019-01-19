package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SunnyLeoneSorting {
    public static void main(String[] a) {
        List<String> stringList = Arrays.asList("SunnyLeone","SunnyLeone","Thamanna","Simran","Shriya","Katrina","Jacqueline","Kajal");
        stringList = stringList.stream().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        System.out.println("natural order "+ stringList);

    }
}
