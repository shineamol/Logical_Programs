package intViewPurpupose;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		for(int i=1; i<=1;) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter year");
		int leap=s.nextInt();
		
		//int module;
		if(leap%4==0) 
		{
			System.out.println(leap+" is leap year");
		}
		else 
		{
			System.out.println(leap+" is not leap year");
		}
		s.close();
		}

	}

}
