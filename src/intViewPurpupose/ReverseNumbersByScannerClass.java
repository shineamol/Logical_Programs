package intViewPurpupose;

import java.util.Scanner;

public class ReverseNumbersByScannerClass {
	public void method()
	
	
	
	{
		Scanner a=new Scanner(System.in);
		
		System.out.println("enter integer value");
		int n=a.nextInt();
		int t;
		int s=0;
		while(n>0)
		{
			t=n%10;
			s=s*10+t;
			n=n/10;
		}
		System.out.println("Reverse no. is:"+s);
		a.close();
	}
	public static void main(String[] args) {
		ReverseNumbersByScannerClass obj=new ReverseNumbersByScannerClass();
		obj.method();
	}

}
