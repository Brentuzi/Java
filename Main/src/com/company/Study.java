package com.company;

public class Study {

    private String course;
    private int hours;


    public Study(String courseName) {
        course = courseName;
    }

    public String printCourse() {
        return this.course;
    }

}

class JavaProgram {
    public static void main() {
        String course = "Изучение Java - это просто!";

        Study study = new Study(course);

        System.out.println(study.printCourse());


    }
}