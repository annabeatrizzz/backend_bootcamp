package Strategy;

public class Robot {

    private Behaviour behaviour;

    public void changeBehaviour (Behaviour newBehaviour){
        behaviour = newBehaviour;
    }

    public void moviment(){
        behaviour.moviment();
    }
}