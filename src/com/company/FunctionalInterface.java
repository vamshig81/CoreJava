package com.company;

public class FunctionalInterface {
    public static void main(String[] args) {
        FuncInterface s = (int x, int y)->x+y;
        int sqareResult = s.callMe(5, 10);

        System.out.println(" Square Result "+sqareResult);
        System.out.println(s.call2());

    }
}
@java.lang.FunctionalInterface
interface FuncInterface {
    int callMe(int x, int y);
    default String call2() {

     return "in default method";
    }

}
