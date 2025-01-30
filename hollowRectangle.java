// hollow rectangle pattern
public class hollowRectangle {

    public static void main(String[] args) {

        int n = 4, m = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // printing stars if condition ture
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    // printing space
                    System.out.print(" ");

                }

            }
            System.out.println();
        }

    }

}
