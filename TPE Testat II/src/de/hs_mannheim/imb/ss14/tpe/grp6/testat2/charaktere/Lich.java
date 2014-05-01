package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Lich extends Undead implements Hero{
    
    private String name = "Lich" ;
    private Element element = Element.WATER;
    private Element weakness = Element.EARTH;
    private double bonus = 2.3;
    private int lastAbilityUse = -2;
    
    public Lich() {
    
    hitpoints = 2 * super.hitpoints;
    damage = 2 * super.damage;
    
    }
    
    public void decay(int round, Squad s) {
        if(lastAbilityUse+3>round){
            System.out.println("Fähigkeit nocht nicht bereit");
        } else {
            double addLife = 0.0;
            for(Wesen wesen:s.getArray()){
                if(wesen.alive){
                    wesen.hitpoints = wesen.hitpoints - 7;
                    addLife = addLife+7.0;
                    if(wesen.hitpoints <= 0){
                        wesen.alive = false;
                    }
                }
            }
            this.hitpoints = hitpoints + addLife;
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
