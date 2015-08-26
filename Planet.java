public class Planet {
  int[] canBuy;
  int[] can Sell;
  String name;
  
  public Planet(int[] canBuy, int[] canSell, String name) {
    this.canBuy = canBuy;
    this.canSell = canSell;
    this.name = name;
  }
  
  public String toString() { // all of our objects will need a toString method probably
    return name;
  }
}
