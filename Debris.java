import java.util.Random;

public class Debris extends Hex {
	
	Random d20;

	public Hex(Border A, Border B, Border C, Border D, Border E, Border F) {
		super(A, B, C, D, E, F, null);
		d20 = new Random();
	}	
	
	public void shipEnter(Ship s) {
		diceRoll = d20.nextInt(20) + 1;
		if (diceRoll > 3) {
			myShip = s;
		}
		else {
			s.die();
		}
	}
}
