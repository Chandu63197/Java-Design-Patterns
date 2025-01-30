public class pattern6 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int alpha = 65;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char) alpha);
                alpha++;
            }
            alpha = alpha - 2;
            for (int j = 2; j <= i; j++) {
                System.out.print((char) alpha);
                alpha--;
            }

            System.out.println();
        }
    }
}



