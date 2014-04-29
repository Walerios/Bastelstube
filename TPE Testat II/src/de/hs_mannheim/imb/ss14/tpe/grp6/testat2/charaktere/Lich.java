package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Lich extends Undead {
    
    private String name = "Lich" ;
    private Element element = Element.WATER;
    private Element weakness = Element.EARTH;
    
    public Lich() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void decay() {
        
    }
    
    public void HeroFight(){
        
    }
}
