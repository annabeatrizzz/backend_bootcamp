package src;

public class Account implements IAccount{

    //ATTRIBUTES
    private final int agency;
    private final int number;
    private double ballance;
    private Client owner;

    //METHODS
    public Account(int agency, int number){
        this.agency = agency;
        this.number = number;
    }

    public int getAgency(){
        return agency;
    }

    public int getNumber(){
        return number;
    }

    public double getBallance(){
        return ballance;
    }

    public void setBallance(double ballance){
        this.ballance = ballance;
    }

    public Client getOwner(){
        return owner;
    }

    public void setOwner(Client ownerClient){
        this.owner = ownerClient;
    }

    @Override
    public void deposit(double deposit) {
        this.setBallance(this.getBallance()+deposit);
        System.out.println("The deposit was SUCESSFUL");
    }

    @Override
    public void withdraw(double withdraw) {
        if(withdraw > this.getBallance())
            System.out.println("The withdraw was NOT POSSIBLE due to lack of credit");
        else{
            this.setBallance(this.getBallance()-withdraw);
            System.out.println("The withdraw was SUCESSFULL");
        }
    }

    @Override
    public void bankStatement() {
        System.out.println("The Account has ballance: " + this.getBallance());
    }

}