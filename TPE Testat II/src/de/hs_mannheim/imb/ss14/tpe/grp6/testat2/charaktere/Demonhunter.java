package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Demonhunter extends Nightelf implements Hero{
    
    private String name = "Demonhunter" ;
    private Element element = Element.AIR;
    private Element weakness = Element.FIRE;
    private double bonus = 3.0;
    private int lastAbilityUse = -2;
    
    public Demonhunter() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void goldshot(int round,Squad s) {
        if(lastAbilityUse+3>round){
            System.out.println("Fähigkeit nocht nicht bereit");
        } else {
            for(Wesen wesen:s.getArray()){
                if(wesen.alive){
                    wesen.hitpoints = wesen.hitpoints - 25;
                    if(wesen.hitpoints <= 0){
                        wesen.alive = false;
                    }
                }
            }
            this.lastAbilityUse = round;
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
