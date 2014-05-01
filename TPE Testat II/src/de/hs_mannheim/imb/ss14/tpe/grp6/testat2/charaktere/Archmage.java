package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;
import de.hs_mannheim.imb.ss14.tpe.grp6.testat2.Player;

public class Archmage extends Human implements Hero {
    
    private String name = "Archmage" ;
    private Element element = Element.FIRE;
    private Element weakness = Element.WATER;
    private double bonus = 5.0;
    private int lastAbilityUse = -2;
    
    public Archmage() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    
    }
    
    public void absorb(Player p,int round) {
        if(lastAbilityUse+3>round){
            System.out.println("Fähigkeit nocht nicht bereit");
        } else {
            this.armor = 1;
            p.abilityUsedArchmage = true;
        }
    }
    
    public void absorbBack(Player p) {
        this.armor = 0.4;
        p.abilityUsedArchmage = false;
    }
    
    @Override
    public Element getWeakness(){
        return weakness;
    }

    @Override
    public void fight(Wesen enemy) {
        
        damage = this.speed*this.damage*this.raceSpecial;
        damage = damage*this.bonus;
        damage = enemy.limitDamage(damage);
        damage = damage*(1-enemy.armor);
        if (enemy instanceof Hero){
            Hero enemyHero = (Hero)enemy;
            if (this.element == enemyHero.getWeakness()){
                enemy.hitpoints = enemy.hitpoints-(damage*2);
            } else {
                enemy.hitpoints = enemy.hitpoints-damage;
            }
        } else {
            enemy.hitpoints = enemy.hitpoints-damage;
        }
        
        if(enemy.hitpoints<=0){
            enemy.alive = false;
        }
        

    }
    
    @Override
    public String toString() {
        
        return this.name+"("+this.hitpoints+" HP)";
    }
    
}
