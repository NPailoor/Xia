public class Ship {
   Hex position;
   public Ship(Hex start) {
      position = start;
      start.shipEnter(this);
   }
   
   public void destroy() {
      position.shipDestroy();
      position = null;
   }
   
   public void collectToken(Token t) {
   
   }
   
   public void move(Hex target) { // Alexander's Code
      position = target;
      start.shipEnter(target);
   }
}
