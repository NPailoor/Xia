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
  public Tile(Border[] Delta, Border[] O, Border[] Square, Border[] T, Border[] I, Border[] Y, String name) {
    side[0] = Delta;
    side[1] = O;
    side[2] = Square;
    side[3] = T;
    side[4] = I;
    side[5] = Y;
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
