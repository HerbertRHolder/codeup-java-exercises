import java.lang.Math;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1 = (int)(Math.random() * 10) + 1;
        int d2 =  (int)(Math.random() * 100) + 1;
        int choice = 0;
        System.out.println(d2);
        System.out.println("Guess a number between 1 and 10");
        choice = scan.nextInt();
        while (choice != d1){
            if (choice < d1){
                System.out.println("Nope HIGHER!");
            }
            if (choice > d1){
                System.out.println("Nope LOWER!");
            }
            System.out.println("Next Choice");
            choice = scan.nextInt();
            if (choice == d1){
                System.out.println("Good Guess!");
            }
        }

    }
}
