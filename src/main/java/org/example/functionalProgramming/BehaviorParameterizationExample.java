package org.example.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Lambdas allow to pass behavior as a method parameter.
 * When the method is executed lambda expression is run.
 * This is referred to Behavior Parameterization.
 *
 * */

public class BehaviorParameterizationExample {

    public static void main(String[] args) {

    Student james = new Student("james", 3.0, 16);
    Student matt = new Student("Matt", 3.5, 15);
    Student andre = new Student("Andre", 4.0, 26);
    Student mary = new Student("Mary", 3.7, 22);
    Student jonathan = new Student("Jonathan", 3.1, 24);
    Student luke = new Student("Luke", 2.9, 26);
    Student payton = new Student("Payton", 2.0, 23);
    Student haley = new Student("Haley", 4.0, 23);
    Student nathan = new Student("Nathan", 3.8, 25);


    List<Student> studentList = Arrays.asList(james, matt, mary, andre, jonathan, luke, payton, haley, nathan);

    System.out.println("Students with good : ");
    //Filter students over 3.5 gpa
        studentList
                .stream()
                .filter(student -> student.getGradePointAverage() > 3.5)
                .map(student -> student.getName())
                .forEach(System.out::println);

    System.out.println("*******************************");

    System.out.println("Students that need to improve: ");
    studentList
            .stream()
            .filter(student -> student.getGradePointAverage() <= 3.5)
            .map(student -> student.getName())
            .forEach(System.out::println);

    System.out.println("*******************************");

    System.out.println("Students those will be valedictorians : ");
    List<Student> valedictorians = filterStudentsByGpa(studentList, 3.9 );
    valedictorians
            .stream()
            .map(student -> student.getName())
            .forEach(System.out::println);

    }


    public static List<Student> filterStudentsByGpa(List<Student> students, Double gpa) {

       return students
                .stream()
                .filter(student -> student.getGradePointAverage() >= gpa)
                .collect(Collectors.toList());
    }
}
