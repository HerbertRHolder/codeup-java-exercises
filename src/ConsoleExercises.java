
import java.io.PrintStream;
import  java.util.Formatter;
import java.util.Scanner;
import java.lang.Number;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        float p = (float) pi;

//        System.out.format("The value of " + "the float variable is " +
//                "%.2f, while the value of the " + "\n" + "integer variable is %d, " +
//                "and the string is %s", p, 2, "stringVar");

//        System.out.printf(
//                "Formatted with precision: PI = %.2f\n",
//                pi);
//        System.out.format("The value of p is: %d%n", p);
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer. \n");
//        System.out.println(scan.nextInt());
//        You will receive a misMatch Exception.
//        String str1 = "";
//        String str2 = "";
//        String str3 = "";
//
//        System.out.println("Enter 3 words. ");
//        str1 = scan.next();
//        str2 = scan.next();
//        str3 = scan.next();
//
//
//        System.out.println(str1 + " " + str2 + " " + str3);
//        scan.next() only takes in one token at time and
//        will remain waiting for an input
//        String s = scan.nextLine();
//        System.out.println(s);
        System.out.println("What is the length of the room in feet?");
        int len = scan.nextInt();
        System.out.println("What is the height of the room in feet?");
        int hei = scan.nextInt();
        System.out.println("Here is the Area of the room: " + (len * hei) + "ft");
        System.out.println("Here is the perimeter of the room: " + (2*(len + hei)) + "ft");






    }
}
