import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        boolean x=str.charAt(0)=='J'||str.charAt(0)=='j';

        System.out.println(x);
    }
}