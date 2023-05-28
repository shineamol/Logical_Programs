package intViewPurpupose;

public class PalindromBetweenNo {
	public static void main(String[] args) {

	int x=500;
	int a=x;
	int n;
	
	int s=0;
	int y=1000;
	for(x=500;x<=y;x++)
	{
	a=x;
			while(a>0)
			{
				n=a%10;    
				s=s*10+n; 
				a=a/10; 
			}
		
			if(s==x) 
			{
				System.out.println(x);
			}
			s=0;
}
}
}
