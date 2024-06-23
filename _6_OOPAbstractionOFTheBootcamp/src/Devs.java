package src;

import java.util.ArrayList;
import java.util.List;

public class Devs {

    //ATTRIBUTES
    private String name;
    private int qtdXp;
    private ETypeOfDev typeOfDev;

    //METHODS
    public Devs(String name, ETypeOfDev typeOfDev){
        this.name = name;
        this.typeOfDev = typeOfDev;
    }

    public String getName(){
        return name;
    }

    public int getQtdXp(){
        return qtdXp;
    }

    public void setQtdXp(int xp){
        qtdXp += xp;
    }

    public ETypeOfDev getTypeOfDev(){
        return typeOfDev;
    }

    @Override
    public String toString(){
        return "DEV - " + this.getName() + " is a " + getTypeOfDev()
                + " and has " + getQtdXp() + "XP!";
    }
}