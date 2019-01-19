package com.company;

import java.util.Arrays;
import java.util.List;

public class Java8FindAnyOrElse {
    public static void main(String[] a) {
        List<Person> personList = Arrays.asList(
                new Person("shiva", 30),
                new Person("rama", 15),
                new Person("krishna", 35));

        Person person = personList.stream().filter(x->"gama".equals(x.getName())).findAny().orElse(null);
        System.out.println(person.getName()+"  " + person.getAge());
    }
}
