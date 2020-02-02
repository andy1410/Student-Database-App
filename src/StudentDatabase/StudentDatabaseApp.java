package StudentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number Of Student");
		int n=in.nextInt();
		Student s[]=new Student[n];
		//in.close();
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			s[i].enroll();
			s[i].payFee();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Serial Number : "+(i+1));
			s[i].getInfo();
		}
		//in.close();

	}

}
