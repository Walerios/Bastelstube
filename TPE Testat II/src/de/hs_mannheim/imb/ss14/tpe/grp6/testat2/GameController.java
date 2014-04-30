package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;
import de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere.*;

public class GameController {

    public void runGame() {
        Squad s1 = Factory.createSquad("Walking Dead", Race.UNDEAD, 2000);
        Squad s2 = Factory.createSquad("OP Human", Race.HUMAN, 4000);
    }
    
    public static void main(String[] args) {

        runGame();
       
    }

}
