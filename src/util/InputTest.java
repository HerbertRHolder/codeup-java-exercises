package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string: ");
        String string = input.getString();
        System.out.println("You entered: " + string);

        System.out.println("Enter y/n: ");
        boolean yesNo = input.yesNo("Do you want to create another circle?");
        System.out.println("You entered: " + yesNo);

        System.out.println("Enter a number between 1 and 10: ");
        String num = input.getString();
        Integer.valueOf(num);

        System.out.println("You entered: " + num);

        System.out.println("Enter a number: ");
        String num2 = input.getString();
        Integer.valueOf(num2);

        System.out.println("You entered: " + num2);

        System.out.println("Enter a decimal number between 1 and 10: ");
        String decimal = input.getString();
        Double.valueOf(decimal);

        System.out.println("You entered: " + decimal);

        System.out.println("Enter a decimal number: ");
        String decimal2 = input.getString();
        System.out.println("You entered: " + decimal2);
    }
}

