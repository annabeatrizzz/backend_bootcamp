package src;

public class SavingAccount extends Account {

    //ATTRIBUTES

    //METHODS
    public SavingAccount(int agency, int number) {
        super(agency, number);
    }

    public void earnInterest(){
        //this.setBallance(super.getBallance() = getBallance() * 0.1);
    }

    @Override
    public String toString(){
        return "Saving Account - " +
                this.getOwner().toString() +
                " Agency: " + this.getAgency() +
                " Number: " + this.getNumber()+
                " Ballance R$: " + this.getBallance();
    }
}