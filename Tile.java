import java.util.*;
public class Tile {
  private Hex[] hexList //Index of Hexes, to be implemented in individual extensions
  public Border[][] side;  //Six arrays of edges
  /*  0 -> Delta type sides
      1 -> O
      2 -> Square
      3 -> T
      4 -> I
      5 -> Y
  */
  public String name;
  public Tile(int orient, String name) {
    side[0] = new Side(orient);
    side[1] = new Side(orient + 1);
    side[2] = new Side(orient + 2);
    side[3] = new Side(orient + 3);
    side[4] = new Side(orient + 4);
    side[5] = new Side(orient + 5);
  }
  
  public Hex mergeTile(Tile T, int i, int j) {
    Hex B = this[i][j].spaces[0]; //Draws Hex from corresponding border
    this.side[i] = T.side[i];
    return B;
  }
  
  public String toString() {
    return name;
  }
    
}
