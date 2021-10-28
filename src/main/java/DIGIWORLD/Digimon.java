package DIGIWORLD;

import java.util.ArrayList;

/**
 *
 * @author carlo
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
    public Digimon(String name, Tamer tamer) {
        this.name = name;
        this.level = "baby1";
        this.scream = "zzz";
        this.health = 10;
        this.power = 10;
        this.attack = 2;
        this.defense = 2;
        this.exp = 0;
        this.data = 128;
        this.tamer = tamer;
        this.digivice = tamer.getDigivice();
    }
    
    public Digimon(){
        this.scream = "Waaar";      
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
