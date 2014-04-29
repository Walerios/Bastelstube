package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

public class Farseer extends Orc implements Hero {
    
    String name = "Farseer" ;
    Element element = Element.EARTH;
    
    public Farseer() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void doublehit() {
        
    }
}
