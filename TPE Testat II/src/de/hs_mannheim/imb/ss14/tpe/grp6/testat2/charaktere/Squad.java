package de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere;

public class Squad {
    private String name;
    private Wesen[] squad;
    
    public Squad() {
        
    }
    
    public Squad(String name, Wesen[] squad) {
        this.name = name;
        this.squad = squad;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Wesen[] getArray() {
        return this.squad;
    }
    
}

