package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Undead extends Wesen implements Fighter {
    
    Race race = Race.UNDEAD;
    double hitpoints = 120;
    double damage = 16;
    double armor = 0.3;
    double speed = 2.0;
    double raceSpecial = 1.6;
    double kosten = 70.0;
    
    @Override
    public void fight() {
        // TODO Auto-generated method stub
        
    }
    
    public double limitDamage(double damage){
        return damage;
    }
}