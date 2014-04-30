package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public abstract class Wesen {
    Race race;
    double hitpoints;
    double damage;
    double armor;
    double speed;
    double raceSpecial;
    double kosten;
    boolean alive = true;

    public abstract double limitDamage(double damage);
    
}

