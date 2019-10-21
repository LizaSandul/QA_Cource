import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> divided3 = new ArrayList<Integer>();
        List<Integer> divided5 = new ArrayList<Integer>();

        try {
            System.out.print("Enter N ");
            N = input.nextInt();
            if (N < 1){
                System.out.printf("Enter positive number");
            }
            else {
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = random.nextInt( 200+100)-100 ;
                }
                for (int i = 0; i < arr.length; i++)
                    System.out.printf(arr[i] + " ");


                for (int i = 0;  i < arr.length; i++) {
                    if (arr[i] % 2 == 0)
                        even.add(arr[i]);
                    else
                        odd.add(arr[i]);
                }

                for (int i = 0;  i < arr.length; i++)
                    if (arr[i]%3 == 0)
                        divided3.add(arr[i]);

                for (int i = 0;  i < arr.length; i++)
                    if (arr[i]%5 == 0)
                        divided5.add(arr[i]);

                System.out.printf("\n Even: ");
                for (int i = 0;  i < even.size(); i++)
                    System.out.printf(" ", even.get(i));
                System.out.printf("\n Odd: ");
                for (int i = 0;  i < odd.size(); i++)
                    System.out.print(" "+ odd.get(i));
                System.out.printf("\n Divided by 3: ");
                for (int i = 0;  i < divided3.size(); i++)
                    System.out.print(" "+ divided3.get(i));
                System.out.printf("\n Divided by 5: ");
                for (int i = 0;  i < divided5.size(); i++)
                    System.out.print(" "+ divided5.get(i));

            }
        }catch (Exception e){
            System.out.printf("Wrong input");
        }
    }
}
