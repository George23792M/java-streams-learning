package org.example.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunExerciseOne {

    private static final List<Integer> employeesSalary = Arrays.asList(5000, 7500, 9000, 3500, 4000, 25000, 50000);

    private static final List<Integer> employeesAge = Arrays.asList(25, 14, 16, 30, 45, 33, 50, 20);

    public static void main(String[] args) {


        //takeWhile() - stops processing as soon as it encounters
        System.out.println(employeesAge.stream()
                .takeWhile(age -> age > 30)
                .collect(Collectors.toList()));


        //Monthly company expenses pay its employee salaries
        int totalExpenses = employeesSalary
                .stream()
                .reduce(0, Integer::sum);

        System.out.println(totalExpenses);


        // Employees who are registered to vote for presidential elections
        List<Integer> employeesApplicableToVote = employeesAge
                .stream()
                .filter(age -> age >= 18)
                .collect(Collectors.toList());

        System.out.println("Employees age that are qualified to vote " + employeesApplicableToVote);


        //Filter part-time employees in the company by age:
        System.out.println("part-time employees in the company by age:");

        employeesAge
                .stream()
                .filter(age -> age < 18)
                .forEach(System.out::println);
    }
}
