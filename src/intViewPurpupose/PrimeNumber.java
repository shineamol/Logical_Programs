package intViewPurpupose;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer value:");
		
		int num=s.nextInt();
		
		int i;
		int temp=0;
		for(i=2;i<=num-1;i++) //execute till the number is less than or equal to two
		{
			if(num%i==0) //checking the modulus value of given number
			{
				System.out.println("divisible by:"+i);
				temp=temp+1;
				s.close();
			}
		}
		if(temp==0)  //check the temp value is 0 or not
		{
			System.out.println(num+"is a prime number");  //print prime number
		}
		else
		{
			System.out.println(num+"is not prime number"); //print not a prime number
		}
	}

}
