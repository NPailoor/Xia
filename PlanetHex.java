public class PlanetHex extends Hex{
	private Planet myPlanet;
	private boolean canBuy;
	private boolean canSell;
	public PlanetHex(Border[] b, Ship s, Planet p, boolean canBuy, boolean canSell) {
		myPlanet = p;
		this.canBuy = canBuy;
		this.canSell = canSell;
		this(b,s);
   	}
   	
   	public PlanetHex(Border[] b, Ship s, Planet p) {
   		this(b, s, p, false, false);
   	}
	//Topmost border is A, then working clockwise is B, C, D, E, F
	public PlanetHex(Border A, Border B, Border C, Border D, Border E, Border F, Ship s, Planet p) {
	      myPlanet = p;
	      this(A,B,C,D,E,F,s)
	}
	
	public PlanetHex(Border A, Border B, Border C, Border D, Border E, Border F, Planet p) {
		myPlanet = p;
		this(A, B, C, D, E, F, null);
	}
	public boolean canBuyOutfity() {
		return true;
	}
	
	public boolean canSellOutfit() {
		return true;
	}
	public boolean planet() {
		return myPlanet;
	}

	public boolean canBuy(int[] cargo) { //[Spice, Holla, Cyber, Plasma, Terra]
		if (cargo.length() > 5) {
			throw new IllegalArgumentException("Invalid Cargo");
		} else if (max(abs(cargo)) == 0) { // I think you can do this in Java?. This handles the empty case
			return false;
		} 
		else {
			for (int i = 0; i < cargo.length(); i++) {
				if (cargo[i] < 0) {
					throw new IllegalArgumentException("Invalid Cargo");
				}
				else if (cargo > 0) {
					if (myPlanet.canBuy[i] == 0) {
						return false;
					}
				}
			}
		
		}
		return true; // no problem, the sale can go through
	}

	
	public boolean canSell(int[] cargo) { //[Spice, Holla, Cyber, Plasma, Terra]
		if (cargo.length() > 5) {
			throw new IllegalArgumentException("Invalid Cargo");
		} else if (max(abs(cargo)) == 0) { // I think you can do this in Java?. This handles the empty case
			return false;
		} 
		else {
			for (int i = 0; i < cargo.length(); i++) {
				if (cargo[i] < 0) {
					throw new IllegalArgumentException("Invalid Cargo");
				}
				else if (cargo > 0) {
					if (myPlanet.canSell[i] == 0) {
						return false;
					}
				}
			}
		
		}
		return true; // no problem, the sale can go through
	}	
	public boolean canRefuel() {
		return true;
	}
}
