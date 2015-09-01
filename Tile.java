import java.util.*;
public class Tile {
  private Hex[] hexList //Index of Hexes, to be implemented in individual extensions
  public Side[] side;  //Six arrays of edges
  /*  0 -> Delta type sides
      1 -> O
      2 -> Square
      3 -> T
      4 -> I
      5 -> Y
  */
  public int orient; //Number of turns counterclockwise; orient = 5 would put the Y side at the top
  public String name;
  public Tile(int orient, String name) {
    this.orient = orient;
    side[0] = new Side(orient);
    side[1] = new Side((orient + 1)%6);
    side[2] = new Side((orient + 2)%6);
    side[3] = new Side((orient + 3)%6);
    side[4] = new Side((orient + 4)%6);
    side[5] = new Side((orient + 5)%6);
  }
  
  //For merging new tile to tile discovered from
  public Hex mergeTile(Tile T, int i, int j, Board gameBoard) {
    Hex B = this.side[i].borders[4 - j].spaces[0]; //Draws Hex from corresponding border
    for (int k = 0; k < 5; k++) {
      Border temp = T.side[i].borders[4 - k];
      Hex A = temp.spaces[0];
      //Fills out "mixxing hex" for new Tile's 
      this.side[i].borders[k].spaces[1] = A;
      T.side[i].borders[4 - k] = this.side[i].borders.borders[k];
    }
    return B;
  }
  
  //for merging new tile to arbitrary other tile
  public void connect(Tile T, int orient) {
      int otherDirection = (orient + 3)%6;
      Side toConnect = T.side[(otherDirection - T.orient)%6];
      int mySide = (orient - this.orient)%6;;
    for (int k = 0; k < 5; k++) {
      Border temp = toConnect.borders[4 - k];
      Hex A = temp.spaces[0];
      this.side[mySide].borders[k].spaces[1] = A;
      toConnect.borders[4 - k] = this.side[i].borders.borders[k];
    }
  }
  
  public String toString() {
    return name;
  }
    
}
