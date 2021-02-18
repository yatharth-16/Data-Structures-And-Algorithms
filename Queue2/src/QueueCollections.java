import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollections {
	
	
	

	public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> q = new LinkedList<>();
        
        int t=0;
        
        for(int i=0;i<input.length;i++)
        {
            pq.add(input[i]);
            q.add(i);
        }
        
              while(!((pq.peek()==k)&&(q.peek()==k)))
              {
                  
                   if(pq.peek()==q.peek())
                   {  
                       t++;
                       pq.remove();
                       q.remove();
                   }
                  else
                  {
                      q.remove();
                      q.add();
                  }
            
            
              }
	
}
  
	
	public static void main(String[] args) {
		
		
		Queue<Integer> queue = new LinkedList<>() ;
		
		
		
		queue.add(2);
		queue.add(4);
		queue.poll();  // remove an element from a list
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
		queue.peek(); //Tells what is the element
		
		queue.isEmpty();
		
		for(int i=0;i<4;i++)
		{
			queue.add(i);
		}
		
	}
}
