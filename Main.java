public class Main {
  Player[] turnQueue;
  Board myBoard;
  Tile[] tileStack;
  int turnNum;
  boolean gameOver;
  Player winner;
  String title;
  int target;
  
  public Main(Player[] turnQueue, Board myBoard, Tile[] tileStack, String title, int target) {
    this.turnQueue = turnQueue;
    this.myBoard = myBoard;
    this.tileStack = tileStack;
    this.title = title;
    this.target = target;
    turnNum = 0;
    gameOver = false;
    while(!gameOver) {
      gameOver = this.advanceTurn();
      if (gameOver) {
        winner = turnQueue[n-1];
      }
    }
    
  }
  
  private boolean advanceTurn() {
    turnPlayer = turnQueue(n);
    turnPlayer.takeTurn(); // not sure about this method yet
    n++;
    return (player.vp > target));
  }
}
