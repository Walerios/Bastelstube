package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Farseer extends Orc implements Hero {
    
    private String name = "Farseer" ;
    private Element element = Element.EARTH;
    private Element weakness = Element.AIR;
    private double bonus = 1.2;
    
    public Farseer() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void doublehit() {
        if(lastAbilityUse+3>Counter.getRound){
            System.out.println("Fähigkeit nocht nicht bereit");
        } else {
            for(){
                
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
}
