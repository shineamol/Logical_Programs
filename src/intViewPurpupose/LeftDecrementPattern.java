package intViewPurpupose;

public class LeftDecrementPattern {
	public void method()
	{
		int a;
		int b;
		
		
		for(a=1;a<=5;a++)   //for rows
		{
			for(b=1;b<=a;b++) //for columns
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		LeftDecrementPattern obj=new LeftDecrementPattern();
		obj.method();
		
	}

}
