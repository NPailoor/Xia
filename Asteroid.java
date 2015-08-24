 public class Asteroid {
 	
	Random d20;

	public Hex(Border A, Border B, Border C, Border D, Border E, Border F) {
		super(A, B, C, D, E, F, null);
		d20 = new Random();
	}	
	
	public void shipEnter(Ship s) {
		int diceRoll = d20.nextInt(20) + 1;
		if (diceRoll > 11) {
			myShip = s;
		}
		else {
			s.damage(diceRoll);
		}
}
