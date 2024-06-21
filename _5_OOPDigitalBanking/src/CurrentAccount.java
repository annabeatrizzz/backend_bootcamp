package src;

public class CurrentAccount extends Account {

    //ATTRIBUTES

    //METHODS
    public CurrentAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public String toString(){
        return "Current Account - " +
                this.getOwner().toString() +
                " Agency: " + this.getAgency() +
                " Number: " + this.getNumber() +
                " Ballance R$: " + this.getBallance();
    }
}