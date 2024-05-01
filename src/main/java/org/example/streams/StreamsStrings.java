package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsStrings {

    public static void main(String[] args) {

        List<String> courses = Arrays.asList("AWS", "Springboot", "Docker", "Spring", "Pivotal Cloud Foundry",
                "Kafka Streaming messages", "SQL");


        System.out.println("------------------------------------");
        courses.stream().sorted().forEach(System.out::println);
        System.out.println("------------------------------------");

        System.out.println(courses.stream().sorted().collect(Collectors.toList()));

        //prints list in reverse order
        System.out.println(courses.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        //print list based on length of a string
        System.out.println(courses.stream().sorted(Comparator.comparing(str -> str.length())).collect(Collectors.toList()));


        //length of each course
        //sort the numbers
        //create a new list
        System.out.println(courses.stream().map(course -> course.length()).sorted().collect(Collectors.toList()));


    }
}
