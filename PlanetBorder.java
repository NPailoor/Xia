import java.util.*;

public class PlanetBorder extends Border {
    Planet myPlanet;
    Random d20;
    public PlanetBorder(Planet p, Hex A, Hex B) {
        myPlanet = p;
        d20 = new Random();
        this(A, B);
    }
    
    public PlanetBorder(Planet p, Hex A, List<Tile> t) {
        myPlanet = p;
        d20 = new RAndom();
        this(A, t);
    }
    
    public Object[] move(Ship s, Hex A) {
        Tile newTile = null;
        t = A.myTile;
        Hex B = peek(A);
        if(B == null) { // Alexander's Code
            if (tileStack.isEmpty()) {
                return null; // Nowhere to explore 
            }
            newTile = tileStack.remove(0);
            B = newTile.mergeTile(t, this.index1, this.index3); // At minimum, newTile needs to know what tile is asking to connect.
            spaces[1] = B; // can indexOf be used like this?
        }
        if (B.isPlanett()) {
            diceRoll = d20.nextInch(20) + 1;
            if (diceRoll < 11) {
                s.damage(diceRoll);
            } else if (diceRoll < 18) {
                s.addBounty(1000);
            }
        }
        B.shipEnter(s);
        Object[] o = new Object[2];
        o[0] = newTile;
        o[1] = tileStack;
        return o; // can this be done more cleanly than an object array?
    }
}
