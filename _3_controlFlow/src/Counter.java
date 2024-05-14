import java.util.InputMismatchException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        int param1, param2;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Type the first number: ");
            try{
                param1 = scanner.nextInt();
                break;
            }catch(InputMismatchException exception){
                System.err.println("Invalid input. Please enter an integer for the first number:");
                scanner.next();
            }
        }

        while(true){
            System.out.println("Type the second number: ");
            try{
                param2 = scanner.nextInt();
                break;
            }catch(InputMismatchException exception){
                System.err.println("Invalid input. Please enter an integer for the second number:");
                scanner.next();
            }
        }

        try {

            countDifference(param1, param2);

        }catch (ParametersInvalidException exception) {
            System.err.println("[ERROR] The second parameter has to be higher then the first parameter.");
        }

    }

    static void countDifference(int param1, int param2 ) throws ParametersInvalidException {
        if(param1 > param2){
            throw new ParametersInvalidException();
        }

        int difference = param2 - param1;
        for(int i=1; i <= difference; i++){
            System.out.println("Printing number " + i);
        }
    }
}