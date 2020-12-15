import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();
        int sum=0;
        for (int i = 1; i <= numTotal; i++) {
            int num = scan.nextInt();
            if (num % 6 == 0) {
               sum=sum+num;
            }
        }
        System.out.println(sum);
    }
}