package src;

public class Client {

    //ATTRIBUTES
    private String name;
    private String document;

    //METHODS
    public Client(String name, String document){
        this.name = name;
        this.document = document;
    }

    public String getName(){
        return name;
    }

    public String getDocument(){
        return document;
    }

    @Override
    public String toString(){
        return "Client " + getName() + " Document = " + getDocument();
    }
}