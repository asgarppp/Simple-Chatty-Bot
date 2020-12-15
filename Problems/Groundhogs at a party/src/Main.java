import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        boolean day=scanner.nextBoolean();
        System.out.println(((day) && (n>=15&& n<=25)) || ((!day) && (n>=10&& n<=20)));
    }
}