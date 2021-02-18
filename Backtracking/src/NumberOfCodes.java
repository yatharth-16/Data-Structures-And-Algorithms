import java.util.Scanner;

public class NumberOfCodes {
	
	
	public static int numCodes(int[] a , int size)
	{
		if(size==0)
		{
			return 1;
		}
		
		if(size==1)
		{
			return 1;
		}
		
		int output  = numCodes(a,size-1);
		
		if(a[size-2]*10+a[size-1]<=26)
		{
			output+= numCodes(a,size-2);
		}
		
		return output;
	}
	
	public static int numCodes(int[] a , int size,int[] storage)
	{
		if(size==0)
		{   
			return 1;
		}
		
		if(size==1)
		{   
			return 1;
		}
		
		if(storage[size]!=0)
		{
			return storage[size];
		}
		
		int output  = numCodes(a,size-1);
		
		if(a[size-2]*10+a[size-1]<=26)
		{
			output+= numCodes(a,size-2);
		}
		storage[size]=output;
		
		return output;
	}
	
	
	public static int numCodesDP(int[] a ,int size)
	{ 
		int storage[] = new int[size+1];
		
		storage[0]=1;
		storage[1]=1;
		
		for(int i=2;i<=size;i++)
		{
			storage[i]=storage[i-1];
			
			if(a[i-2]*10+a[i-1]<=26)
			{
				storage[i]+= storage[i-2];
			}
			
			
		}
		return storage[size];
	}
	

	public static void main(String[] args) {
		
		int a[] = {2,5,1,0,4};
		//System.out.println(numCodes(a,a.length));
		
		char z = '1';
		
		System.out.println(z+'0');
	}

}
