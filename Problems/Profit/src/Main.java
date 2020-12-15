import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m = scan.nextInt();
        double p = scan.nextInt();
        double k = scan.nextInt();
        int counter=0;
        while (true) {
               if (m>k || m == k) {
                   break;
               }
               m=m+((m/100)*p);
               counter++;
        }
        System.out.println(counter);


    }
}