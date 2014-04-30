package de.hs_mannheim.imb.ss14.tpe.grp6.testat2;

import de.hs_mannheim.imb.ss14.tpe.grp6.testat2.charaktere.*;

public class Factory {

    public static Squad createSquad(String name, Race race, int ElfDollar) {

        // Typecast auf Int kann ich mir sparen, Int durch Int gibt Int und
        // niemals kommastellen.. vollhonk...

        int units = ElfDollar / race.cost - 1;
        Wesen[] squad = new Wesen[units];
        if (units > 0) {

            switch (race) {
            case ORC:
                squad[1] = new Farseer();
                System.out.println("Farseer erstellt");
                for (int i = 1; i < squad.length; i++) {
                    squad[i] = new Orc();
                }
                System.out.println("Es wurden " + squad.length
                        + " Grunzer erstellt.");
                break;

            case HUMAN:
                squad[1] = new Archmage();
                System.out.println("Archmage erstellt");
                for (int i = 1; i < squad.length; i++) {
                    squad[i] = new Human();
                }
                System.out.println("Es wurden " + squad.length
                        + " Menschen erstellt.");
                break;

            case UNDEAD:
                squad[1] = new Lich();
                System.out.println("Lich erstellt");
                for (int i = 1; i < squad.length; i++) {
                    squad[i] = new Undead();
                }
                System.out.println("Es wurden " + squad.length
                        + " Ghoule erstellt.");
                break;

            case NIGHTELF:
                squad[1] = new Demonhunter();
                System.out.println("Demonhunter erstellt");
                for (int i = 1; i < squad.length; i++) {
                    squad[i] = new Nightelf();
                }
                System.out.println("Es wurden " + squad.length
                        + " Langöhrchen erstellt.");
                break;
            }
        }
        Squad finalSquad = new Squad(name, squad);
        return finalSquad;
    }
}