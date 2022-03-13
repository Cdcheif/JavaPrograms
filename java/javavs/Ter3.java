import java.util.Scanner;

public class Ter3 {
    public static void main(String[] args) {
        int greater = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter frst no");
        int a = sc.nextInt();
        System.out.println("Enter scnd no");
        int b = sc.nextInt();
        System.out.println("Enter thrd no");
        int c = sc.nextInt();
        greater = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("greatest no is:-  " + greater);
    }
}