package src;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    //ATTRIBUTES
    private final String name;
    private List<Account> accountList;

    //METHODS
    public Bank(String name){
        this.name = name;
        this.accountList = new ArrayList<Account>();
    }

    public String getName(){
        return name;
    }

    public List<Account> getAccountList(){
        return accountList;
    }

    public void setAccountList(List<Account> accountList){
        this.accountList = accountList;
    }

    public void addAccountToAccountList(Account newAccount){
        accountList.add(newAccount);
    }

    @Override
    public String toString(){
        return "Bank " + getName() + " " + getAccountList();
    }
}