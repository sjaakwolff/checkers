
public class piece {
	
	//public pieceClass pieceClass;
	public pieceColor pieceColor;
	public field pieceField;
	
	//constructor
	public piece(pieceColor color, field field)
	{
		this.pieceColor = color;
		this.pieceField = field;		
	}
	
	public int[] getPos()
	{
		int pos[] = new int[2];
		
		pos[0] = this.pieceField.posX;
		pos[1] = this.pieceField.posY;
		
		return pos;
	}
	
	
}
