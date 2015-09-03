public class Player {
  public int vp;
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
  
  public void changeShip(Ship newShip) {
    myShip = ship;
  }
  
  public string toString() {
    return name;
  }
  
  public void takeTurn() {
    // Do stuff. Someone who knows how to accept console info in java should write this
  }
}
