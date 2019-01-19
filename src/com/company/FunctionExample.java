package com.company;

import java.util.*;
import java.util.function.*;

public class FunctionExample {

    private static List<String> input = new ArrayList<>();
    private static String[] inputString = {"one", "two", "three", "four", "five"};

    public static void main(String[] args) {

        input = Arrays.asList(inputString);

        // input.forEach(r -> System.out.println(r));
//
//        System.out.println(" Below is Stream");
//        input.stream().forEach(x -> System.out.println(x));
//
//        System.out.println(" Below is parallelStream");
//        input.parallelStream().forEach(x -> System.out.println(x));

//        input.stream().map(example -> {
//            System.out.println(" I got Example " + example);
//            return example.toUpperCase();
//        }).forEach(System.out::println);

//        input.stream().map(example -> {
//            // System.out.println(" I got Example " + example);
//            return example.equals("one");
//        }).forEach(System.out::println);

//        input.stream().map(example -> {
//            System.out.println(" I got Example " + example);
//            return example.toUpperCase();
//        }).forEach(System.out::println);

//        input.stream()
//                .filter(predicateExample)
//                .forEach(System.out::println);

//        input.stream()
//                .filter(negatePredicateExample)
//                .forEach(System.out::println);

//        input.stream()
//                .filter(predicateExample.or(predicateExampleTwo))
//                .forEach(System.out::println);

        // System.out.println(biFunctionExample.apply("ExampleDemo", new InnerClassMy("Testing", 40)));


        //System.out.println(biFunctionExampleOne.apply("ExampleDemo", new InnerClassMy("BOOBAR", 40)));
        //using biConsumer
//        biConsumer.accept(20, 40);
//
//       System.out.println("test: "+biPredi.test("hello","HELLO"));
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

        System.out.println(" Supplies testing " + lazyValue.get());

    }

    private static BiFunction<String, Integer, Integer> mapBiFunction = (name, oldValue) -> {
        if(name.equalsIgnoreCase("freddy")) {
            return oldValue + 1000;
        } else {
            return oldValue + 200000;
        }
    };

    private static Supplier<Double> lazyValue = () -> new Double(new Random().nextDouble());

    private static Predicate<String> predicateExample = r -> r.equals("two");

    private static Predicate<String> negatePredicateExample = predicateExample.negate();

    private static Predicate<String> predicateExampleTwo = r -> r.equals("one");

    private static BiFunction<String, InnerClassMy, String> biFunctionExample = (a, b) ->  a + " : " + b.testme;

    private static BiFunction<String, InnerClassMy, String> biFunctionExampleOne = (a, b) ->  b.getTestme();

    private static BiConsumer<Integer, Integer> biConsumer = (x, y)-> System.out.println("x " + x + " Y " + y);


    private static BiPredicate<String, String> biPredi=(x,y)  -> x.equalsIgnoreCase(y);

    private static String foobar(String a, InnerClassMy b) {
        return a + b.testme;

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

}
