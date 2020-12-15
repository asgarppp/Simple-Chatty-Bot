import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f=scanner.nextInt();
        int s=scanner.nextInt();
        int th=scanner.nextInt();
        System.out.println((f<=s && f>=th) || (f>=s && f<=th));
    }
}