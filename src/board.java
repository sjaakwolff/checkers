
public class board {
	
	public field[][] board = new field[12][12];
	private int turn;	
	
	//constructor
	public board()
	{
		this.turn = 0;
		
		for (int i = 0; i < 12; i++)
		{
			for (int j = 0; j < 12; j++)
			{
				this.board[i][j] = new field(i,j);
				
				// if a field is on the edge of the 12x12 board, it is not accessible by pieces
				if ((i == 0 || i == 11) || (j == 0 || j == 11))
					this.board[i][j].setOnBoard(false);
			}
		}
		this.board[0][0].addPiece(new piece(pieceColor.BLACK, this.board[0][0]));
	}	
	
	public void printBoard()
	{
		for(int i = 0; i < 12; i++)
		{
			for (int j = 0; j < 12; j++)
			{
				if (this.board[i][j].hasPiece())					
					System.out.print(i + " " + j + " : occupied!");
				else 
					System.out.print(i + " " + j + " : emtpy!");						
			}
			System.out.println("\n");
		}
	}
}
