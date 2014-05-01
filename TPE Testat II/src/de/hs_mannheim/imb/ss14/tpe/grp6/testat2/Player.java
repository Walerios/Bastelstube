package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;
import de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere.*;

public class Player {
    
    int elfDollar = 2000;
    boolean lose = false;
    public boolean abilityUsedArchmage = false;
    
    
    
    public void GameAktualisierer(Squad s){
        for(Wesen w : s.getArray()){
            lose = true;
            if (w.alive){
                lose = false;
            }
        }
        if (abilityUsedArchmage){
            for(Wesen w : s.getArray()){
                if (w instanceof Archmage){
                    ((Archmage) w).absorbBack(this);
                }
            }
        }
    }
    
}
