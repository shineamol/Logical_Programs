package intViewPurpupose;

public class Print1_10withoutforloop {
public void numbers(int a)
{
if(a<=10)
{
	System.out.println(a);
	
	numbers(a+1);
}
}
public static void main(String[] args) {
	Print1_10withoutforloop obj=new Print1_10withoutforloop();
	obj.numbers(1);
}
}
