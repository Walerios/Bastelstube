package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public abstract class Wesen implements Fighter{
    Race race;
    double hitpoints;
    double damage;
    double armor;
    double speed;
    double raceSpecial;
    public boolean alive = true;

    public abstract double limitDamage(double damage);
    
    public abstract String toString();
    
}

