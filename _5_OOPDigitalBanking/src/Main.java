package src;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("Santander");
        //Bank b2 = new Bank("Bradesco");

        CurrentAccount ca1 = new CurrentAccount(123, 456);
        ca1.setBallance(1000);
        ca1.setOwner(new Client("Anna", "123456789"));

        SavingAccount sa1 = new SavingAccount(456, 789);
        sa1.setBallance(500.00);
        sa1.setOwner(new Client("Matheus", "987654321"));

        b1.addAccountToAccountList(ca1);
        b1.addAccountToAccountList(sa1);

        System.out.println(ca1.toString());
        ca1.deposit(100);
        System.out.println(ca1.toString());
        ca1.withdraw(100);
        System.out.println(ca1.toString());
        ca1.withdraw(100000);
        System.out.println(ca1.toString());

        ca1.bankStatement();
        sa1.bankStatement();
    }
}