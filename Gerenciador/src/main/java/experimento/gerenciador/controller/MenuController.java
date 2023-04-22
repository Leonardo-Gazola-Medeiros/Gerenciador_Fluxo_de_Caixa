package experimento.gerenciador.controller;

import experimento.gerenciador.model.MudarCenario;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.io.IOException;


public class MenuController {

    @FXML
    private VBox layoutMenu;

    @FXML
    void entrarCompras() throws IOException {
        new MudarCenario(layoutMenu, "view/compras.fxml");
    }

    @FXML
    void entrarVendas() throws IOException {
        new MudarCenario(layoutMenu, "view/vendas.fxml");
    }

    @FXML
    void entrarEstoques() throws IOException {
        new MudarCenario(layoutMenu, "view/estoques.fxml");
    }

    @FXML
    void entrarRegistros() throws IOException {
        new MudarCenario(layoutMenu, "view/registros.fxml");
    }

}
