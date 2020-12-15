import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int p = 0;
        int i = 0;
        int sum = 0;

        do {
            a[p] = scan.nextInt();
            p++;
        } while (a[p - 1] != 0);

        do {
            sum += a[i];
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            } else if (a[i + 1] == 0) {
                System.out.println(sum);
                break;
            }
            i++;
        } while (a[i] != 0);

    }
}