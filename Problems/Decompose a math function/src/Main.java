import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if ( x <= 0 ) {
             x= f1(x);
        } else if ( 0 < x && x < 1 ) {
             x= f2(x);
        } else if ( x >= 1 ) {
             x= f3(x);
        }
        return x;
    }

    //implement your methods here
    public static double f1(double x) {
        return x= Math.pow(x,2)+1;

    }

    public static double f2 (double x) {
        return x= 1/ Math.pow(x,2);
    }

    public static double f3 (double x) {
        return x= Math.pow(x,2)-1;
    }
}