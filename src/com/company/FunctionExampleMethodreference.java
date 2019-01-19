package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

import static com.company.UtilityPackageFoFunctions.predicateExample;


public class FunctionExampleMethodreference {

    private static List<String> input = new ArrayList<>();
    private static String[] inputString = {"one", "two", "three", "four", "two", "five"};

    public static void main(String[] args) {

        input = Arrays.asList(inputString);

        input.stream()
                .filter(predicateExample)
                .forEach(System.out::println);

        stringBiConsumer.accept("hello", "world");

//
//        Map<String, Integer> salaries = new HashMap<>();
//        salaries.put("John", 40000);
//        salaries.put("Freddy", 30000);
//        salaries.put("Samuel", 50000);
//
//        System.out.println( " :Before " );
//        salaries.entrySet()
//                .stream()
//                .forEach(x -> System.out.println( x.getKey() + " Value : " + x.getValue()));

//        salaries.replaceAll((name, oldValue) ->
//                name.equals("Freddy") ? oldValue : oldValue + 10000);

        // salaries.replaceAll(mapBiFunction);
//
//        salaries.replaceAll( (name, oldValue) -> {
//            if(name.equalsIgnoreCase("freddy")) {
//                return oldValue + 1000;
//            } else {
//                return oldValue + 200000;
//            }
//        } );
//
//        System.out.println( " :After " );
//        salaries.entrySet().stream().forEach(x -> System.out.println( x.getKey() + " Value : " + x.getValue()));



    }

//
//    public void foobar(String r) { System.out.println(r);}
//
//    r -> Systemout.println(r);

    private static class InnerClassMy {
        public String getTestme() {
            return testme;
        }

        public void setTestme(String testme) {
            this.testme = testme;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        String testme;
        int value;

        public InnerClassMy(String testme, int value) {
            this.testme = testme;
            this.value = value;
        }

        @Override
        public String toString() {
            return "InnerClassMy{" +
                    "testme='" + testme + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
    private static BiConsumer<String, String> stringBiConsumer = (e1, e2)-> System.out.println(e1+" + "+e2);


}
