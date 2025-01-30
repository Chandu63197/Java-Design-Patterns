public class charPyramid {

    public static void main(String[] args) {

        int n = 5;
        char m ;
        for (int i = 1; i <= n; i++) {

            for (int j = 1 ; j <= n-i ; j++) {
                System.out.print(" ");
            }

            m = 65;

            for (int j = 1 ; j <= i; j++) {
                System.out.print(m);
                m++;
            }

            m = (char) (m-2);

            for (int j = 2 ; j <= i; j++) {
                System.out.print(m);
                m--;
            }

            System.out.println();
            
        }
    }
    
}
