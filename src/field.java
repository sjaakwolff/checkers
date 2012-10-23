
public class field {
	
	public piece piece;
	public int posX, posY;
	
	//constructor
	public field(int x, int y)
	{
		this.piece = null;
		this.posX = x; this.posY = y;
	}
	
	public boolean hasPiece()
	{
		if (this.piece != null)
		{
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	public void addPiece(piece p)
	{
		if (this.hasPiece())
		{
			throw new IllegalStateException("field.receivePiece: field already contains a piece!");
		}
		else
		{
			this.piece = p;
		}
	}
	
	public void removePiece()
	{
		if (this.hasPiece())
		{
			throw new IllegalStateException("field.removePiece: field was already empty!");
		}
		else
		{
			this.piece = null;			
		}
	}
	
	public pieceColor getPieceColor()
	{

		return null;		
	}
	

}
