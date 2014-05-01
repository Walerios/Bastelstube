package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Orc extends Wesen {
    
    public Orc(){
        race = Race.ORC;
        hitpoints = 100.0;
        damage = 33.0;
        armor = 0.3;
        speed = 1.0;
        raceSpecial = 4.0;
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
        
        return "Orc("+this.hitpoints+" HP)";
    }
    
    
}
