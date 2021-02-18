
public class NQueens {

	public static void placeNQueens(int n)
	{
		int board[][] = new int[n][n];
		
		placeQueens(board,n,0);
	}
	
	public static void placeQueens(int [][] board,int n, int row) {
		
		if(row==n)
		{
			//Valid row Configration
			
			for(int i=0;i<n ;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(board[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		for(int j=0; j<n;j++)
		{
			if(isSafe(board,row,j))
			{
				board[row][j]=1;
				placeQueens(board,n,row+1);
				board[row][j]=0;
				
			}
		}
		
		//Check for all columns 
		//Check if its safe to place the queen or not
		//If its safe then place the Queen and move to next row
		
	}

	public static boolean isSafe(int[][] board, int row, int col) {
		
		int n = board.length;
				
		for(int i= row-1, j =col-1 ;i>=0&&j>=0;i--,j--)
		{
			if(board[i][j]==1)
			{
				return false;
			}
		}
		for(int i= row+1, j =col+1 ;i<n&&j<n;i++,j++)
		{
			if(board[i][j]==1)
			{
				return false;
			}
		}
		
		for(int i= row-1, j =col+1 ;i>=0&&j<n;i--,j++)
		{
			if(board[i][j]==1)
			{
				return false;
			}
		}
		
		for(int i= row+1, j =col-1 ;i<n&&j>=0;i++,j--)
		{
			if(board[i][j]==1)
			{
				return false;
			}
		}
		
		for(int i=row-1;i>=0;i--)
		{
			if(board[i][col]==1)
			{
				return false;
			}
		}
		
		for(int i=row+1;i<n;i++)
		{
			if(board[i][col]==1)
			{
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		
		
	}
}
