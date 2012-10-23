
public class board {
	
	public field[][] board = new field[10][10];
	private int turn;	
	
	//constructor
	public board()
	{
		this.turn = 0;
		
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				this.board[i][j] = new field(i,j);
			}
		}
		this.board[0][0].addPiece(new piece(pieceColor.BLACK, this.board[0][0]));
	}	
	
	public void printBoard()
	{
		for(int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
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
