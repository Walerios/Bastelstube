package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

import de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere.*;

public class Factory {

    public static Squad createSquad(Race race, int ElfDollar, Player player) {
        
        if (player.elfDollar < ElfDollar){
            ElfDollar = player.elfDollar;
        }
        
        if (ElfDollar < (race.cost*2)){
            return new Squad(new Wesen[0]);
        }

        int units = ElfDollar / race.cost - 1;
        Wesen[] squad = new Wesen[units];
        player.elfDollar-= race.cost*(units+1);
        System.out.println(player.elfDollar);
        
        
        if (units > 0) {

            switch (race) {
            case ORC:
                squad[0] = new Farseer();
                System.out.println("Farseer erstellt");
                for (int i = 1; i < squad.length; i++) {
                    squad[i] = new Orc();
                }
                System.out.println("Es wurden " + squad.length
                        + " Grunzer erstellt.");
                break;

            case HUMAN:
                squad[0] = new Archmage();
                System.out.println("Archmage erstellt");
                for (int i = 1; i < squad.length; i++) {
                    squad[i] = new Human();
                }
                System.out.println("Es wurden " + squad.length
                        + " Menschen erstellt.");
                break;

            case UNDEAD:
                squad[0] = new Lich();
                System.out.println("Lich erstellt");
                for (int i = 1; i < squad.length; i++) {
                    squad[i] = new Undead();
                }
                System.out.println("Es wurden " + squad.length
                        + " Ghoule erstellt.");
                break;

            case NIGHTELF:
                squad[0] = new Demonhunter();
                System.out.println("Demonhunter erstellt");
                for (int i = 1; i < squad.length; i++) {
                    squad[i] = new Nightelf();
                }
                System.out.println("Es wurden " + squad.length
                        + " Langöhrchen erstellt.");
                break;
            }
        }
        Squad finalSquad = new Squad(squad);
        return finalSquad;
    }
    
    public static Squad mergeSquad(Squad s1, Squad s2, String  name){
        int counter = 0;
        Wesen [] newSquad = new Wesen[s1.getArray().length+s2.getArray().length];
        for (Wesen w : s1.getArray()){
            newSquad[counter]=w;
            counter++;
        }
        for (Wesen w : s2.getArray()){
            newSquad[counter]=w;
            counter++;
        }
        
        return new Squad(name,newSquad);
    }
}