package com.company;

import java.util.HashMap;

public class TestMutableKey
{
    public static void main(String[] args)
    {
        //Create a HashMap with mutable key
        HashMap<Account, String> map = new HashMap<Account, String>();

        Account a1 = new Account(1, "A_ONE");

        Account a2 = new Account(2,"A_TWO");

        Account a3 = new Account(1, "A_THREE");

        map.put(a1, a1.getHolderName());
        map.put(a2, a2.getHolderName());
        map.put(a3, a3.getHolderName());

        System.out.println("---------------FETCH----------------------");
        System.out.println("fetch a1 "+map.get(a1)); //Prints A_ONE
        System.out.println("fetch a2 "+map.get(a2)); //Prints A_TWO
        System.out.println("fetch a3 "+map.get(a3)); //Prints A_ONE
    }
}