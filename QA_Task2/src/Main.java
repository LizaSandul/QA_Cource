import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int  a, b, c;
        float discriminant;
        double x1, x2;
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a ");
            a = input.nextInt();

            System.out.print("Enter b ");
            b = input.nextInt();

            System.out.print("Enter c ");
            c = input.nextInt();

            if (a == 0 & b == 0 & c == 0) {
                System.out.println("Try again. It's not an equation");
            } else if (a == 0) {
                x1 = (-c) / b;
                System.out.println("It's linear equation, x =" + x1);
            } else if (b == 0 & c == 0) {
                System.out.println("x = 0");
            }
            else {
                discriminant = (b * b) - (4 * a * c);
                System.out.printf("Your equation: %d*x^2+%d*x+%d=0 , D=%.2f \n", a, b, c, discriminant);
                if (discriminant < 0)
                    System.out.printf("Your equation haven't decision \n");
                else if (discriminant == 0) {
                    x1 = (-b) / (2 * a);
                    System.out.printf("x = %.2f", x1);
                } else {
                    x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.printf("x1 = %.2f , x2= %.0f \n", x1, x2);
                }
            }
        } catch(InputMismatchException e){
            System.out.println("Check your input");
        }

    }
}
