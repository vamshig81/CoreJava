package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamsFilterMap {
    public static void main(String[] a) {
        List<Person> personList = Arrays.asList(
                new Person("shiva", 30),
                new Person("rama", 15),
                new Person("krishna", 35));

        Person person = personList.stream().filter(x->"rama".equals(x.getName())).findAny().orElse(null);
        System.out.println(person.getName()+"  " + person.getAge());

        //get only name using map
        String name = personList.stream().filter(x->"rama".equals(x.getName())).map(Person::getName).findAny().orElse("");
        System.out.println("person name  "+name);

        //get all the names using collect
        List<String> nameList = personList.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("nameList  "+nameList);

    }
}
