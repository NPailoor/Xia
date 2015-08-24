public class PlanetHex extends Hex{
	private Planet myPlanet;
	public PlanetHex(Border[] b, Ship s, Planet p) {
		myPlanet = p;
		this(b,s);
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
			return (myPlanet.supply == cargo);
		
		}
	}
	
	publi. boolean canSell(int cargo) {
		if (cargo < 0 | cargo > 5) {
			throw new IllegalArgumentException("Invalid Cargo");
		} else {
			return (myPlanet.demand == cargo);
		
		}
	}
	
	public boolean canRefuel() {
		return true;
	}
}
