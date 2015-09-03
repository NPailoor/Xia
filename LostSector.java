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
    side[1] = new Side((orient+1)%6);
    hexlist[2].neighbors = {side[0].borders[4], side[1].borders[0], side[1].borders[1], null, null, null};
    side[0].borders[4] = new Border(hexlist[2], tileStack);
    //Implementing Y side
    side[1].borders[0] = new Border(hexlist[2], tileStack);
    side[1].borders[1] = new Border(hexlist[2], tileStack);
    hexlist[1].connect(hexlist[2], 2, tileStack);
    hexlist[3] = new Hex(b, this);
    hexlist[3].neighbors = {null, side[1].borders[2], side[1].borders[3], null, null, null};
    side[1].borders[2] = new Border(hexlist[3], tileStack);
    side[1].borders[3] = new Border(hexlist[3], tileStack);
    hexlist[2].connect(hexlist[3], 3, tileStack);
    hexlist[4] = new Hex(b, this);
    //Implementing I side
    side[2] = new Side((orient+2)%6);
    hexlist[4].neighbors = {null, side[1].borders[4], side[2].borders[0], side[2].borders[1], null, null, null};
    side[2].borders[0] = new Border(hexlist[4], tileStack);
    tile[2].borders[1] = new Border(hexlist[4], tileStack);
    hexlist[3].connect(hexlist[4], 4, tileStack);
  }
}
