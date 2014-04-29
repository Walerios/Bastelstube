package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Demonhunter extends Nightelf implements Hero,Fighter{
    
    private String name = "Demonhunter" ;
    private Element element = Element.AIR;
    private Element weakness = Element.FIRE;
    
    public Demonhunter() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void goldshot() {
        
    }
    
    @Override
    public void heroFight(){
        
    }
    
    @Override
    public void fight() {
        // TODO Auto-generated method stub
        
    }
}
