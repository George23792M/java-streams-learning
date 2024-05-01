package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsReduceFun {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 5, 10, 100, 9, 25, 12, 15, 0, 35, 15, 20);

        System.out.println("sum of numbers using while-loop - " + sumOfIntegers(numbers));

        System.out.println("sum of numbers using for-loop - " + sumOfIntegersUsingForLoop(numbers));

        System.out.println("sum of numbers using streams - " +  sumOfIntegerUsingStreams(numbers));



        //Sum only odd numbers:
        System.out.println("Sum only odd numbers:" + numbers.stream().filter(number -> number%2 ==1).reduce(0, Integer::sum));

        //Sum only even numbers:
        System.out.println("sum only even numbers: " + numbers.stream().filter(number -> number%2 ==0).reduce(0, Integer::sum));

        //Sorting numbers and prints each item
        // includes duplicates
        System.out.println("-------------------------------");
        numbers.stream().sorted().forEach(System.out::println);
        System.out.println("-------------------------------");


        //Sorting only distinct numbers
        System.out.println("-------------------------------");
        numbers.stream().distinct().sorted().forEach(System.out::println);
        System.out.println("-------------------------------");


        //square each number
        // and collect to a new list
        System.out.println(numbers.stream().map(number -> number * number).collect(Collectors.toList()));

        //find even number
        //sort the numbers
        //convert to new list
        System.out.println(numbers.stream().filter(number -> number%2 == 0).sorted().collect(Collectors.toList()));

    }

    //Traditional Approach - using while loop
    public static Integer sumOfIntegers(List<Integer> numbers) {

        int i = 0;

        int result = 0;

        while(i < numbers.size()) {

            result += numbers.get(i);
            i++;
        }

        return result;
    }

    // Traditional Approach - using for loop
    public static Integer sumOfIntegersUsingForLoop(List<Integer> numbers) {

        int result = 0;

        for (int i = 0; i < numbers.size(); i++) {

            result += numbers.get(i);

        }
        return result;
    }

    public static Integer sumOfIntegerUsingStreams(List<Integer> numbers) {

        return numbers.stream().reduce(0, Integer::sum);
    }
}
