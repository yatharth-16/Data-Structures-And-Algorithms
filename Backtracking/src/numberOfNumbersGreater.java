
public class numberOfNumbersGreater {

	
	public static long NumberOfNumbersGreater(long n) {
		
		if(n<10)
		{
			return 0;
		}
		
		int numDigits = (int) Math.log10(n)+1;
		
		int digits[] = new int[numDigits];
		
		int k = numDigits-1;
		
		for(int i=0;i<numDigits;i++)
		{
			digits[k--]= (int) n %10;
			n = n/10;
			
		}
		
		long fact[] = new long[digits.length+1];
		fact[0]=1;
		
		for(int i=1;i<=digits.length;i++)
		{
			fact[i]= i*fact[i-1];
		}
		
		return NumberOfNumbersGreater(digits,0,fact);
		
	}
	
	
	private static long NumberOfNumbersGreater(int[] digits, int beginIndex, long[] fact)
	{
		
		if(beginIndex>=digits.length-1)
		{
			return 0;
		}
		
		long count=0;
		
		for(int i =beginIndex+1 ;i<digits.length;i++)
		{
			if(digits[beginIndex]<digits[i])
			{
				count+=fact[digits.length-beginIndex-1];
			}
		}
		
		count+= NumberOfNumbersGreater(digits,beginIndex+1, fact);
		
		return count;
		
	}


	public static void main(String[] args) {
		
		System.out.println(NumberOfNumbersGreater(123));

	}

}
