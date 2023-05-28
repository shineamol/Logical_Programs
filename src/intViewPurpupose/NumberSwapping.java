package intViewPurpupose;

public class NumberSwapping {
	public static void main(String[] args) {
		int a=23;
		int b=11;
		int c;
		
		a=a-b;  //without third variable
		b=a+b;
		a=b-a;
		
		//c=a;
		//a=b;
		//b=c;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
