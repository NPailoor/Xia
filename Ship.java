public class Ship {
   Hex position;
   private int health;
   Player myPlayer;
   int tier; // tier 1, 2 or 3 ships. Needed for respawning, which will be implemented later
   int impulse;

   public Ship(Hex start, int hp, Player player) {
      Ship(start, hp, player, 1, 0);
   }
   
   public Ship(Hex start, int hp, Player player, int impulse) {
      Ship(start, hp, player, 1, 0, impulse);
   }   
   
   public Ship(Hex start, int hp, Player player, int tier, int impulse) {
      position = start;
      start.shipEnter(this);
      health = hp;
      myPlayer = player;
      this.tier = tier;
      this.impulse = impulse;
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
