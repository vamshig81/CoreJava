package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParellelvsSequential {

        public static void main(String[] args) {
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                integerList.add(i);

                Stream<Integer> sequentialStreamList = integerList.stream();
                Stream<Integer> parellelStreamList = integerList.parallelStream();

                Stream<Integer> integerStream = sequentialStreamList.filter(p->p>80);
                integerStream.forEach(p->System.out.println("sequential "+p));

                Stream<Integer> integerStream1 = parellelStreamList.filter(p->p>80);
                integerStream1.forEachOrdered(p->System.out.println("parellel  "+ p));
            }
    }

}