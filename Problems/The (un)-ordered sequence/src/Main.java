import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int p = 0;
        int i = 0;
        boolean result1 = false;
        boolean result2 = false;
        boolean result;

        do {
            a[p] = scan.nextInt();
            p++;
        } while (a[p - 1] != 0);


        while (a[i] != 0) {
            if (a[i + 1] != 0) {
                if (a[i] <= a[i + 1]) {
                    result1 = true;
                } else {
                    result1 = false;
                    break;
                }
            }
            i++;
        }

        i = 0;

        while (a[i] != 0) {
            if (a[i + 1] != 0) {
                if (a[i] >= a[i + 1]) {
                    result2 = true;
                } else {
                    result2 = false;
                    break;
                }
            }
            i++;
        }
        result = result1 || result2;
        if (a[1] == 0) {
            result = true;
        }
        System.out.println(result);

    }
}