package DIGIWORLD;

import DIGIWORLD.Digimon;
import DIGIWORLD.Land;
import DIGIWORLD.Tamer;
import DIGIWORLD.UIMain.Start;

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
        window.setScene(inicio.getEscena());
        window.show();

    }

    public static void main(String[] args) {

        Land file = new Land();
        chargingDW();
        Tamer sam = new Tamer();
        Tamer lervi = new Tamer();
        Digimon daru = new Digimon(sam);
        Digimon dot = new Digimon(lervi);
        
        System.out.println(daru.getName());
        System.out.println(dot.getName());
        
        launch(args);
    }

    static void status() {
        System.out.println("La cantidad de terrenos es de...");
        System.out.println(Land.Map.size());
        System.out.println(" ");
    }
    
    static void chargingDW(){
        Land fileIsland = new Land();
        Digimon b1 = new Digimon("Botamon","baby 1","none","Buah",10,10,2,2,0,0);
        Digimon b2 = new Digimon("Bombmon","baby 1","none","Bru",10,10,2,2,0,0);
        Digimon b3 = new Digimon("Bommon","baby 1","none","Bomm", 10, 10,2,2,0,0);
        Digimon b4 = new Digimon("Bubbmon","baby 1","none","Bubba", 10, 10,2,2,0,0);
        Digimon b5 = new Digimon("Chibickmon","baby 1","none","Chick", 10, 10,2,2,0,0);
        Digimon b6 = new Digimon("Chicomon","baby 1","none","Chic", 10, 10,2,2,0,0);
        Digimon b7 = new Digimon("Cocomon","baby 1","none","Coco", 10, 10,2,2,0,0);
        Digimon b8 = new Digimon("Cotsumon","baby 1","none","Cot", 10, 10,2,2,0,0);
        Digimon b9 = new Digimon("Curimon","baby 1","none","Cuh", 10, 10,2,2,0,0);
    }

}
