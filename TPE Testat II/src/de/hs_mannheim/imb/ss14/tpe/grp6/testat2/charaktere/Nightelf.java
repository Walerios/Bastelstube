package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Nightelf extends Wesen implements Fighter {
    
    Race race = Race.NIGHTELF;
    double hitpoints = 120;
    double damage = 15;
    double armor = 0.2;
    double speed = 3.0;
    double raceSpecial = 2.9;
    double kosten = 145.0;
    
    @Override
    public void fight() {
        // TODO Auto-generated method stub
        
    }
    
    public double limitDamage(double damage){
        return damage;
    }
}
