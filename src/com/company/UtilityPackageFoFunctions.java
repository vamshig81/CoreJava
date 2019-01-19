package com.company;

import java.util.Random;
import java.util.function.*;

public class UtilityPackageFoFunctions {

    public static BiFunction<String, Integer, Integer> mapBiFunction = (name, oldValue) -> {
        if(name.equalsIgnoreCase("freddy")) {
            return oldValue + 1000;
        } else {
            return oldValue + 200000;
        }
    };

    public static Supplier<Double> lazyValue = () -> new Double(new Random().nextDouble());

    public static Predicate<String> predicateExample = r -> r.equals("two");

    public static Predicate<String> negatePredicateExample = predicateExample.negate();

    public static Predicate<String> predicateExampleTwo = r -> r.equals("one");

    public static BiConsumer<Integer, Integer> biConsumer = (x, y)-> System.out.println("x " + x + " Y " + y);


    public static BiPredicate<String, String> biPredi=(x, y)  -> x.equalsIgnoreCase(y);


}
