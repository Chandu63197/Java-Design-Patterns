public class pattern4 {

    public static void main(String[] args) {
        int n = 5;
        int alpha = 65;
        for(int i = 1 ; i <= n ; i++ )
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print((char) alpha);
            }
            alpha++;
            System.out.println();
        }
    }
    
    
}
