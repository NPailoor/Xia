public class Border {
   Hex[] spaces;
   List<Tile> tileStack; // Implemented as a list since it will change in the discover method

   public Border(Hex A, Hex B, List<Tile> tileStack) { // Alexander's Code
      Hex[] spaces = {A,B};
      this.spaces = spaces;
      this.tileStack = tileStack;
   }

   public Border(Hex A, Hex B) {
      Hex[] spaces = {A,B};
      this.spaces = spaces;
      tileStack = []; // Alexander's Code
   }

   public Border(Hex A, List<Tile> tileStack) { // Alexander's Code
      this(A, null);
      this.tileStack = tileStack;
   }   

   public Border(Hex A) {
      this(A, null);
      tileStack = []; // Alexander's Code
   }
   
   public Border() {
      this(null);
      tileStack = []; // Alexander's Code
   }
   
   public Hex peek(Hex A) {
      if(spaces[0] == A) {
         return spaces[1];
      } else {
         return spaces[0];
      }
   }
   
   public Object[] move(Ship s, Hex A) { // Returns the popped tile stack and the new tile. Right now I've implemented this as returning an object array. Is there a cleaner way to do this?
      newTile = null;
      Hex B = peek(A);
      if(B == null) { // Alexander's Code
         if (tileStack.isEmpty()) {
             return null; // Nowhere to explore 
         }
         newTile = tileStack.remove(0);
         B = newTile.getHex(); // This method will be written with Tile and will pick a border hex from the tile.
         Hex(Hex.indexOf(null)) = B; // can indexOf be used like this?
      }
      B.shipEnter(s);
      return {newTile, tileStack}; // allows the rest of the game to update the stack. The new tile also somehow needs to be returned
   }

}
