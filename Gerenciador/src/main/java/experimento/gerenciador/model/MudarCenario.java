package experimento.gerenciador.model;

import experimento.gerenciador.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Objects;


public class MudarCenario {

    public MudarCenario(VBox currentVbox, String fxml) throws IOException{
        VBox nextVbox = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxml)));
        currentVbox.getChildren().setAll(nextVbox);


    }

}
