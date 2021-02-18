
public class ReverseQueue {

	
	
	
	
	
	
	public static void reverseQueue(QueueUsingLL<Integer> q) throws QueueEmptyException {
		
        
       
         if(q.size==0||q.size==1 )
         {
             return;
         }
        
        int data = q.dequeue();
        
        reverseQueue(q);
        
         q.enqueue(data);
        
        
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		
		for(int i=1;i<=5;i++)
		{
			queue.enqueue(i);
		}
		
		try {
			reverseQueue(queue);
		} catch (QueueEmptyException e) {
			
		}
		
		while(!queue.isEmpty())
		{
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				
			}
		}
	}

}
