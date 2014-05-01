package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;
import java.util.*;

public class Farseer extends Orc implements Hero {
    
    private String name = "Farseer" ;
    private Element element = Element.EARTH;
    private Element weakness = Element.AIR;
    private double bonus = 1.2;
    private int lastAbilityUse = -2;
    
    public Farseer() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void doublehit(int round,Squad s) {
        if(lastAbilityUse+3>round){
            System.out.println("Fähigkeit nocht nicht bereit");
        } else {
            int count = 0; 
            for(Wesen wesen:s.getArray()){
                if(wesen.alive){
                    count ++;
                }
            }
            int killCount = 0;
            if(count >= 2){
                
                while (killCount < 2) {
                    int attackIndex = (int) (Math.random() *
                            s.getArray().length);
                    if (s.getArray()[attackIndex].alive) {
                        (s.getArray()[attackIndex]).alive = false;
                        killCount++;
                    }
                }
            }else if(count == 1){
                while (killCount < 1) {
                    int attackIndex = (int) (Math.random() *
                            s.getArray().length);
                    if (s.getArray()[attackIndex].alive) {
                        (s.getArray()[attackIndex]).alive = false;
                        killCount++;
                    }
                }
            } else {
                //Keine Gegener mehr übrig
            }
        }
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
