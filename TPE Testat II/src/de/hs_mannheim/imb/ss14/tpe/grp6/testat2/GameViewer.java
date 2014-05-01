package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;
import de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere.*;


public class GameViewer {

    public static void GameOver(Squad s){
        System.out.println(s.getName()+" haben GEWONNEN !");
    }
    
    public static void printpreBattle(Wesen atk, Wesen def){
        System.out.print(atk.toString()+" greift " + def.toString()+" an");
    }
    
    public static void printafterBattle(Wesen atk, Wesen def){
        System.out.println("->" + def.toString()+" an");
    }
    
    public static void printRound(int round){
        System.out.println("Runde: "+ round);
    }
        
    
}
