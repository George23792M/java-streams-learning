package org.example.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExamples {

    static List<Integer> numbers = Arrays.asList(10, 25, 30, 12, 40, 35, 55, 50, 60);

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;

        Predicate<Integer> isOdd = number -> number % 2 == 1;

        Function<Integer, Integer> squareEachNumber = number -> number * number;

        Consumer<Integer> printNumber = System.out::println;

        System.out.println("Print square of even number");
        // filter even number
        // square each number
        // print number
        numbers
                .stream()
                .filter(isEven)
                .map(squareEachNumber)
                .forEach(printNumber);


        System.out.println("Print square of odd number");
        // filter odd number
        // square each number
        // print
        numbers
                .stream()
                .filter(isOdd)
                .map(squareEachNumber)
                .forEach(printNumber);


        //sorting number in ascending order
        //sorted() - default ascending
        numbers.stream().sorted().forEach(System.out::println);


        System.out.println("20 even number - " + isEven.test(20));
        System.out.println("35 odd number - " + isOdd.test(35));
        System.out.println("10 not odd number - " + isOdd.negate().test(10));
        System.out.println("10 odd number - " + isOdd.test(10));





    }


}
