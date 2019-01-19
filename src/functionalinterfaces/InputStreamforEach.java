package functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputStreamforEach {
    //make array
    private static List<String> stringList = new ArrayList<>();
    private static String[] stringArray = {"one", "two","three","four","five"};

    public static void main(String[] a) {
        //convert array asList
        stringList = Arrays.asList(stringArray);

        //print above list using forEach
        System.out.println("using stream ");
        stringList.stream().forEach(x->System.out.println(x));

        System.out.println("using parallelStream ");
        stringList.parallelStream().forEach(System.out::println);

        //similar implementation with old concept
/*        for (String x: stringList) {
            System.out.println(x);
        }*/

    }
}
