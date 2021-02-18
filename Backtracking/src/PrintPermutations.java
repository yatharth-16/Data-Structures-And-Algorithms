import java.util.Scanner;

public class PrintPermutations {

	
	private static void printPermutations(String str, String ansSoFar) {
		
		
		if(str.length()==0)
		{
			System.out.println(ansSoFar);
		}
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			String left = str.substring(0,i);
			String right = str.substring(i+1,str.length());
			printPermutations(left+right, ansSoFar+ch);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str ="abc";
		printPermutations(str,"");
		
				
				
		
	}

	

}
