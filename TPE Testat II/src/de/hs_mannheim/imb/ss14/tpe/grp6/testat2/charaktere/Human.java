package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Human extends Wesen implements Fighter
{
    Race race = Race.HUMAN;
    double hitpoints = 140;
    double damage = 40;
    double armor = 0.4;
    double speed = 2.0;
    double raceSpecial = 10.0;
    double kosten = 110.0;
    
    @Override
    public void fight() {
        // TODO Auto-generated method stub
        
    }
    
    public double limitDamage(double damage){
        return damage*((100.0-raceSpecial)/100);
    }
}
