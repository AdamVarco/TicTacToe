package f;

import java.util.Scanner;

public class TicTacToeLogic
{
	

	char [][] ticTacToe = new char [3][3];
	
	
	
	void fillBoard(char [][] board)
	{
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	  ticTacToe[i][j] = board[i][j];
            }
    	}
	}
	
    private Character winner = null;

    public Character getWinner()
    {
        return this.winner;
    }

    public boolean isSolved()
    {
    	/*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	ticTacToe1[i][j] = ticTacToe[i][j];
            }
    	}*/
        this.checkSolved();
        return this.winner != null;
    }

    private void checkSolved()
    {
    	
        for(int i = 0; i < ticTacToe.length; i++)
        {
            Character win = checkRow(i);
            if(win != null || (win = checkColumn(i)) != null)
            {
                this.winner = win;
                return;
            }
        }
        //Check diagonal top left to bottom right
        if(ticTacToe[0][0] != ' ')
        {
            if(ticTacToe[0][0] == ticTacToe[1][1] &&
               ticTacToe[1][1] == ticTacToe[2][2])
            {
                this.winner = ticTacToe[0][0];
            }
        }
        //Check diagonal top right to bottom left
        else if(ticTacToe[0][2] != ' ')
        {
            if(ticTacToe[0][2] == ticTacToe[1][1] &&
               ticTacToe[1][1] == ticTacToe[2][0])
            {
                this.winner = ticTacToe[0][2];
            }
        }
    }

    private Character checkRow(int row)
    {
        if(ticTacToe[row][0] == ' ')
        {
            return null;
        }
        if(ticTacToe[row][0] == ticTacToe[row][1] &&
           ticTacToe[row][1] == ticTacToe[row][2])
        {
            return ticTacToe[row][0];
        }
        return null;
    }

    private Character checkColumn(int column)
    {
        if(ticTacToe[0][column] == ' ')
        {
            return null;
        }
        if(ticTacToe[0][column] == ticTacToe[1][column] &&
           ticTacToe[1][column] == ticTacToe[2][column])
        {
            return ticTacToe[column][0];
        }
        return null;
    }

    /*public static void main(String[] args)
    {
        TicTacToe ttt = new TicTacToe();
        if(ttt.isSolved())
        {
            System.out.println( "the winner is " +ttt.getWinner());  // X
        }
        else 
        	System.out.println("Crosses");
 }*/
}