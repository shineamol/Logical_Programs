package intViewPurpupose;

public class SumOfReverseNumber {
public static void main(String[] args) {
	int x=654321;
	int a=x;
		int sum = 0;

		while(a>0)
		{
	
		sum=sum+a%10;

		a=a/10;
	
	}
		System.out.println(sum);
}
}
