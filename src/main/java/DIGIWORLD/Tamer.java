package DIGIWORLD;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Tamer {
    
    private String name;
    private String type;
    private Digimon digimon;
    private Digivice digivice;
    private Emblem emblema;
    public static ArrayList<Digimon> poblation = new ArrayList<>();
    
    
    //GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Digimon getDigimon() {
        return digimon;
    }

    public void setDigimon(Digimon digimon) {
        this.digimon = digimon;
    }

    public Digivice getDigivice() {
        return digivice;
    }

    public void setDigivice(Digivice digivice) {
        this.digivice = digivice;
    }

    public Emblem getEmblema() {
        return emblema;
    }

    public void setEmblema(Emblem emblema) {
        this.emblema = emblema;
    }

    public static ArrayList<Digimon> getPoblation() {
        return poblation;
    }

    public static void setPoblation(ArrayList<Digimon> poblation) {
        Tamer.poblation = poblation;
    }
    
    
    
}
