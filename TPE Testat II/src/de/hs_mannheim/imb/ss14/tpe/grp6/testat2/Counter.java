package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

public class Counter {
    
    private static int round =  1;
        
    public static void nextRound() {
        
        round++;
    }
    
    public static int getRound() {
        return round;
    }
}