public class alphabetPattern {
    public static void main(String[] args) {

        int n=5;
        int alpha = 64;
        for(int i = 1 ; i<= n ; i++)
        {
            for(int j =1 ; j<= n ; j++)
            {

                System.out.print((char)(alpha+j)+ " ");
            }
            System.out.println("");
        }
        
    }
    
}
