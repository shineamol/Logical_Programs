package intViewPurpupose;

public class DecrementPattern {
	public void method()
	{
		int a,b;
		for(a=1;a<=5;a++)  //for rows
		{	
			
		for(b=5;b>=a;b--)  //for columns
		{
		
		System.out.print("* ");
	}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		DecrementPattern obj=new DecrementPattern();
		obj.method();
		
	}

}
