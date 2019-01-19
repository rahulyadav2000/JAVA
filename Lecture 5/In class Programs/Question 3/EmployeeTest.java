class Employee

{

	private String firstName;

	private String lastName;

	private double monthlySalary;

	public Employee()

	{

		this.firstName="";

		this.lastName="";

		this.monthlySalary=0;

	}

	public Employee(String firstName, String lastName,double monthlySalary)

	{

		this.firstName=firstName;

		this.lastName=lastName;

		this.monthlySalary=monthlySalary;

	}

	public void setFirstName(String firstName)

	{

		this.firstName=firstName;

	}

	public String getFirstName()

	{

		return firstName;

	}

	public void setLastName(String lastName)

	{

		this.lastName=lastName;

	}

	public String getLastName()

	{

		return lastName;

	}

	public void setMonthlySalary(double monthlySalary)

	{

		if(monthlySalary>0)

			this.monthlySalary=monthlySalary;

		else

			this.monthlySalary=0;

	}

	public double getMonthlySalary()

	{

		return monthlySalary;

	}

}

class EmployeeTest

{

	public static void main(String[] args)

	{

		

		Employee emp1=new Employee();

		

		emp1.setFirstName("Nikhil");

		emp1.setLastName("Yadav");

		emp1.setMonthlySalary(1000);

		System.out.println("Details of employee1 : ");

		System.out.println("First Name :"+emp1.getFirstName());

		System.out.println("Last Name :"+emp1.getLastName());

		System.out.println("Monthly Salary :"+emp1.getMonthlySalary());

		double yearlysalary=emp1.getMonthlySalary()*12;

		System.out.println("Yearly Salary:"+yearlysalary);

		double salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		

		Employee emp2=new Employee();

		emp2.setFirstName("Nikhil");

		emp2.setLastName("Rao");

		emp2.setMonthlySalary(5000);

		System.out.println("Details of employee2 : ");

		System.out.println("First Name :"+emp2.getFirstName());

		System.out.println("Last Name :"+emp2.getLastName());

		System.out.println("Monthly Salary :"+emp2.getMonthlySalary());

		yearlysalary=emp2.getMonthlySalary()*12;

		System.out.println("Yearly Salary:"+yearlysalary);

		salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		

		

	}

}