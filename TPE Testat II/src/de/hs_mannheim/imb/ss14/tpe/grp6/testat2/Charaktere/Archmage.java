package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

public class Archmage extends Human {
    
    String name = "Archmage" ;
    Element element = Element.FIRE;
    
    public Archmage() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void absorb() {
        
    }
    
}
