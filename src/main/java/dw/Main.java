package dw;

import dw.Digimon;
import dw.Land;
import dw.Tamer;
import ui.Start;

import java.util.Map;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author carlo
 */
public class Main extends Application {

    public static Stage window;
    public static Start inicio;

    @Override
    public void start(Stage stage) throws Exception {   

        //Inicialización de GUI
        inicio = new Start();
        window = stage;
        window.setTitle("DIGIWORLD v 1.0");
        window.setScene(inicio.setScena());
        window.show();

    }

    public static void main(String[] args) {

        chargingDW();
        Tamer sam = new Tamer();
        Tamer lervi = new Tamer();
        Digimon daru = new Digimon(sam);
        Digimon dot = new Digimon(lervi);
        
        System.out.println(daru.getName());
        System.out.println(dot.getName());
        
        System.out.println(dot.getHealth());
        daru.attack(dot);
        System.out.println(dot.getHealth());
    }

    static void status() {
        System.out.println("La cantidad de terrenos es de...");
        System.out.println(Land.Map.size());
        System.out.println(" ");
    }
    
    static void chargingDW(){
        Land fileIsland = new Land();
        
        //Digimons Baby 1
        Digimon d1 = new Digimon("Botamon","baby 1","none","Buah",10,10,2,2,0,0);
        Digimon d2 = new Digimon("Punimon","baby 1","none","Bru",10,10,2,2,0,0);
        Digimon d3 = new Digimon("Nyokimon","baby 1","none","Bomm",10,10,2,2,0,0);
        Digimon d4 = new Digimon("Pabumon","baby 1","none","Bubba",10,10,2,2,0,0);
        Digimon d5 = new Digimon("Yuramon","baby 1","none","Chick",10,10,2,2,0,0);
        Digimon d6 = new Digimon("Pichimon","baby 1","none","Pic",10,10,2,2,0,0);
        Digimon d7 = new Digimon("Poyomon","baby 1","none","Coco",10,10,2,2,0,0);
        Digimon d8 = new Digimon("SnowBotamon","baby 1","none","Cot",10,10,2,2,0,0);
        Digimon d9 = new Digimon("Cocomon","baby 1","none","Cuh",10,10,2,2,0,0);
        Digimon d10 = new Digimon("Yuumon","baby 1","none","Zi",10,10,2,2,0,0);
        
        //Digimon Baby 2
        Digimon b1 = new Digimon("Koromon","baby 2","none","Burp",10,10,2,2,0,0);
        Digimon b2 = new Digimon("Punimon","baby 2","none","Bru",10,10,2,2,0,0);
        Digimon b3 = new Digimon("Motimon","baby 2","none","Bomm",10,10,2,2,0,0);
        Digimon b4 = new Digimon("Yokomon","baby 2","none","Bubba",10,10,2,2,0,0);
        Digimon b5 = new Digimon("Caprimon","baby 2","none","Chick",10,10,2,2,0,0);
        Digimon b6 = new Digimon("Chibimon","baby 2","none","Chic",10,10,2,2,0,0);
        Digimon b7 = new Digimon("Chocomon","baby 2","none","Coco",10,10,2,2,0,0);
        Digimon b8 = new Digimon("Yaamon","baby 2","none","Cot",10,10,2,2,0,0);
        Digimon b9 = new Digimon("DemiDevimon","baby 2","none","Cuh",10,10,2,2,0,0);
        Digimon b0 = new Digimon("mon","baby 2","none","Zi",10,10,2,2,0,0);
        
        //Rookie Digimon
        Digimon r1 = new Digimon("Agumon","rookie","none","Buah",10,10,2,2,0,0);
        Digimon r2 = new Digimon("Gabumon","rookie","none","Bru",10,10,2,2,0,0);
        Digimon r3 = new Digimon("Tentomon","rookie","none","Bomm",10,10,2,2,0,0);
        Digimon r4 = new Digimon("Betabmon","rookie","none","Bubba",10,10,2,2,0,0);
        Digimon r5 = new Digimon("Growlmon","rookie","none","Chick",10,10,2,2,0,0);
        Digimon r6 = new Digimon("Chimon","rookie","none","Chic",10,10,2,2,0,0);
        Digimon r7 = new Digimon("Cocomon","rookie","none","Coco",10,10,2,2,0,0);
        Digimon r8 = new Digimon("Cotsumon","rookie","none","Cot",10,10,2,2,0,0);
        Digimon r9 = new Digimon("Dotacurimon","rookie","none","Cuh",10,10,2,2,0,0);
        Digimon r10 = new Digimon("YukiDarumon","rookie","none","Zi",10,10,2,2,0,0);
        
        
        //Champion Digimon
        Digimon c1 = new Digimon("Botamon","champion","none","Buah",10,10,2,2,0,0);
        Digimon c2 = new Digimon("Bombmon","champion","none","Bru",10,10,2,2,0,0);
        Digimon c3 = new Digimon("Bommon","champion","none","Bomm",10,10,2,2,0,0);
        Digimon c4 = new Digimon("Bubbmon","champion","none","Bubba",10,10,2,2,0,0);
        Digimon c5 = new Digimon("Chibickmon","champion","none","Chick",10,10,2,2,0,0);
        Digimon c6 = new Digimon("Chicomon","champion","none","Chic",10,10,2,2,0,0);
        Digimon c7 = new Digimon("Cocomon","champion","none","Coco",10,10,2,2,0,0);
        Digimon c8 = new Digimon("Cotsumon","champion","none","Cot",10,10,2,2,0,0);
        Digimon c9 = new Digimon("Curimon","champion","none","Cuh",10,10,2,2,0,0);
        Digimon c0 = new Digimon("Yuumon","champion","none","Zi",10,10,2,2,0,0);
        
        //Armor Digimon
        Digimon a1 = new Digimon("Botamon","armor","none","Buah",10,10,2,2,0,0);
        Digimon a2 = new Digimon("Bombmon","armor","none","Bru",10,10,2,2,0,0);
        Digimon a3 = new Digimon("Bommon","armor","none","Bomm",10,10,2,2,0,0);
        Digimon a4 = new Digimon("Bubbmon","armor","none","Bubba",10,10,2,2,0,0);
        Digimon a5 = new Digimon("Chibickmon","armor","none","Chick",10,10,2,2,0,0);
        Digimon a6 = new Digimon("Chicomon","armor","none","Chic",10,10,2,2,0,0);
        Digimon a7 = new Digimon("Cocomon","armor","none","Coco",10,10,2,2,0,0);
        Digimon a8 = new Digimon("Cotsumon","armor","none","Cot",10,10,2,2,0,0);
        Digimon a9 = new Digimon("Curimon","armor","none","Cuh",10,10,2,2,0,0);
        Digimon a10 = new Digimon("Yuumon","armor","none","Zi",10,10,2,2,0,0);
        
        //Perfect Digimons
        Digimon p1 = new Digimon("Botamon","perfect","none","Buah",10,10,2,2,0,0);
        Digimon p2 = new Digimon("Bombmon","perfect","none","Bru",10,10,2,2,0,0);
        Digimon p3 = new Digimon("Bommon","perfect","none","Bomm",10,10,2,2,0,0);
        Digimon p4 = new Digimon("Bubbmon","perfect","none","Bubba",10,10,2,2,0,0);
        Digimon p5 = new Digimon("Chibickmon","perfect","none","Chick",10,10,2,2,0,0);
        Digimon p6 = new Digimon("Chicomon","perfect","none","Chic",10,10,2,2,0,0);
        Digimon p7 = new Digimon("Cocomon","perfect","none","Coco",10,10,2,2,0,0);
        Digimon p8 = new Digimon("Cotsumon","perfect","none","Cot",10,10,2,2,0,0);
        Digimon p9 = new Digimon("Curimon","perfect","none","Cuh",10,10,2,2,0,0);
        Digimon p10 = new Digimon("Yuumon","perfect","none","Zi",10,10,2,2,0,0);
        
        //Mega Digimon
        Digimon m1 = new Digimon("Botamon","mega","none","Buah",10,10,2,2,0,0);
        Digimon m2 = new Digimon("Bombmon","mega","none","Bru",10,10,2,2,0,0);
        Digimon m3 = new Digimon("Bommon","mega","none","Bomm",10,10,2,2,0,0);
        Digimon m4 = new Digimon("Bubbmon","mega","none","Bubba",10,10,2,2,0,0);
        Digimon m5 = new Digimon("Chibickmon","mega","none","Chick",10,10,2,2,0,0);
        Digimon m6 = new Digimon("Chicomon","mega","none","Chic",10,10,2,2,0,0);
        Digimon m7 = new Digimon("Cocomon","mega","none","Coco",10,10,2,2,0,0);
        Digimon m8 = new Digimon("Cotsumon","mega","none","Cot",10,10,2,2,0,0);
        Digimon m9 = new Digimon("Curimon","mega","none","Cuh",10,10,2,2,0,0);
        Digimon m10 = new Digimon("Yuumon","mega","none","Zi",10,10,2,2,0,0);
        
    }

}
