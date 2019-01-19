package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionExamples2 {


    private static List<String> exampleInput = new ArrayList();

    public static void main(String[] args) {

        final String[] red = {"one", "two", "three", "four", "five"};

        exampleInput = Arrays.asList(red);

        // System.out.println("Array List "+ exampleInput);

        // exampleInput.forEach( (x -> System.out.println(x));

        // Traditional ( andThen )
        Integer r = functionOne("TestingFunctionOne");

        String que = functionTwo(r);

        System.out.println(que);


        // Traditional ( compose )


        String queFunctionTwo = functionTwo(99);
        Integer rFunc = functionOne("Testing Composition");

        System.out.println(rFunc);

        // then
        functionOneFunction.andThen(functonTwoFunction);

        // comopnent
        functonComposeDemo.compose(functionOneFunction);

//        exampleInput.stream().map(
//                functionOneFunction.andThen(functonTwoFunction).compose(functonComposeDemo));

        // compls
        xyz.apply(49);




    }

    private static final Integer functionOne(String input) {
        System.out.println(input);
        return new Integer(String.valueOf(45));
    }

    private static final String functionTwo(Integer inte) {
        return inte + " : in FunctionTwo";
    }

    private static final String functionThree(Integer inte) {
        return inte + " : in FunctionTwo";
    }

    private static Function<String, Integer> functionOneFunction = element ->
         new Integer(45);

    private static Function<Integer, Boolean> functonComposeDemo = elemtn -> true;

    private static IntFunction<String> xyz = element -> "HelloWorld" + element;

    private static DoubleFunction<Boolean> rzy = element -> true;

    private static Function<Integer, String> functonTwoFunction = q ->  q + " : in FunctionTwo";
}