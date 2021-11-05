package dw;

import static dw.Digimon.DigiList;
import java.util.ArrayList;
import java.util.Iterator;

public class DigiEgg {

    private double data;
    private Tamer tamer;
    public static ArrayList<Digimon> babyList = new ArrayList<>();

    public DigiEgg() {
        this.data = 1;
    }

    public static Digimon randomEgg(){
        digiBabys();
        int sizeGroup = babyList.size();
        int iBaby = (int)(Math.random()*(sizeGroup));
        return babyList.get(iBaby);
    }

    public static void digiBabys() {
        ArrayList<Digimon> babys = new ArrayList<>();
        Iterator<Digimon> it = Digimon.DigiList.iterator();
        while (it.hasNext()) {
            Digimon d = it.next();
            if (d.getLevel() == "baby 1") {
                babys.add(d);
            }
        }
        babyList = babys;
    }
}
