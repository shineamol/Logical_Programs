package intViewPurpupose;

public class PrimeNumber100To200 {
	public static void main(String[] args) {
		int n=200;
		int i,j,temp=0;
		System.out.println("prime numbers are:");
		
		
		for(i=100;i<=n;i++)
		{
			for(j=2;j<=i-1;j++)
			{
				if(i%j==0)  //checking to modulus value equal to zero
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(" "+i); //print prime number
			}
			else
			{
				temp=0;
			}
		}
	}

}
