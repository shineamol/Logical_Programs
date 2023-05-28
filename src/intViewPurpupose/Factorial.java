package intViewPurpupose;

import java.util.Scanner;

public class Factorial {
	public void method()
	{
		
		
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter any integer value to find factorial");
		int a=s.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;  //1*1=1   1*2=2  2*3=6  6*4=24   24*5=120
		}
		System.out.println("factorial is:"+fact);
		s.close();
	}
	public static void main(String[] args) {
		Factorial obj=new Factorial();
		obj.method();
		
	}

}
