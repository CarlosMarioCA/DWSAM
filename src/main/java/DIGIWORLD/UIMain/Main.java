package DIGIWORLD.UIMain;

import DIGIWORLD.Digimon;
import DIGIWORLD.Land;
import DIGIWORLD.Tamer;

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
        window = new Stage();
        window.setTitle("DIGIWORLD v 1.0");
        window.setScene(inicio.getEscena());
        window.show();

    }

    public static void main(String[] args) {

        Land file = new Land();
        Tamer sam = new Tamer();
        Tamer lervi = new Tamer();
        Digimon darumon = new Digimon("Darumon", sam);
        Digimon abimon = new Digimon("Abimon", lervi);

        status();
        darumon.screams();
        darumon.attack(abimon);
    }

    static void status() {
        System.out.println("La cantidad de terrenos es de...");
        System.out.println(Land.Map.size());
        System.out.println(" ");
    }

}
