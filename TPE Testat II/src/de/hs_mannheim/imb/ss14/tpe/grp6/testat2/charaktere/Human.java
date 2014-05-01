package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Human extends Wesen 
{
    public Human(){
    race = Race.HUMAN;
    hitpoints = 140;
    damage = 40;
    armor = 0.4;
    speed = 2.0;
    raceSpecial = 10.0;
    }
    
    @Override
    public void fight(Wesen enemy) {
        damage = this.speed*this.damage*this.raceSpecial;
        damage = enemy.limitDamage(damage);
        damage = damage*(1-enemy.armor);
        enemy.hitpoints -= damage;
        
        if(enemy.hitpoints<=0){
            enemy.alive = false;
        }
    }
    
    @Override
    public double limitDamage(double damage){
        return damage*((100.0-raceSpecial)/100);
    }
    
    @Override
    public String toString() {
        
        return "Mensch("+this.hitpoints+" HP)";
    }
}
