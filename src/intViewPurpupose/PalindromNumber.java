package intViewPurpupose;

public class PalindromNumber {
	public static void main(String[] args) {
		int x=123325;
		int a=x;
		int n;
		
		
		int s=0;
				while(a>0)
				{
					n=a%10;     //123321/10=1,
					s=s*10+n; //1
					a=a/10; //12332
				
				}
				System.out.println(s);
				if(s==x) 
				{
					System.out.println("palindrom number");
				}
				else
				{
					System.out.println("not palindrom number");
				}
		
	}

}
