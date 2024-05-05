package org.example.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class FunExerciseTwo {

    public static void main(String[] args) {

        List<Course> courses = List.of(
                new Course("Spring", "Framework", 5, 10),
                new Course("Spring AI", "Machine Learning", 4, 30),
                new Course("Red Hat", "Cyber Security", 4, 20),
                new Course("Threat Detection", "Cyber Security", 4, 20),
                new Course("AWS", "Cloud", 2, 15),
                new Course("Cockroach Database", "SQL", 3, 20),
                new Course("Docker", "Cloud", 5, 50),
                new Course("Pivotal Cloud Foundry", "Cloud", 2, 25)
        );

        //allMatch() - returns boolean
        // True -> all values must match the criteria
        // False -> value does not meet the condition
        System.out.println("5 star courses: " + courses
                .stream()
                .allMatch(course -> course.getReviewScore() > 4));

        //anyMatch() - return boolean
        // True -> passed value meets the condition
        // False -> value does not meet the condition
        System.out.println("Are there any 2 star rating courses ? :" +
                courses.stream().anyMatch(course -> course.getReviewScore() < 3));


        //noneMatch() -> return boolean
        // return True -> no available course has a rating 1
        System.out.println("No courses that are one star rating : " +
                courses.stream().noneMatch(course -> course.getReviewScore() < 2));


        System.out.println(courses);


        System.out.println("courseNames" +  courses
                .stream()
                .takeWhile(course -> course.getNumberOfStudents() >= 20 )
                .collect(Collectors.toList()));






    }


    private static class Course {

        private String name;

        private String category;

        private Integer reviewScore;

        private Integer numberOfStudents;

        public Course(String name, String category, Integer reviewScore, Integer numberOfStudents) {
            this.name = name;
            this.category = category;
            this.reviewScore = reviewScore;
            this.numberOfStudents = numberOfStudents;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public Integer getReviewScore() {
            return reviewScore;
        }

        public void setReviewScore(Integer reviewScore) {
            this.reviewScore = reviewScore;
        }

        public Integer getNumberOfStudents() {
            return numberOfStudents;
        }

        public void setNumberOfStudents(Integer numberOfStudents) {
            this.numberOfStudents = numberOfStudents;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    ", reviewScore=" + reviewScore +
                    ", numberOfStudents=" + numberOfStudents +
                    '}';
        }
    }


}
