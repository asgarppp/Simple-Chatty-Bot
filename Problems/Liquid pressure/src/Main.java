import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = scanner.nextDouble();
        double q = scanner.nextDouble();
        double g = 9.8;
        double p;
        p = q * g * h;
        System.out.println(p);
    }
}