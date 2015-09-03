import java.util.*; // I think this is where collections is?

public class Main {
  Player[] turnQueue;
  Board myBoard;
  ArrayList<Tile> tileStack;
  int turnNum;
  boolean gameOver;
  Player winner;
  String title;
  int target;
  
  public Main(Player[] turnQueue, Board myBoard, ArrayList<Tile> stack, String title, int target) {
    this.turnQueue = turnQueue;
    this.myBoard = myBoard;
    tileStack = stack;
    Collections.shuffle(tileStack); // this should shuffle the tileStack.
    this.title = title;
    this.target = target;
    turnNum = 0;
    gameOver = false;
    while(!gameOver) {
      gameOver = this.advanceTurn();
      if (gameOver) {
        winner = turnQueue[turnNum-1];
      }
    }
    
  }
  
  private boolean advanceTurn() {
    turnPlayer = turnQueue(turnNum);
    turnPlayer.takeTurn(); // not sure about this method yet
    turnNum++;
    return (player.vp > target));
  }
}
