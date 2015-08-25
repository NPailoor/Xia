public class Ship {
   Hex position;
   private int health;
   public Ship(Hex start, int hp) {
      position = start;
      start.shipEnter(this);
      health = hp;
   }
   
   public void destroy() {
      position.shipDestroy();
      position = null;
   }
   
   public void damage(int hurt) {
      health = health - hurt;
   }
   
   public void collectToken(Token t) {
   
   }
   
   public void move(Hex target) { // Alexander's Code
      position = target;
      target.shipEnter(this);
   }
}
