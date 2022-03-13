public class Flag {
    public static void main(String[] args) {
        int n = 12;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n / 2; j++) {
                if (i == 1 || i == n / 6 || i == n / 4 || i == 4 || j == 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
