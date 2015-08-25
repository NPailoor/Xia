import java.util.*;

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
      tileStack = new ArrayList<Tile>(); // Alexander's Code
   }

   public Border(Hex A, List<Tile> tileStack) { // Alexander's Code
      Hex[] borderSpaces = new Hex[2];
      borderSpaces[0] = A;
      borderSpaces[1] = null;
      this.spaces = borderSpaces;
      this.tileStack = tileStack;
   }   

   public Border(Hex A) {
      Hex[] borderSpaces = new Hex[2];
      borderSpaces[0] = A;
      borderSpaces[1] = null;
      this.spaces = borderSpaces;
      tileStack = new ArrayList<Tile>(); // Alexander's Code
   }
   
   public Border() {
      this(null);
      tileStack = new ArrayList<Tile>(); // Alexander's Code
   }
   
   public Hex peek(Hex A) {
      if(spaces[0] == A) {
         return spaces[1];
      } else {
         return spaces[0];
      }
   }
   
   public Object[] move(Ship s, Hex A) { // Returns the popped tile stack and the new tile. Right now I've implemented this as returning an object array. Is there a cleaner way to do this?
      Tile newTile = null;
       Hex B = peek(A);
       if(B == null) { // Alexander's Code
          if (tileStack.isEmpty()) {
              return null; // Nowhere to explore 
          }
          newTile = tileStack.remove(0);
          B = newTile.getHex(); // This method will be written with Tile and will pick a border hex from the tile.
          spaces[1] = B; // can indexOf be used like this?
      }
      B.shipEnter(s);
      Object[] o = new Object[2];
      o[0] = newTile;
      o[1] = tileStack;
      return o; // allows the rest of the game to update the stack. The new tile also somehow needs to be returned
   }

}
