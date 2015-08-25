import java.util.*;
public class Tile {
  public Hex[] topLeft; // 3 hexs, as in here https://boardgamegeek.com/camo/87972fe60db21770a52d4793e0d67f75599f64c7/687474703a2f2f63662e6765656b646f2d696d616765732e636f6d2f696d616765732f706963323237353337355f6d642e706e67
  // note: That is a fanmade tile that we don't need to implement.
  public Hex[] middleLeft; // 4 hexs
  public Hex[] middle; // 5 hexs
  public Hex[] middleRight; // 4 hexs
  public Hex[] bottomRight; // 3 hexs
  public Hex[] edges; // For the getHex method
  public int[] tileBoundary; // used to line up tiles;
  
  public Tile(Hex[] topLeft, Hex[] middleLeft, Hex[] middle, Hex[] middleRight, Hex[] bottomRight) {
    this.topLeft = topLeft;
    if (topLeft.length() != 3) {
      throw new IllegalStateException("Wrong Tile Geometry");
    }
    this.middleLeft = middleLeft;
    if (middleLeft.length() != 4) {
      throw new IllegalStateException("Wrong Tile Geometry");
    }
    this.middle = middle;
    if (middle.length() != 5) {
      throw new IllegalStateException("Wrong Tile Geometry");
    }
    this.middleRight = middleRight;
    if (middleRight.length() != 4) {
      throw new IllegalStateException("Wrong Tile Geometry");
    }
    this.bottomRight = bottomRight;
    if (bottomRight.length() != 3) {
      throw new IllegalStateException("Wrong Tile Geometry");
    }
    this.edges = [topLeft, middleLeft(0), middleLeft(end), middle(0), middle(end), middleRight(0), middleRight(end), bottomRight(0), bottomRight(end)]; // my Java is a bit rusty, not sure if this line will work as intended
    for (i = 0; i < edges.length(); i++) {
      tileBoundary(i) = i;
    }
  }
  
  public Hex getHex(Tile requesting) { // this method at least needs to accept the requesting Tile, which in Hex it currently doesn't. I've changed Hex to account for that.
    return null;
  }
}
