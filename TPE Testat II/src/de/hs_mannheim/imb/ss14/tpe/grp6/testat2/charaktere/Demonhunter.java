package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Demonhunter extends Nightelf {
    
    private String name = "Demonhunter" ;
    private Element element = Element.AIR;
    private Element weakness = Element.FIRE;
    
    public Demonhunter() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void goldshot() {
        
    }
    
    public void HeroFight(){
        
    }
}
