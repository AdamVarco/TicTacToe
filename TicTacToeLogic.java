public class TicTacToeLogic {
	
	 private Character winner = null;

	    public Character getWinner()
	    {
	        return this.winner;
	    }
	    
	    public boolean isSolved(char [][] board)
	    {
	        this.win(board);
	        return this.winner != null;
	    }
	
	boolean win(char board[][]) {
	     for (int i = 0; i < 3; ++ i) {
	        if ((board[i][0] != 0) && (board[i][0] == board[i][1]) 
	                        && (board[i][1] == board[i][2])) {
	            winner = board[i][0];
	            return true;
	        }
	        if ((board[0][i] != 0) && (board[0][i] == board[1][i]) 
	                        && (board[1][i] == board[2][i])) {
	            winner = board[0][i];
	            return true;
	        }            
	    }
	    if ((board[1][1] != 0) && (board[0][0] == board[1][1]) 
	                        && (board[1][1] == board[2][2])) {
	        winner = board[1][1];
	        return true;
	    }
	    if ((board[1][1] != 0) && (board[0][2] == board[1][1]) 
	                        && (board[1][1] == board[2][0])) {
	        winner = board[1][1];
	        return true;
	    }        
	    return false;
	}
}

