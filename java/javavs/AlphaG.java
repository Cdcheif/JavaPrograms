public class AlphaG {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 && j != 0 || j == 0 && i != 0 && i != n || i == 3 && j == n || i == 2 && j == n
                        || i == 2 && j == 2 || i == 2 && j == 3 || i == n && j != 0 && j != n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
