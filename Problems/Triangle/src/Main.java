import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int C=scan.nextInt();
        if((A + B > C) && (A + C > B) && (C + B > A)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}