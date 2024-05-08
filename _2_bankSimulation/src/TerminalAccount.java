public class TerminalAccount {

    private String client_name;
    private int client_number;
    private String client_agency;
    private float client_balance;

    public TerminalAccount(String name, int number, String agency, float balance){
        client_name = name;
        client_number = number;
        client_agency = agency;
        client_balance = balance;
        System.out.printf("Hello %s, thank you for creating an account in our bank, your agency is %s, account number %d, and your balance $%.2f is ready for use.\n", client_name, client_agency, client_number, client_balance);
    }

    //GETTERS
    public String getClient_name() {
        return client_name;
    }

    public int getClient_number() {
        return client_number;
    }

    public String getClient_agency() {
        return client_agency;
    }

    public float getClient_balance() {
        return client_balance;
    }

    //SETTERS
    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public void setClient_number(int client_number) {
        this.client_number = client_number;
    }

    public void setClient_agency(String client_agency) {
        this.client_agency = client_agency;
    }

    public void setClient_balance(float client_balance) {
        this.client_balance = client_balance;
    }

    //Methods
    public void printInfo(){
        System.out.println("The bank account " + client_number + ", from the agency: " + client_agency + ", belongs to " + client_name + " and has the balance of $" + client_balance);
    }
}