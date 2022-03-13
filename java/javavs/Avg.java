import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter frst no");
        double a = sc.nextInt();
        System.out.println("entr scnd no");
        double b = sc.nextInt();
        System.out.println("entr thrd no");
        double c = sc.nextInt();
        double avg = (a + b + c) / 3;
        System.out.println(avg);
    }
}
