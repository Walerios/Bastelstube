package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

public enum Race {
    ORC(150), UNDEAD(70), HUMAN(110), NIGHTELF(145);
    
    public final int cost;
    
    private Race (int cost) {
        this.cost = cost;
    }
}
