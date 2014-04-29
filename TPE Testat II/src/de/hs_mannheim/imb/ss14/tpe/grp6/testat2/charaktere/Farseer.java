package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Farseer extends Orc implements Hero {
    
    private String name = "Farseer" ;
    private Element element = Element.EARTH;
    private Element weakness = Element.AIR;
    
    public Farseer() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void doublehit() {
        
    }
    
    public void HeroFight(){
        
    }
}
