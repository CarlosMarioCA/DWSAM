package UI;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author carlo
 */
public class Start {

    public static Scene scena;
    public static Stage window;

    public Scene setScena() {

        //Se crean objetos de escena.
        BorderPane mark = new BorderPane();
        Button b1 = new Button("Mensaje");
        GridPane g1 = new GridPane();

        Image im1 = new Image("data/inicho.png");
        ImageView ma1 = new ImageView(im1);

        g1.getChildren().add(ma1);
        g1.setAlignment(Pos.CENTER);

        //Se ingresan cosas a Escena.
        mark.setCenter(g1);
        mark.setBottom(ma1);
        this.scena = new Scene(mark, 1500, 800);
        return scena;

    }

}
