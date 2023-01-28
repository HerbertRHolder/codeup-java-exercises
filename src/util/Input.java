package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo(String s) {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int result;
        do {
            result = scanner.nextInt();
            if (result < min || result > max) {
                System.out.println("Number must be between " + min + " and " + max + ".");
            }
        } while (result < min || result > max);
        return result;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double result;
        do {
            result = scanner.nextDouble();
            if (result < min || result > max) {
                System.out.println("Number must be between " + min + " and " + max + ".");
            }
        } while (result < min || result > max);
        return result;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }



}





