import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter string ");
            String palindrom = input.nextLine();
            palindrom = palindrom.replaceAll(" ","").toLowerCase();

            boolean isPalindrom = palindrom.equals(new StringBuilder(palindrom).reverse().toString());
            System.out.println(isPalindrom);

        } catch (Exception e) {
            System.out.println("Error input");
        }
    }
}
