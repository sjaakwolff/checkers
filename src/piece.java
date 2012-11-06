import java.util.Iterator;
import java.util.List;

public class piece {
	
	public pieceClass pieceClass;
	

	public pieceColor pieceColor;
	public field pieceField;
	private List<move> moves;
		
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
	
	public void addMove(int x, int y)
	{
		move tmp = new move(x, y);
		this.moves.add(tmp);
	}
	
	public List<move> getMoves()
	{
		return this.moves;
	}
	
	public pieceClass getPieceClass() {
		return pieceClass;
	}
}
