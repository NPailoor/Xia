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
    hexlist[0].connect(hexlist[1], 2);
    hexlist[2] = new Hex(2, this);
    side[1] = new Side((orient+1)%6);
    hexlist[2].neighbors = {side[0].borders[4], side[1].borders[0], side[1].borders[1], null, null, null};
    side[0].borders[4] = new Border(hexlist[2], tileStack);
    //Implementing Y side
    side[1].borders[0] = new Border(hexlist[2], tileStack);
    side[1].borders[1] = new Border(hexlist[2], tileStack);
    hexlist[1].connect(hexlist[2], 2);
    hexlist[3] = new Hex(b, this);
    hexlist[3].neighbors = {null, side[1].borders[2], side[1].borders[3], null, null, null};
    side[1].borders[2] = new Border(hexlist[3], tileStack);
    side[1].borders[3] = new Border(hexlist[3], tileStack);
    hexlist[2].connect(hexlist[3], 3);
    hexlist[4] = new Hex(b, this);
    //Implementing I side
    side[2] = new Side((orient+2)%6);
    hexlist[4].neighbors = {null, side[1].borders[4], side[2].borders[0], side[2].borders[1], null, null};
    side[1].borders[4] = new Border(hexlist[4], tileStack);
    side[2].borders[0] = new Border(hexlist[4], tileStack);
    side[2].borders[1] = new Border(hexlist[4], tileStack);
    hexlist[3].connect(hexlist[4], 3);
    hexlist[5] = new Hex(b, this);
    hexlist[5].neighbors = {null, null, side[2].borders[2], side[2].borders[3], null, null};
    side[2].borders[2] = new Border(hexlist[5], tileStack);
    side[2].borders[3] = new Border(hexlist[5], tileStack);
    hexlist[4].connect(hexlist[5], 4);
    hexlist[6] = new Hex(b, this);
    //Implementing T side
    side[3] = new Side((orient+3)%6);
    hexlist[6].neighbors = {null, null, side[2].borders[4], side[3].borders[0], side[3].borders[1], null};
    side[2].borders[4] = new Border(hexlist[6], tileStack);
    side[3].borders[0] = new Border(hexlist[6], tileStack);
    side[3].borders[1] = new Border(hexlist[6], tileStack);
    hexlist[5].connect(hexlist[6], 4);
    hexlist[7] = new Hex(b, this);
    hexlist[7].neighbors = {null, null, null, side[3].borders[2], side[3].borders[3], null};
    side[3].borders[2] = new Border(hexlist[7], tileStack);
    side[3].borders[3] = new Border(hexlist[7], tileStack);
    hexlist[6].connect(hexlist[7], 5);
    hexlist[8] = new Hex(b, this);
    //Implementing Square side
    side[4] = new Side((orient+4)%6);
    hexlist[8].neighbors = {null, null, null, side[3].borders[4], side[4].borders[0], side[4].borders[1]};
    side[3].borders[4] = new Border(hexlist[8], tileStack);
    side[4].borders[0] = new Border(hexlist[8], tileStack);
    side[4].borders[1] = new Border(hexlist[8], tileStack);
    hexlist[7].connect(hexlist[8], 5);
    hexlist[9] = new Hex(b, this);
    hexlist[9].neighbors = {null, null, null, null, side[4].borders[2], side[4].borders[3]};
    side[4].borders[2] = new Border(hexlist[9], tileStack);
    side[4].borders[3] = new Border(hexlist[9], tileStack);
    hexlist[8].connect(hexlist[9], 0);
    hexlist[10] = new Hex(b, this);
    //Implementing O side
    side[5] = new Side((orient+5)%6);
    hexlist[10].neighbors = {side[5].borders[1], null, null, null, side[5].borders[4], side[5].borders[0]};
    side[4].borders[4] = new Border(hexlist[10], tileStack);
    side[5].borders[0] = new Border(hexlist[10], tileStack);
    side[5].borders[1] = new Border(hexlist[10], tileStack);
    hexlist[9].connect(hexlist[10], 0);
    hexlist[11] = new Hex(b, this);
    hexlist[11].neighbors = {side[5].borders[3], null, null, null, null, side[5].borders[2]};
    side[5].borders[2] = new Border(hexlist[11], tileStack);
    side[5].borders[3] = new Border(hexlist[11], tileStack);
    hexlist[10].connect(hexlist[11], 1);
    //Connecting back to hexlist[0]
    hexlist[11].connect(hexlist[0], 1);
    hexlist[0].neighbors[5] = side[5].borders[4];
    side[5].borders[4] = new Border(hexlist[0], tileStack);
  }
}
