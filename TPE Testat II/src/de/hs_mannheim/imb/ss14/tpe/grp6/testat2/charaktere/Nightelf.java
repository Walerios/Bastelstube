package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Nightelf extends Wesen  {
    
    public Nightelf(){
    race = Race.NIGHTELF;
    hitpoints = 120;
    damage = 15;
    armor = 0.2;
    speed = 3.0;
    raceSpecial = 2.9;
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
        
        return "Nachtelf("+this.hitpoints+" HP)";
    }
}
