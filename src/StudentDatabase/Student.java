package StudentDatabase;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses;
	private String studentId;
	private int CostOfCourse=600;
	private int tuitionBalance=0;
	private static int id=1001;
	
	//Constructor promt to enter name and year
	public Student()
	{
		System.out.println("Enter Student First Name");
		Scanner in =new Scanner(System.in);
		this.firstName=in.nextLine();
		System.out.println("Enter Student Last Name");
		this.lastName=in.nextLine();
		System.out.println("Enter Student Class Level\n1: First year\n2: Second Year\n3: Third Year\n4: Final Year");
		this.gradeYear=in.nextInt();
		//in.close();
		setStudentId();
		//in.close();
	}
	
	//Generate an Id
	private void setStudentId()
	{
		id++;
		this.studentId= gradeYear+""+id;
	}
	
	//Enroll in courses
	public void enroll()
	{
		System.out.print("Enter Course To Enroll (q to Quit): ");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		courses=course;
		do
		{
			if(!course.equals("q"))
			{
				if(!courses.equals(course))
					this.courses=this.courses+"\n"+course;
				tuitionBalance+=CostOfCourse;
			}
			else
			{
				System.out.println("Break");
				break;
			}
			System.out.print("Enter Course To Enroll (q to Quit): ");
			course=in.nextLine();
		}while(!course.equals("q"));
		//in.close();
	}
	
	//view balance
	public void getBalance()
	{
		System.out.println("Balance : $"+this.tuitionBalance);
	}
	
	//pay tuition fee
	public void payFee()
	{
		getBalance();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Amount To Pay : $");
		int n=in.nextInt();
		this.tuitionBalance-=n;
		System.out.println("Thank You For Your Payment Of $"+n);
		getBalance();
		//in.close();
	}
	
	//show status
	public void getInfo()
	{
		System.out.println("Name : "+firstName+" "+lastName+"\n"+"Student Id : "+studentId+"\nCourses Enrolled\n"+courses);
		getBalance();
	}

}
