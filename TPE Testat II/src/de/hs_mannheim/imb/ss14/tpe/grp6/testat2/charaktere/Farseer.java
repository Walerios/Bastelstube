package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Farseer extends Orc implements Hero,Fighter {
    
    private String name = "Farseer" ;
    private Element element = Element.EARTH;
    private Element weakness = Element.AIR;
    
    public Farseer() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void doublehit() {
        
    }
    
    @Override
    public void heroFight(){
        
    }
    
    @Override
    public void fight() {
        // TODO Auto-generated method stub
        
    }
}
