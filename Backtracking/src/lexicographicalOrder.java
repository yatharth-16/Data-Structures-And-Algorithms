
public class lexicographicalOrder {
	
	
	
	public static void LexicographicalOrder(int num)
	{
		for(int i=1;i<=9;i++)
		{
			print(i,num);
		}
	}
	
	private static void print(int numSoFar, int n) {
		
		 if(numSoFar>n)
		 {
			 return;
		 }
		 
		 System.out.println(numSoFar);
		 
		 for(int i=0;i<=9;i++)
		 {
			 print(numSoFar*10+i,n);
		 }
		
	}
	
	
	public static void lexico(int n)
	{
		for(int i=1;i<10;i++)
		{
			print(i,n);
		}
	}
	
	public static void printLexico(int numSofar , int n)
	{
		if(numSofar>n)
		{
			return;
		}
		
		System.out.println(numSofar);
		
		for(int i=0;i<10;i++)
		{
			printLexico(10*numSofar+i, n);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		LexicographicalOrder(20);
		
	}

}
