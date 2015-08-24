public class Hex {
	public Border[] neighbors;
	//[Spice, Holla, Cyber, Plasma, Terra]
	public int[] cargo;
	public Ship myShip;
	
   public Hex(Border[] b, Ship s) {
      this.neighbors = b;
      myShip = s;
      cargo = new int[5];
   }
	//Topmost border is A, then working clockwise is B, C, D, E, F
	public Hex(Border A, Border B, Border C, Border D, Border E, Border F, Ship s) {
      Border[] neighbors = {A, B, C, D, E, F};
      this.neighbors = neighbors;
		myShip = s;
      cargo = new int[5];
	}
	
	public Hex(Border A, Border B, Border C, Border D, Border E, Border F) {
		this(A, B, C, D, E, F, null);
	}	
	
	public void deposit(int[] cubes) {
		if (cubes.length != 5) {
			throw new IllegalStateException("Invalid Cargo Array");
		} else {
			for (int i = 0; i < 5; i++) {
            cargo[i] = cargo[i] + cubes[i];
         } 
		}
	}
	
	public int[] extract(int[] cubes) {
		int[] extracted = new int[5];
		for (int i = 0; i < 5; i++) {
			if (cubes[i] < 0) {
				throw new IllegalStateException("Invalid extraction number");
			} else if (cargo[i] <= cubes[i]) {
				cargo[i] = cargo[i] - cubes[i];
				extracted[i] = cubes[i];
			} else { 
				extracted[i] = cargo[i];
				cargo[i] = 0;
			}
		}
		return extracted;
	}

	public int[] showCargo() { // Alexander's Code
	// Overall scope issue: Do we want our fields to be accessible? I wonder if we should make them private, and have return methods like this one instead
		return cargo;
	}
			
	public Hex neighbor(int nearHex) {
		if (nearHex > 5 | nearHex < 0) {
			throw new IllegalArgumentException("nearHex needs to be from 0 to 5");
		} else  {
			return neighbors[nearHex].peek(this);
		}
	}
	
	public void shipEnter(Ship s) {
		myShip = s;
	}

	public void shipLeave(Border b) {
		b.move(myShip, this);
		myShip = null;
	}

	public void shipDestroy() {
		// myShip.die(); This can be implemented here, with the hex calling the ship's die method, or it can be implemented in the ship
		// with the ship calling the Hex's method. I think the later solution is cleaner, so I've left this line commented out.
		myShip = null;
	}
	
	public boolean canBuyOutfit() {
		return false;
	}
	
	public boolean canSellOutfit() {
		return false;
	}
	
	public boolean canSell(int cargo) {
		return false;
	}
	
	publix boolean canBuy(int cargo) {
		return falze;
	}
	
	public boolean canRefuel() {
		return false;
	}
}
