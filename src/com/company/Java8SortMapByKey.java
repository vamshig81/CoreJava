package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Java8SortMapByKey {
    public static void main(String[] args) {
        Map<String, Integer> unsorted = new HashMap<>();
        unsorted.put("c",4);
        unsorted.put("v",1);
        unsorted.put("a",8);
        unsorted.put("b",5);
        unsorted.put("x",6);
        unsorted.put("z",22);
        unsorted.put("j",11);
        unsorted.put("c",55);
        unsorted.put("i",44);
        unsorted.put("l",66);
        unsorted.put("t",33);

        //sort a map by key and put it in result map
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        Map<String, Integer> resultMapByValue = new LinkedHashMap<>();
        unsorted.entrySet().stream()
                            .sorted(Map.Entry.comparingByKey())
                            .forEachOrdered(x->resultMap.put(x.getKey(), x.getValue()));
        System.out.println(resultMap);

        //stream it/sort it/order the result in a separate map
        unsorted.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue())
                            .forEachOrdered(x->resultMapByValue.put(x.getKey(), x.getValue()));
        System.out.println(resultMapByValue);
    }
}