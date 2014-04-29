package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Archmage extends Human implements Hero,Fighter {
    
    private String name = "Archmage" ;
    private Element element = Element.FIRE;
    private Element weakness = Element.WATER;
    
    public Archmage() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void absorb() {
        
    }
    
    @Override
    public void heroFight(){
    
    }

    @Override
    public void fight() {
        // TODO Auto-generated method stub
        
    }
    
}
