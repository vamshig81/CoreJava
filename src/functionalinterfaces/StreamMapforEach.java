package functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class StreamMapforEach {

    private static List<String> stringList = new ArrayList<>();

    private static String[] stringArray = {"one","two","three", "four", "five", "six"};

    public static void main(String[] a) {

        //using stram.map
        stringList = Arrays.asList(stringArray);

        //print list using map //map has function that takes input and returns
/*
        stringList.stream()
                    .map(x-> {System.out.println(" in the map "); return x.toUpperCase();}).forEach(System.out::println);
*/

        //test predicate
/*
        stringList.stream()
                    .filter(predicateTest2)
                    .forEach(System.out::println);
*/
       System.out.println(""+predicateTest2.test("hello", "World"));
    }

    private static Predicate<String> predicateTest = x->x.equals("one");

    private static Predicate<String> predicateTest1 = x->x.startsWith("fi");

    private static BiPredicate<String, String> predicateTest2 = (x, y)->x.equalsIgnoreCase(y);

}
