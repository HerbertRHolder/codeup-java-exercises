import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
//     int i = 5;
     int n = 2;
//     while ( i <= 15){
//         System.out.printf(i + " ");
//         i++;
//     }
//        do {
//            System.out.println(n);
//            n = (int) Math.pow(n,2);
//        } while (n<1_000_000);
//        for (int i = 0;i<=100;i++){
//
//            if (i % 3 == 0) {
//
//                if (i % 3 == 0 & i % 5 == 0){
//                    System.out.printf("FizzBuzz \n");
//                }else {
//                    System.out.printf("Fizz \n");
//                }
//
//            }else if (i % 5== 0 ) {
//
//                if (i % 3 == 0 & i % 5 == 0){
//                    System.out.printf("FizzBuzz \n");
//                }else {
//                    System.out.printf("Buzz \n");
//                }
//            }else {System.out.printf(String.valueOf(i)+ "\n");}
//        } // end of for loop
        Scanner scan = new Scanner(System.in);
        String row1 = "number | squared | cubed\n";
        String row2 = "------ | ------- | -----";
        System.out.println("What number would you like to go up to? 5\n");
        int num = (int) scan.nextInt();
        System.out.println(row1+row2);
        for (int i = 0;i<=num;i++){
            int sq = (int) Math.pow(i,2);
            int cub = (int) Math.pow(i,3);
            String space = "       | ";
            if (Math.pow(i,2) >  9 ){
                space = "      | ";
            }
            System.out.println(i + "      | " + sq +  space +  cub);
        }













    }// main end


}// ControlFlowExercises end
