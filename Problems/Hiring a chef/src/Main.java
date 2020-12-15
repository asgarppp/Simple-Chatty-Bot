import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String firstName=scan.next();
        int age=scan.nextInt();
        String edu=scan.next();
        int exp=scan.nextInt();
        String cPerf=scan.next();
        System.out.print("The form for "+firstName+" is completed. We will contact you if we need a chef that cooks "+cPerf+" dishes.");

    }
}