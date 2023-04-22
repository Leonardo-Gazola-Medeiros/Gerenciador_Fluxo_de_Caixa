package experimento.gerenciador.controller;

import experimento.gerenciador.model.MudarCenario;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class VendasController {
    @FXML
    private VBox layoutVendas;

    @FXML
    void entrarMenu() throws IOException {
        new MudarCenario(layoutVendas, "view/menu.fxml");
    }

    @FXML
    void entrarCompras() throws IOException {
        new MudarCenario(layoutVendas, "view/compras.fxml");
    }

    @FXML
    void entrarEstoques() throws IOException {
        new MudarCenario(layoutVendas, "view/estoques.fxml");
    }

    @FXML
    void entrarRegistros() throws IOException {
        new MudarCenario(layoutVendas, "view/registros.fxml");
    }
}
