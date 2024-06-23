package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    //ATTRIBUTES
    private String name;
    private String description;
    private LocalDate startDate, endDate;
    private List<Devs> studentsList;
    private List<Devs> teachersList;
    private List<Courses> coursesList;
    private List<Mentorships> mentorshipsList;

    //METHODS
    public Bootcamp(String name, String description, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.studentsList = new ArrayList<Devs>();
        this.teachersList = new ArrayList<Devs>();
        this.coursesList = new ArrayList<Courses>();
        this.mentorshipsList = new ArrayList<Mentorships>();
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public LocalDate getEndDate(){
        return endDate;
    }

    public List getCoursesList(){
        return coursesList;
    }

    public void addCourses(Courses newCourse){
        coursesList.add(newCourse);
    }

    public void addStudentToStudentList(Devs student){
        studentsList.add(student);
    }

    public void addTeacherToTeacherList(Devs teacher){
        teachersList.add(teacher);
    }

    public List getMentorshipList(){
        return mentorshipsList;
    }

    public void addMentorship(Mentorships newMentorship){
        mentorshipsList.add(newMentorship);
    }

    public void attributeXPToStudent(String name, int xp){
        if(studentsList.size()==0){
            System.out.println("The student does not exist");
        }

        for(int i=0; i<studentsList.size(); i++){
            if(studentsList.get(i).getName().equals(name)){
                studentsList.get(i).setQtdXp(studentsList.get(i).getQtdXp()+xp);
                System.out.println("The operation was a sucess!");
            }
        }
    }

    public void attributeXPToTeacher(String name, int xp){
        if(teachersList.size()==0){
            System.out.println("The teacher does not exist");
        }

        for(int i=0; i<teachersList.size(); i++){
            if(teachersList.get(i).getName().equals(name)){
                teachersList.get(i).setQtdXp(teachersList.get(i).getQtdXp()+xp);
                System.out.println("The operation was a sucess!");
            }
        }
    }

    @Override
    public String toString(){
        return "BOOTCAMP " +
                this.getName() +
                " [" + this.getStartDate() + " to " + this.getEndDate() + "]"
                + " has " + this.studentsList.size() + " students, " +
                this.teachersList.size() + " teachers, with " + this.coursesList.size() +
                " Courses and " + this.mentorshipsList.size() + " Mentorships.";
    }
}