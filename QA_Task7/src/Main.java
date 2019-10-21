import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean loop = true;
        System.out.println("For exit enter quit!");
        while (true) {
            System.out.print("Enter expression:  ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            Calculator calculator = new Calculator(s);
            if (s.equalsIgnoreCase("quit")) {
                break;
            }
            else {
                try {
                    calculator.calculate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


}