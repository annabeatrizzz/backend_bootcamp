package src;

public class Courses implements IBootcampMaterial{

    //ATTRIBUTES
    private String name;
    private String description;
    private int workload; // in hours

    //METHODS
    public Courses(String name, String description, int workload){
        this.name = name;
        this.description = description;
        this.workload = workload;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getWorkload(){
        return workload;
    }

    public void calculateXP(Devs destinationAccount, int newPoints){

    }

    @Override
    public String toString(){
        return "Course **" + getName() +
        "** - " + getDescription() +
        " has " + getWorkload() + " hours";
    }
}