import java.util.*;
class Employee {
 int year;
 String address;
 String name;
 int salary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the Address :: ");
  address = in.nextLine();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextInt();
   System.out.print("Enter the year of joining :: ");
  year = in.nextInt();
  
 }
 
 public void display() {
  
  System.out.println("Employee Address = " + address);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
   System.out.println("Employee year of joining = " + year);
 }
}
 
 class EmployeeTest
 {
            public static void main(String[] args) 
            {
 
                Employee e[] = new Employee[5];
  
                for(int i=0; i<5; i++) 
                {
   
                    e[i] = new Employee();
                    e[i].getInput();
                }
  
                System.out.println("**** Data Entered as below ****");
  
                for(int i=0; i<5; i++) 
                {
   
                    e[i].display();
                }
            }

}
