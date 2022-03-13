import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yr name");
        String a = sc.next();
        System.out.println("enter yr age");
        int b = sc.nextInt();
        if (b >= 18) {
            System.out.print(a + " yr eligible to vote");
        }
        if (b < 18) {
            System.out.println(a + " yr nt eligible to vote");
        }
    }
}
