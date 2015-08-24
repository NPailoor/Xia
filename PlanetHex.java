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
	public boolean canBuy() {
		return true;
	}
	
	public boolean canSell() {
		return true;
	}
	public boolean planet() {
		return myPlanet;
	}
	
}
