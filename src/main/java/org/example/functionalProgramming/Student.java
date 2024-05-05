package org.example.functionalProgramming;


public class Student {

    private String name;

    private Double gradePointAverage;

    private Integer age;

    public Student(String name, Double gradePointAverage, Integer age) {
        this.name = name;
        this.gradePointAverage = gradePointAverage;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(Double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
