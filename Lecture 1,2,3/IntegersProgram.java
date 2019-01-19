import java.util.*;
class IntegersProgram
{
        public static void main (String args [])
        {
            int number1, number2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number 1:");
            number1 = scanner.nextInt();
            System.out.println("Input number 2:");
            number2 = scanner.nextInt();
            
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            
            int n = scanner.nextInt();
            switch(n)
            {
                case 1:
                int add;
                add = number1 + number2;
                System.out.println("Result : "+add);
                break;
 
                case 2:
                int sub;
                sub = number1 - number2;
                System.out.println("Result : "+sub);
                break;
 
                case 3:
                int mul;
                mul = number1 * number2;
                System.out.println("Result : "+mul);
                break;
 
                case 4:
                float div;
                div = (float) number1 / number2;
                System.out.print("Result : "+div);
                break;
 
                case 5:
                int mod;               
                mod = number1 % number2;
                System.out.println("Result : "+mod);
                break;
            
            
            }
        }
}
