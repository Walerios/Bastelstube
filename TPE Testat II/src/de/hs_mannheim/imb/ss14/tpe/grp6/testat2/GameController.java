package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;
import de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere.*;

public class GameController {
    
    

 public static void battle(Squad s1, Squad s2, int round){
        
        int s1length = s1.getArray().length;
        int s2length = s2.getArray().length;
        
        boolean canAttack = false;
        Wesen attacker;
        Wesen defender;

        while (!canAttack) {
            int attackIndex = (int) (Math.random() * s1length);

            if (s1.getArray()[attackIndex].alive) {

                attacker = (s1.getArray()[attackIndex]);

                while (!canAttack) {
                    attackIndex = (int) (Math.random() * s2length);

                    if (s2.getArray()[attackIndex].alive) {
                        defender = (s2.getArray()[attackIndex]);
                        canAttack = true;
                        GameViewer.printpreBattle(attacker, defender);
                        attacker.fight(defender);
                        GameViewer.printafterBattle(attacker, defender);
                    }
                }
            }
        }
    }
    
    public static void runGame() {
        
        
        Player p1 = new Player();
        Player p2 = new Player();
        
        Squad team1 = Factory.mergeSquad
                (Factory.createSquad(Race.ORC,
                        1500, p1),Factory.createSquad(Race.HUMAN, 500, p1),
                        "ORCXE UND MENSCHENS");
        
        Squad team2 = Factory.mergeSquad
                (Factory.createSquad(Race.HUMAN,
                        1500, p2),Factory.createSquad(Race.UNDEAD, 500, p2),
                        "MENSCHENS und Zombies");
        
        while(!p1.lose){
            GameViewer.printRound(Counter.getRound());
            
            battle(team1,team2,Counter.getRound());
            p2.GameAktualisierer(team2);
            if (p2.lose){
                GameViewer.GameOver(team2);
                break;
            }
            battle(team2,team1,Counter.getRound());
            p1.GameAktualisierer(team1);
            if (p1.lose){
                GameViewer.GameOver(team1);
                break;
            }
            Counter.nextRound();
        }
        
        
        
    }
    
   
    
    public static void main(String[] args) {

        runGame();
        
    }
    

}
