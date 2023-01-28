import java.util.Scanner;

public class MethodsExercises {
    //methods go here
    public static int addition(int x,int y) {
        if (y == 0){
            return x;
        }else {
            return addition(++x,--y);
        }
    }
    public static int subtraction(int x, int y) {
        if (y == 0){
            return x;
        }else {
            return subtraction(x-1,--y);
        }
    }
    public static int multiplication(int x, int y) {
        if (y == 1){
            return x;
        }else {
            return multiplication(x+x,--y);
        }
    }
    public static int division(int x, int y) {
        int i = 0;
        if (x < y){
            return i;
        }
        i+=1;
        return division(x-y,y)+ i;
    }
    public static int remainder(int x, int y) {
        if (x < y){
            return x;
        }
        return division(x-y,y);
    }
    public static void getInteger(int min, int max){
        System.out.println("Please enter a number between " + min + " and " + max);
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num > max | num < min ){
            getInteger(min,max);
        }
    }
    public static int factorial(int n) {
        if (n == 1 ){
            return n;
        }
        return n *= factorial(n-1);
    }

        public static void main(String[] args) {

//        System.out.println( "sum: "+addition(20,3));
//        System.out.println( "subtraction: "+subtraction(22,2));
//        System.out.println( "Multiplication" + multiplication(30,2));
//        System.out.println( "division: "+ division(9,4));
//        System.out.println( "division Remainder: "+ remainder(9,4));

//            getInteger(1,10);
//            System.out.println(factorial(4));;






        }
}
