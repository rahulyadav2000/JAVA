import java.util.*;
public class PascalDemo
{
     public static void main(String[] args) 
     {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter number of rows to print:");
          int rows = scanner.nextInt();
          System.out.println("Pascal Triangle:");
          for (int i = 0; i < rows; i++) 
          {
              for (int k = 0; k < rows - i; k++) 
              {
                   System.out.print(" ");
              }
              int number = 1;
              for (int j = 0; j <= i; j++) 
              {
                  System.out.print(number + " ");
                  number = number * (i - j) / (j + 1);
              }
              System.out.println();
         }
         
     }
}