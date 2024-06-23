package src;

import java.time.LocalDate;

public class Mentorships implements IBootcampMaterial {

    //ATTRIBUTES
    private String name;
    private String description;
    private LocalDate date;

    //METHODS
    public Mentorships(String name, String description, LocalDate date){
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public LocalDate getDate(){
        return date;
    }

    public void calculateXP(Devs destinationAccount, int newPoints){

    }

    @Override
    public String toString(){
        return "Mentorship **" + getName() +
                "** - " + getDescription() +
                " - on the day " + getDate();
    }
}