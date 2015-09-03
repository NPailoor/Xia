public class Main {
  Player[] turnQueue;
  Board myBoard;
  Tile[] tileStack;
  int turnNum;
  boolean gameOver;
  Player winner;
  String title;
  
  public Main(Player[] turnQueue, Board myBoard, Tile[] tileStack, String title) {
    this.turnQueue = turnQueue;
    this.myBoard = myBoard;
    this.tileStack = tileStack;
    this.title = title;
    turnNum = 0;
    gameOver = false;
    while(!gameOver) {
      gameOver = this.advanceTurn();
    }
  }
  
  private boolean advanceTurn() {
    turnPlayer = turnQueue(n);
    turnPlayer.takeTurn(); // not sure about this method yet
    n++;
    return turnPlayer.hasWon();
  }
}
