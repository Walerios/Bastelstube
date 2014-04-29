package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

public class Lich extends Undead {
    
    String name = "Lich" ;
    Element element = Element.WATER;
    
    public Lich() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void decay() {
        
    }
}
