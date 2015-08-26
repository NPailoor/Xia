public class Side {
  Border[] borders;
  int orientation;
  
  public Side(int i) {
    orientation = i;
    borders = new Border[5]
  }
  
  public Border getBorder(int j) {
    return borders[j];
  }
}
