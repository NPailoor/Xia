public class Board {
  Tile[][] board;
  // 
  

  
  public Board(Tile t1, Tile t2, Tile t3) {
    board = new Tile[100][100];
    board[50][50] = t1;
    board[50][51] = t2;
    board[51][51] = t3;
  }
  
  public Board(Tile t1, Tile t2, Tile t3, Tile t4) {
    board = new Tile[100][100];
    board[50][50] = t1;
    board[50][51] = t2;
    board[51][51] = t3;
    board[51][49]
    
  }  
  
  public void addTile(Tile t, int x, int y) {
    board[x][y] = t;
    if (board[x+1][y] != null) {
      board[x+1][y].connect(t, "bottom"); // tile.connect
    }
    if (board[x-1][y] != null) {
      board[x-1][y].connect(t, "top"); // tile.connect takes a tile and the direction being connected from, as a string
    }
    if (board[x][y-1] != null) {
      board[x][y-1].connect(t, "right"); // tile.connect takes a tile and the direction being connected from, as a string
    }
    if (board[x][y+1] != null) {
      board[x][y+1].connect(t, "left"); // tile.connect takes a tile and the direction being connected from, as a string
    }
    if (board[x-1][y+1] != null) {
      board[x-1][y+1].connect(t, "bottom right"); // tile.connect takes a tile and the direction being connected from, as a string
    }
    if (board[x+1][y-1] != null) {
      board[x+1][y-1].connect(t, "top left"); // tile.connect takes a tile and the direction being connected from, as a string
    }

  }
}
