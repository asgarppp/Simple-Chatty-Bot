import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int index = 0;
        int i = 0;
        do {
            a[index] = scan.nextInt();
            index++;
        } while (a[index - 1] != 0);

        while (a[i] != 0) {
            if (a[i] % 2 == 0) {
                System.out.println("even");
            } else if (a[i] % 2 != 0) {
                System.out.println("odd");
            }
            i++;
        }

    }
}