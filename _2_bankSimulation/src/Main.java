import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Simulation! Please type your name:");
        String name = scanner.nextLine();

        System.out.println("Inform your number:");
        int number = scanner.nextInt();

        System.out.println("Inform your agency:");
        String agency = scanner.next();

        System.out.println("inform your balance (please use , with decimals:");
        float balance = scanner.nextFloat();

        TerminalAccount t1 = new TerminalAccount(name, number, agency, balance);
        t1.printInfo();
    }
}