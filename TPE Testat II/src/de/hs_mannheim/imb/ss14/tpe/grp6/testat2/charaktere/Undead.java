package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Undead extends Wesen implements Fighter {
    
    Race race = Race.UNDEAD;
    double hitpoints = 120;
    double damage = 16;
    double armor = 0.3;
    double speed = 2.0;
    double raceSpecial = 1.6;
    
    @Override
    public void fight(Wesen enemy) {
        damage = this.speed*this.damage*this.raceSpecial;
        damage = enemy.limitDamage(damage);
        damage = damage*(1-enemy.armor);
        enemy.hitpoints = enemy.hitpoints-damage;
        
        if(enemy.hitpoints<=0){
            enemy.alive = false;
        }
    }
    
    @Override
    public double limitDamage(double damage){
        return damage;
    }
}