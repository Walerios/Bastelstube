package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Lich extends Undead implements Hero,Fighter{
    
    private String name = "Lich" ;
    private Element element = Element.WATER;
    private Element weakness = Element.EARTH;
    
    public Lich() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void decay() {
        
    }
    
    
    
    @Override
    public void heroFight(){
        
    }
    
    @Override
    public void fight() {
        // TODO Auto-generated method stub
        
    }
    
    
}
