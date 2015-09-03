public class LostSector extends Tile {
  public LostSector(int orient, List<Tile> tileStack) {
    //Implementing Delta side
    side[0] = new Side(orient%6);
    //Empty border array as a placeholder
    borders[] b = new Border[6];
    hexlist[0] = new Hex(b, this);
    hexlist[0].neighbors = {side[0].borders[0], side[0].borders[1], null, null, null, null};
    side[0].borders[0] = new Border(hexlist[0], tileStack);
    side[0].borders[1] = new Border(hexlist[0], tileStack);
    hexlist[1] = new Hex(b, this);
    hexlist[1].neighbors = {side[0].borders[2], side[0].borders[3], null, null, null, null};
    side[0].borders[2] = new Border(hexlist[1], tileStack);
    side[0].borders[3] = new Border(hexlist[1], tileStack);
    Border connector0 = new Border(hexlist[0], hexlist[1], tileStack);
    hexlist[0].connect(hexlist[1], 2, tileStack);
    hexlist[2] = new Hex(2, this);
    hexlist[2].neighbors = {side[0].borders[4], side[0],borders[5], null, null, null, null};
    side[0].borders[4] = new Border(hexlist[2], tileStack);
    side[0].borders[5] = new Border(hexlist[2], tileSTack);
    hexlist[1].connect(hexlist[2], 2, tileStack);
  }
}
