import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int height= scan.nextInt();
        int up= scan.nextInt();
        int down= scan.nextInt();
        int distanceDone=up;
        int days=1;

        for(int i=0;distanceDone<height;i++) {
            distanceDone += (up - down);
            days++;
        }

        System.out.println(days);

    }
}