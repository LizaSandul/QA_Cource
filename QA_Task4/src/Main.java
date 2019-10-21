import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter N ");
            N = input.nextInt();
            long[] array = new long[N];

            if (N < 0) {
                System.out.println("Wrong number");
            } else if (N == 0) {
                System.out.println("0 \n");
            } else if (N == 1) {
                System.out.println("1 \n");
            } else if (N > 93) {
                System.out.println("Sorry, It's very big number");
            }
            else
            {
                array[0] = 0;
                array[1] = 1;

                for (int i = 2; i < N; i++) {
                    array[i] = array[i - 1] + array[i - 2];
                }

                for (int i = 0; i < N; i++)
                    System.out.println(array[i] + "\n");
            }
        }catch (Exception e){
            System.out.println("Wrong input");
        }
    }
}
