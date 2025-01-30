import java.util.Scanner;

public class solidRectangle2 {
  public static void main(String[] args) {

    int rows, cols;
    Scanner obj = new Scanner(System.in);
    System.out.println("enter row value");

    rows = obj.nextInt();
    System.out.println("enter column value");
    cols = obj.nextInt();
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        System.out.print("* ");
        }
      System.out.println();
         }
      }
}


