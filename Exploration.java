public class Exploration extends Hex {
   Token myToken;

   public Exploration(Border[] b, Token t) {
      super(b, null);
      myToken = t;
   }
   
   public void shipEnter(Ship s) {
      super.shipEnter(s);
      if (myToken != null) {
         s.collectToken(myToken);
      }
      myToken = null;
   }
   
   public boolean hasToken() { // Alexander's Code
      return !(myToken == null);
   }
}
