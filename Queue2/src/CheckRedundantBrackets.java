import java.util.Stack;

public class CheckRedundantBrackets {
	
	
	
	public static boolean checkRedundantBrackets(String input)
	{
//		Stack<Character> stack = new Stack<>();
//		
//		
//		for(int i=0;i<str.length();i++)
//		{
//			
//			if(str.charAt(i)!=')')
//			{
//				stack.push(str.charAt(i));
//			}
//			else
//			{   
//				int c=0;
//				while(stack.peek()!='(')
//				{   
//					stack.pop();
//					c++;
//				}
//				
//				if(c==0)
//				{
//					return true;
//				}
//				stack.pop();
//			}
//			
//		}
//		
//		return false;
		
		Stack<Character> s = new Stack<>();
        
        int c=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)!=')')
            {
                s.push(input.charAt(i));
            }
            else
            {
                c=0;
                while(s.peek()!='(')
                {
                    int t = s.pop();
                    c++;
                }
                
                if(c==0)
                {
                    return true;
                }
                else
                {
                    int t = s.pop();
                }
            }
        }
        return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s="a+(b)+c ";
		
		
		
		System.out.println(checkRedundantBrackets(s));
	}

}
