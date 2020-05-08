import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        boolean loop = true;
        String s;
        while(loop)
        {
		new TicTacToeMain();
		System.out.println("Press 1 to coninue, press any other key to exit");
		s = scan.next();
		if(!s.equals("1"))
			loop = false;
        }
	}

	

	// checks to see if the space is occupied, if not, fill it
	private boolean canBeFilled(char[][] b, String i, String j, char c, char v) {
		String isDigit = "\\d+";
		int x, y;
		boolean inRange = false;
		if (i.matches(isDigit)) {
			x = Integer.parseInt(i);
			if (x >= 0 && x <= 2)
				inRange = true;
			else {
				System.out.println("Integer value is not in range, please pick an integer between 0-2");
				inRange = false;
				return false;
			}
		} else {
			System.out.println("Wrong Character; Enter an Integer 0-2");
			return false;
		}

		if (j.matches(isDigit)) {
			y = Integer.parseInt(j);

			if (x >= 0 && x <= 2)
				inRange = true;
			else {
				System.out.println("Integer value is not in range, please pick an integer between 0-2");
				inRange = false;
				return false;
			}
		} else {
			System.out.println("Wrong Character; Enter an Integer 0-2");
			return false;
		}
		//checks to see if its the first X entered
		if (v == 'g') {
			b[x][y] = c;
			return true;
		} else {
			if (b[x][y] != 'X' && b[x][y] != 'O') {
				b[x][y] = c;
				return true;
			} else {
				System.out.println("Space occupied, try again");
				return false;
			}

		}
	}

	// print the board
	void printBoard(char[][] board) {
		System.out.println("     COLUMN");
		System.out.println("      0 1 2");
		System.out.println("     -------");
		System.out.println("R  0 |" + board[0][0] + "|" + board[0][1] + "|" + board[0][2]+ "|");
		System.out.println("------------");
		System.out.println("O  1 |" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|");
		System.out.println("------------");
		System.out.println("W  2 |" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|");
	}

	public TicTacToeMain() {

		TicTacToeLogic ttt = new TicTacToeLogic();
		// creates the board
		char[][] board = new char[3][3];

		String v, h;

		// every loop goes through each time that you could get a space that's occupied
		boolean loop = true;
		boolean loop1 = true;
		boolean loop2 = true;
		boolean loop3 = true;
		boolean loop4 = true;
		boolean loop5 = true;
		boolean loop6 = true;
		boolean loop7 = true;
		boolean loop8 = true;
		Scanner scan = new Scanner(System.in);

		printBoard(board);

		while (loop) {

			System.out.println("player X pick a ROW");
			v = scan.next();
			System.out.println("player X pick a COLUMN");
			h = scan.next();
			if (canBeFilled(board, v, h, 'X', 'g') == true)
				loop = false;
			printBoard(board);
		}

		while (loop1) {
			System.out.println("player O pick a ROW");
			v = scan.next();
			System.out.println("player O pick a COLUMN");
			h = scan.next();
			// checks to see if space is occupied, if it is not, while loop breaks
			if (canBeFilled(board, v, h, 'O', 'F') == true)
				loop1 = false;

			printBoard(board);
		}

		while (loop2) {
			System.out.println("player X pick a ROW");
			v = scan.next();
			System.out.println("player X pick a COLUMN");
			h = scan.next();

			if (canBeFilled(board, v, h, 'X', 'F') == true)
				loop2 = false;

			printBoard(board);
		}

		while (loop3) {
			System.out.println("player O pick a ROW");
			v = scan.next();
			System.out.println("player O pick a COLUMN");
			h = scan.next();

			if (canBeFilled(board, v, h, 'O', 'F') == true)
				loop3 = false;

			printBoard(board);
		}

		while (loop4) {
			System.out.println("player X pick a ROW");
			v = scan.next();
			System.out.println("player X pick a COLUMN");
			h = scan.next();
			if (canBeFilled(board, v, h, 'X', 'F') == true)
				loop4 = false;

			printBoard(board);
		}

		if (ttt.isSolved(board)) {
			System.out.println("the winner is " + ttt.getWinner());
		} else {
			while (loop5) {
				System.out.println("player O pick a ROW");
				v = scan.next();
				System.out.println("player O pick a COLUMN");
				h = scan.next();

				if (canBeFilled(board, v, h, 'O', 'F') == true)
					loop5 = false;

				printBoard(board);
			}

			if (ttt.isSolved(board)) {
				System.out.println("the winner is " + ttt.getWinner()); // X
			} else {
				while (loop6) {
					System.out.println("player X pick a ROW");
					v = scan.next();
					System.out.println("player X pick a COLUMN");
					h = scan.next();

					if (canBeFilled(board, v, h, 'X', 'F') == true)
						loop6 = false;

					printBoard(board);
				}

				if (ttt.isSolved(board)) {
					System.out.println("the winner is " + ttt.getWinner()); // X
				} else {
					while (loop7) {
						System.out.println("player O pick a ROW");
						v = scan.next();
						System.out.println("player O pick a COLUMN");
						h = scan.next();

						if (canBeFilled(board, v, h, 'O', 'F') == true)
							loop7 = false;
						printBoard(board);
					}

					if (ttt.isSolved(board)) {
						System.out.println("the winner is " + ttt.getWinner()); // X
					} else {
						while (loop8) {
							System.out.println("player X pick a ROW");
							v = scan.next();
							System.out.println("player X pick a COLUMN");
							h = scan.next();

							if (canBeFilled(board, v, h, 'X', 'F') == true)
								loop8 = false;

							printBoard(board);
						}

						if (ttt.isSolved(board)) {
							System.out.println("the winner is " + ttt.getWinner()); // X
						} else
							System.out.println("Crosses");
					}

				}
			}

		}

	}

}

