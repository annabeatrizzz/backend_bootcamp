import src.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp b1 = new Bootcamp("DIO - Santander Back End", "Provides knoledge of backend in Java and Spring",
                LocalDate.of(2024, 05, 01), LocalDate.of(2024, 07, 01));

        Courses c1 = new Courses("Soft Skills", "Develop soft skills by practicing in small groups", 5);
        Courses c2 = new Courses("Introduction to OOP", "Learn and undestand basic concepts of Objected Oriented Programming", 3);

        b1.addCourses(c1);
        b1.addCourses(c2);

        Mentorships m1 = new Mentorships("How to make progress?", "This mentorship will help how to make progress during the bootcamp", LocalDate.of(2024, 06, 23));
        Mentorships m2 = new Mentorships("Feedback", "The last mentorship to give feedback on the bootcamp and how much developers grew", LocalDate.of(2024, 07, 01));

        b1.addMentorship(m1);
        b1.addMentorship(m2);

        Devs d1 = new Devs("Anna", ETypeOfDev.STUDENT);
        Devs d2 = new Devs("Beatriz", ETypeOfDev.TEACHER);
        Devs d3 = new Devs("Camila", ETypeOfDev.STUDENT);
        Devs d4 = new Devs("David", ETypeOfDev.STUDENT);

        b1.addStudentToStudentList(d1);
        b1.addStudentToStudentList(d3);
        b1.addStudentToStudentList(d4);
        b1.addTeacherToTeacherList(d2);

        b1.attributeXPToStudent("Anna", 10);
        b1.attributeXPToTeacher("Beatriz", 30);

        System.out.println(d1.toString());
        System.out.println(d2.toString());

        System.out.println(b1.toString());
    }
}