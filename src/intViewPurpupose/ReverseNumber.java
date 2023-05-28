package intViewPurpupose;

public class ReverseNumber {
	public static void main(String[] args) {
		int a=123456;
	    int n;
	    
	    
	    
	    
	
		while(a>0)
		{
		n=a%10;                             //123456/10=6//12345/10=5       1234/10=4    //123/10=3      //12/10=2 //1/10=0
		            //0*10+6=6 //6*10+5=65 //65*10+4=654//654*10+3=6543 //6543*10+2=65432
		    System.out.print(n); 
		a=a/10;                   //123456/10=12345//12345/10=1234//1234/10=123 //123/10=12  //12/10=1   //1/10=0
		}
		
		//
  }
}
