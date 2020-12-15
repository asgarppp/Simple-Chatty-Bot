import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int last = scan.nextInt();
        float sum = 0;
        int counter = 0;
        for (int i = first; i <= last; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                counter++;
            }
        }
        System.out.println(sum/counter);
    }
}