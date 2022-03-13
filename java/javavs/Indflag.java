public class Indflag {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || j == 1 || j == 11 || i == 4 && j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
