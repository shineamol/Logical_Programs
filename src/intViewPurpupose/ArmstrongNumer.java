package intViewPurpupose;

public class ArmstrongNumer {
	public static void main(String []args)
	{
 int x=153;
 int a=x;
 int sum=0;
 
 
 while(a>0)
 {
	 
	 int n=a%10;         //n=153/10=3    //15/10=1          //1/10=0
	 sum=(sum+(n*n*n)); //0+27           //27+125=152       //152+1
	 a=a/10;            //15             //15/10=1          //1/10=0
 }
 
 if(sum==x)
 {
	 System.out.println("no is armstrong");
 }
 else
 {
	 System.out.println("no is not armstrong");
 }
}
}
