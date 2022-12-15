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
        if (x < y){
            return x;
        }
        return division(x-y,y)+1;
    }
    public static void main(String[] args) {
        System.out.println( addition(20,3));
        System.out.println( subtraction(22,2));
        System.out.println( multiplication(30,2));
        System.out.println( division(27,3));
    }
}
