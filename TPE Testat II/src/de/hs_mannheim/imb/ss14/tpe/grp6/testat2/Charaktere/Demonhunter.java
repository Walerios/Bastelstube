package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

public class Demonhunter extends Nightelf {
    
    String name = "Demonhunter" ;
    Element element = Element.AIR;
    
    public Demonhunter() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void goldshot() {
        
    }
}
