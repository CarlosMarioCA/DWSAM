package DIGIWORLD.UIMain;

import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author carlo
 */
public class Start {

    public static Scene scena;
    public static Stage window;
    
    public Scene getEscena(){
        
        Button b1 = new Button("Mensaje");
        GridPane g1 = new GridPane();
        g1.getChildren().add(b1);
        this.scena = new Scene(g1,200,200);
        return scena;
        
    }
    

}
