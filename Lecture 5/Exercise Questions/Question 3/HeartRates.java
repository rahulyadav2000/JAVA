import java.util.*;
class HeartRates 
{
    private String firstName, lastName;
    private int month, day, year = 0;

    public HeartRates(String FName, String LName, int mon, int da, int ye) {
 
        firstName = FName;
        lastName = LName;
        month = mon;
        day = da;
        year = ye;
    }

    public void setFirstName(String FName) {
        firstName = FName;
    }
    
    public String getFirstName() {
        return firstName;
    }
 
 
    public void setLastName(String LName) {
        lastName = LName;
        }
 
 
 
    public String getlastName() {
        return firstName;
    }

    public void setBirthDate(int mon, int da, int ye) {
        month = mon;
        day = da;
        year = ye;
    }

    public int getBirthDate() {
        return day/month/year;
    }
 
    public int getAge(){
        return 2019 - year;
        }
 
    public int MaximumHeartRate() {
        return 220 - getAge();
    }
 

    public void targetHeartRate(){
    System.out.println("Target Heart Rate Range: "+ MaximumHeartRate() * 0.5 + " to "+ MaximumHeartRate() * 0.85);
    }
}
class HearRates
{
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter BirthDate: ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
 
        HeartRates myHeartRate = new HeartRates(firstName, lastName, month, day, year);
        System.out.printf("Name: "+ firstName +", " + lastName);
        System.out.println("Age in years: "+ myHeartRate.getAge());
        System.out.println("Maximum Heartrate: "+ myHeartRate.MaximumHeartRate());
        myHeartRate.targetHeartRate();
 
    }
 
}
 