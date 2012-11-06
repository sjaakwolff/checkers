
public class schijf extends piece {

	public schijf(pieceColor color, field field) {
		super(color, field);

		//specific to class 'schijf': the movement
		if (color == pieceColor.BLACK)
		{
			this.addMove(1, 1);
			this.addMove(-1, 1);
		}
		else if (color == pieceColor.WHITE)
		{
			this.addMove(1, -1);
			this.addMove(-1, -1);
		}
			
	}

}
