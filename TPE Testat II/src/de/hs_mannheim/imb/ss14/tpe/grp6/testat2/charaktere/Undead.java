package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Undead extends Wesen {
    
    public Undead(){
    race = Race.UNDEAD;
    hitpoints = 120;
    damage = 16;
    armor = 0.3;
    speed = 2.0;
    raceSpecial = 1.6;
    }
    
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
    
    @Override
    public String toString() {
        
        return "Untoter("+this.hitpoints+" HP)";
    }
}