package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

public class Counter {
    private int round =  1;
        
    public void nextRound() {
        round++;
    }
    
    public int getRound() {
        return round;
    }
}