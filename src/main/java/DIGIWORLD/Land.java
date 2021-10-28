package DIGIWORLD;

import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class Land {
    
    private String name;
    private int width;
    private int length;
    public static ArrayList<Land> Map = new ArrayList<>();
    public static ArrayList<Digimon> poblation = new ArrayList<>();

    public Land(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.Map.add(this);
    }
    
    public Land(){
        this.Map.add(this);
    }
    
    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static ArrayList<Land> getMap() {
        return Map;
    }

    public static void setMap(ArrayList<Land> Map) {
        Land.Map = Map;
    }

    public static ArrayList<Digimon> getPoblation() {
        return poblation;
    }

    public static void setPoblation(ArrayList<Digimon> poblation) {
        Land.poblation = poblation;
    }
    
    
    
    
    
}
