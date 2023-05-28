package intViewPurpupose;

public class RightAngleTriangle {
	public void method()
	{
		int a;
		int b;
		int c;
		
		for(a=1;a<=5;a++)
		{
			for(c=5;c>=a;c--)
			{
				System.out.print("  ");
			}
			for(b=1;b<=a;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RightAngleTriangle obj=new RightAngleTriangle();
		obj.method();
	}

}
