package com.company;

public class ImmutableMainTest {

    public static void main(String[] args) {

        ImmutableExample obj = new ImmutableExample("mkyong");
        System.out.println("Obj   "+obj.hashCode());

        ImmutableExample obj2 = new ImmutableExample("mkyong");
        System.out.println("Obj2   "+obj2.hashCode());


        ImmutableExample obj3 = new ImmutableExample("mkyong");
        System.out.println("Obj3   "+obj3.hashCode());


        // there is no way to update the name after the object is created.
        // obj.setName("new mkyong");
        // System.out.println(obj.getName());

    }
}


