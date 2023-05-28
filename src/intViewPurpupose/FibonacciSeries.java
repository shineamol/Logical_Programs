package intViewPurpupose;

public class FibonacciSeries {
	public static void main(String[] args) {
	int a=0;
	int b=1;
	
	int i=0;
	
	
	int c;
	int n=7;
	while(i<=n)
	{
		c=a+b; //add the value of a+b
		a=b;  //swap the value of b in a
		b=c;  //swap the value of c in b
		i++;
		System.out.print(" "+c); //print the value of c
	}

}
}
 