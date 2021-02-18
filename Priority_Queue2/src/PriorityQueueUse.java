import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MinPQComparator implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2)
	{
		if(o1<o2)            // if compare(o1,o2) is less than zero only then PQ swaps
		{
			return -1;
		}
		else if(o1>o2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

class MaxPQComparator implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2)
	{
		if(o1<o2)
		{
			return 1;
		}
		else if(o1<o2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}


class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {

         if(o1.length()<o2.length())
         {
        	 return -1;
         }
         else if(o1.length()>o2.length())
         {
        	 return +1;
         }
         else
         {
        	 return 0;
         }
		
	}
	
}

public class PriorityQueueUse {
	

	
	public static void printKLargest(int a[],int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		
		int i=0;
		
		for( i=0;i<k;i++)
		{
			pq.add(a[i]);
		}
		
		for(;i<a.length;i++)
		{
			int min = pq.element();
			if(min<a[i])
			{
				pq.remove();
				pq.add(a[i]);
			}
		}
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
	}
	
	public static void  sortKSorted(int arr[], int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		  
		pq.isEmpty()
		int i=0;
		
		for(i=0;i<k;i++)
		{
			pq.add(arr[i]);
		}
		
		for(;i<arr.length;i++)
		{
			arr[i-k]=pq.remove();
			pq.add(arr[i]);	
		}
		
		for(int j=arr.length-k;j<arr.length;j++)
		{
			arr[j]=pq.remove();
		}
		
		
	}


private static void InsertIntoVirtualHeap(int[] arr, int i) {
	// TODO Auto-generated method stub
	
      int childIndex =i;
      int parentIndex = (childIndex-1)/2;
      
      while(childIndex>0)
      {  
    	  if(arr[childIndex]<arr[parentIndex])
    	  {
    		  int temp = arr[childIndex];
    		  arr[childIndex]= arr[parentIndex];
    		  arr[parentIndex]=temp;
    		  childIndex=parentIndex;
    		  parentIndex = (childIndex-1)/2;
    	  }
    	  else
    	  {
    		  return;
    	  }
      }
	
	
}

private static int removeMinFromVirtualHeap(int[] arr, int heapSize) {
	
	  int temp = arr[0];
	  arr[0]= arr[heapSize-1];
	  heapSize--;
	  
	  int index=0;
	  int leftChildIndex= 2*index+1;
	  int rightChildIndex= 2*index+2;
	  
	  while(leftChildIndex<heapSize)
	  {
		  int minIndex=index;
		  
		  if(arr[leftChildIndex]<arr[minIndex])
		  {
			  minIndex = leftChildIndex;
					  
		  }
		  
		  if(rightChildIndex<heapSize&&arr[rightChildIndex]<arr[minIndex])
		  {
			  minIndex = rightChildIndex;
					  
		  }
		  
		  if(minIndex!=index)
		  {
			  int temp1=arr[index];
			  
			  arr[index]= arr[minIndex];
			  
			  arr[minIndex]=temp1;
			  
			  index = minIndex;
			  
			  leftChildIndex= 2*index+1;
			  rightChildIndex= 2*index+2;
			  
		  }
		  else
		  {
			  break;
		  }
	  }
	  
	  return temp;
	  
}



	public static void main(String[] args) {
		
		
		
		String[] arr = {"this","at","a","their","queues"};
		
		StringLengthComparator stringComparator = new StringLengthComparator();
		
		PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
		
		
		
		
		//	MinPQComparator minComparator = new MinPQComparator();	
		//MaxPQComparator maxComparator = new MaxPQComparator();
		//PriorityQueue<Integer> pq = new PriorityQueue<>(maxComparator);
		
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		//int arr[] = {9,1,0,4,7,3};
		
		for(int i=0;i<arr.length;i++)
		{
			pq.add(arr[i]);
		}
		
		//System.out.print(pq.element());
		
		while(!pq.isEmpty())
		{
			System.out.print(pq.remove()+" ");
		}
		
//		int a[] = {2,15,8,9,12,13,20};
//		
//		printKLargest(a, 3);
		
		
	
		
		
			
		
		
//		Priority_Queue pq = new Priority_Queue();
//		
//		int arr[] = {5,1,9,2,0};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			pq.insert(arr[i]);
//		}
//		
//		while(!pq.isEmpty())
//		{
//			try {
//				System.out.print(pq.removeMin()+" ");
//			} catch (PriorityQueueExcepton e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
//		int arr[] = {5,1,9,2,0,6};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			InsertIntoVirtualHeap(arr,i);
//		}
//		
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[arr.length-1-i]=removeMinFromVirtualHeap(arr, arr.length-i);
//		}
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
//		
//		
		
//		int arr[] = {2,4,1,9,6,8};
//		
//		int k=3;
//		
//		sortKSorted(arr, k);
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		
		
	}

	

}
