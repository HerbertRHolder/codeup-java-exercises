public class ArithmeticSample {
    private int num1 = 0;
    private int num2 = 0;


    public int add(int a,int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        ArithmeticSample calc = new ArithmeticSample();
        double a = 1.2;
        double b = 2.2;
        int x = 3;
        int y = 4;

        calc.add(a,b);
        calc.add(x, y);

}
}
