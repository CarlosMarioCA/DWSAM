package DIGIWORLD;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author SAM
 */
public class Digimon {
    
    private String name;
    private String level;
    private String type;
    private String scream;
    private int health;
    private int power;
    private int attack;
    private int defense;
    private double exp;
    private double data;
    private Tamer tamer;
    private Digivice digivice;
    public static ArrayList<Digimon> DigiList = new ArrayList<>();
    
    //CONSTRUCTORS
    
    //Nacimiento por digitama con tamer.
    public Digimon(Tamer tamer) {
        Digimon birth = DigiEgg.randomEgg();
        this.name = birth.getName();
        this.level = birth.getLevel();
        this.scream = birth.getScream();
        this.health = birth.getHealth();
        this.power = birth.getPower();
        this.attack = birth.getAttack();
        this.defense = birth.getDefense();
        this.exp = 0;
        this.data = 128;
        this.tamer = tamer;
        this.digivice = tamer.getDigivice();
    }
    
    //Creación para BD
    public Digimon(String name, String level, String type, String scream, int health, int power, int attack, int defense, double exp, double data) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.scream = scream;
        this.health = health;
        this.power = power;
        this.attack = attack;
        this.defense = defense;
        this.exp = exp;
        this.data = data;
        DigiList.add(this);
    }
    
    //FUNCTIONS
    
    public void digievolve(){
        
    }
    
    public void attack(Digimon d){
        int hi = d.getHealth();
        int hf = hi - (this.attack - (d.getDefense()/2));
        d.setHealth(hf);
        System.out.println("La nueva vida de " + d.getName() + " es " + d.getHealth());
    }
    
    public void screams(){
        System.out.println(this.scream);
    }
    
    //GETTERS % SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScream() {
        return scream;
    }

    public void setScream(String scream) {
        this.scream = scream;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Tamer getTamer() {
        return tamer;
    }

    public void setTamer(Tamer tamer) {
        this.tamer = tamer;
    }

    public Digivice getDigivice() {
        return digivice;
    }

    public void setDigivice(Digivice digivice) {
        this.digivice = digivice;
    }

    public static ArrayList<Digimon> getDigiList() {
        return DigiList;
    }

    public static void setDigiList(ArrayList<Digimon> DigiList) {
        Digimon.DigiList = DigiList;
    }
    
    
    
    
}
