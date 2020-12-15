import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int number=1;
        do {
                System.out.println((int)(Math.pow(number, 2)));
                number++;
        } while (Math.pow(number, 2) <= num);



    }
}