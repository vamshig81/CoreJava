package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamsFilter {
    public static void main(String[] args) {
        //prepare list/stream/collect
        List<String> personList = Arrays.asList("shiva","rama","krishna");

        //person list into stream into filter then do some logic collect it and convert to list
        List<String> personResult  = personList.stream().filter(
                person->!"rama".equals(person)
        ).collect(
                Collectors.toList()
        );

        personResult.forEach(System.out::println);
    }
}
