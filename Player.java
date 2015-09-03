public class Player {
  public int vp;
  public int target;
  public Ship myShip;
  public String name;
  
  public Player(int target, Ship ship, String name) {
    this.target = target;
    myShip = ship;
    vp = 0;
    this.name = name;
  }
  
  public void getVp(int gain) {
    vp = vp + gain;
  }
  
  public boolean hasWon() {
    return (vp >= target);
  }
  
  public void changeShip(Ship newShip) {
    myShip = ship;
  }
  
  public string toString() {
    return name;
  }
  
  public void takeTurn() {
    // Do stuff
  }
}
