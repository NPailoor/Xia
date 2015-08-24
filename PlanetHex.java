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
	
	public boolean canBuy(int cargo) {
		if (cargo < 0 | cargo > 5) {
			throw new IllegalArgumentException("Invalid Cargo");
		} else {
			return (myPlanet.supply == cargo && this.canBuy);
		
		}
	}
	
	publi. boolean canSell(int cargo) {
		if (cargo < 0 | cargo > 5) {
			throw new IllegalArgumentException("Invalid Cargo");
		} else {
			return (myPlanet.demand == cargo && this.canSell);
		
		}
	}
	
	public boolean canRefuel() {
		return true;
	}
}
