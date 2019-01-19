package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        //bubble sort
        int inputArray[] = {4,5,9,1,2,10,44,3};

        int n = inputArray.length;
        for (int i=0; i<n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (inputArray[j] > inputArray[j+1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }

            }

        }
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("sorted array "+inputArray[i]);
        }

    }
}