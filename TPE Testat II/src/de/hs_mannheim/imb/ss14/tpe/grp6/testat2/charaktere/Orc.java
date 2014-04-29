package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Orc extends Wesen implements Fighter {
    
    Race race = Race.ORC;
    public double hitpoints = 100.0;
    double damage = 33.0;
    double armor = 0.3;
    double speed = 1.0;
    double raceSpecial = 4.0;
    double kosten = 150.0;

    @Override
    public void fight() {
        // TODO Auto-generated method stub
    
    }
    
    public double limitDamage(double damage){
        return damage;
    }
}
