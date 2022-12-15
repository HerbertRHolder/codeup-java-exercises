import java.util.*;

public class Bob {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                scan.useDelimiter("");
                String empty = scan.nextLine();

                if (empty.length() == 0) {
                    System.out.println("Fine. Be that way!");
                }else if (empty.charAt(empty.length()-1) == '?' ){
                    System.out.println("Sure.");
                }else if (empty.charAt(empty.length()-1) == '!' ){
                    System.out.println("Whoa Chill out!");
                }else {
                    System.out.println("Whatever...");
                }



    }
}
