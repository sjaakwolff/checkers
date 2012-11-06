
public class schijf extends piece {

	public schijf(pieceColor color, field field, pieceClass pieceClass) {
		super(color, field);
		
		this.pieceClass = pieceClass;

		//specific to class 'schijf': the movement
		if (color == pieceColor.BLACK)
		{
			//black pieces can only move 'down' (y=1)
			this.addMove(1, 1);
			this.addMove(-1, 1);
		}
		else if (color == pieceColor.WHITE)
		{
			//white pieces can only move 'up' (y= -1)
			this.addMove(1, -1);
			this.addMove(-1, -1);
		}
			
	}

}
