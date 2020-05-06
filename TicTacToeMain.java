import java.util.Scanner;

public class TicTacToeMain {

    public static void main(String[] args) {
    	
        new TicTacToeMain();
        
    }
    
    //creates the board
    private char[][] board = new char[3][3];
    
    //checks to see if the space is occupied, if not, fill it
    private boolean canBeFilled(char[][] b, int i, int j, char c)
    {
    	
          if(b[i][j]!= 'X' && b[i][j]!='O')
          {
            		board[i][j] = c;
            		return true;
          }
          else
          {
        	  System.out.println("Space occupied, try again");
        	  return false;
          }
     }
          

   
   
    //print the board
   void printBoard(char [][] board)
    {
    System.out.println(" 0 1 2");
    System.out.println("0 " + board[0][0] + "|" + board[0][1] + "|"
            + board[0][2]);
    System.out.println("-----");
    System.out.println("1 " + board[1][0] + "|" + board[1][1] + "|"
            + board[1][2]);
    System.out.println("-----");
    System.out.println("2 " + board[2][0] + "|" + board[2][1] + "|"
            + board[2][2]);
    }

    public TicTacToeMain() {
    	TicTacToeLogic ttt = new TicTacToeLogic();
    	printBoard(board);
    	int v, h;
    	//every loop goes through each time that you could get a space that's occupied
    	boolean loop1 = true;
    	boolean loop2 = true;
    	boolean loop3 = true;
    	boolean loop4 = true;
    	boolean loop5 = true;
    	boolean loop6 = true;
    	boolean loop7 = true;
    	boolean loop8 = true;
    	
    	Scanner scan = new Scanner(System.in);
        System.out.println("X vertical");
        v = scan.nextInt();
        System.out.println("X horizontal"); 
        h = scan.nextInt();
        board[v][h] = 'X';
		printBoard(board);
		
		while(loop1)
		{
        System.out.println("O vertical");
        v = scan.nextInt();
        System.out.println("O horizontal"); 
        h = scan.nextInt();
        //checks to see if space is occupied, if it is not, while loop breaks
        if(canBeFilled(board, v, h, 'O') == true)
          loop1 = false;
       
	     printBoard(board);
		}
		
		while(loop2)
		{
		System.out.println("X vertical");
	    v = scan.nextInt();
	    System.out.println("X horizontal"); 
	    h = scan.nextInt();
	    
	    if(canBeFilled(board, v, h, 'X') == true)
	          loop2 = false;
	    
	    printBoard(board);
		}
	    
	    while(loop3)
	    {
	    System.out.println("O vertical");
        v = scan.nextInt();
        System.out.println("O horizontal"); 
        h = scan.nextInt();
        
        if(canBeFilled(board, v, h, 'O') == true)
	          loop3 = false;
       
		printBoard(board);
	    }
		
		while(loop4)
		{
		System.out.println("X vertical");
	    v = scan.nextInt();
	    System.out.println("X horizontal"); 
	    h = scan.nextInt();
	    if(canBeFilled(board, v, h, 'X') == true)
	          loop4 = false;
	  
	    printBoard(board);
		}
	    
	    
	    ttt.fillBoard(board);
        if(ttt.isSolved())
        {
            System.out.println( "the winner is " +ttt.getWinner());  // X
        }
        else
        {
        	while(loop5)
        	{
        	System.out.println("O vertical");
            v = scan.nextInt();
            System.out.println("O horizontal"); 
            h = scan.nextInt();
            
            if(canBeFilled(board, v, h, 'O') == true)
  	          loop5 = false;
            
    		printBoard(board);
        	}
    		ttt.fillBoard(board);
        	
    		if(ttt.isSolved())
            {
                System.out.println( "the winner is " +ttt.getWinner());  // X
            }
    		else
    		{
    			while(loop6)
    			{
    			System.out.println("X vertical");
    		    v = scan.nextInt();
    		    System.out.println("X horizontal"); 
    		    h = scan.nextInt();
    		   
    		    if(canBeFilled(board, v, h, 'X') == true)
    		          loop6 = false;
    		    printBoard(board);
    			}
    		    ttt.fillBoard(board);
    		    if(ttt.isSolved())
                {
                    System.out.println( "the winner is " +ttt.getWinner());  // X
                }
    		    else
    		    {
    		    	while(loop7)
    		    	{
    		    	System.out.println("O vertical");
    	            v = scan.nextInt();
    	            System.out.println("O horizontal"); 
    	            h = scan.nextInt();
    	          
    	            if(canBeFilled(board, v, h, 'O') == true)
    	  	          loop7 = false;
    	    		printBoard(board);
    		    	}
    	    		ttt.fillBoard(board);
    	    		if(ttt.isSolved())
                    {
                        System.out.println( "the winner is " +ttt.getWinner());  // X
                    }
    	    		else
    	    		{
    	    			while(loop8)
    	    			{
    	    			System.out.println("X vertical");
    	    		    v = scan.nextInt();
    	    		    System.out.println("X horizontal"); 
    	    		    h = scan.nextInt();
    	    		    
    	    		    if(canBeFilled(board, v, h, 'X') == true)
    	    		          loop8 = false;
    	    		    printBoard(board);
    	    			}
    	    		    ttt.fillBoard(board);
    	    		    if(ttt.isSolved())
    	                {
    	                    System.out.println( "the winner is " +ttt.getWinner());  // X
    	                }
    	    		    else
    	    		    	System.out.println("Crosses");
    	    		}
    	    		
    		    }
    		}
        	
        }

     }
}
