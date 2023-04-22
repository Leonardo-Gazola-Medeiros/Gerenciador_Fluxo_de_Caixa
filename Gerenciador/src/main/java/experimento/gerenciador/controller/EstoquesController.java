package experimento.gerenciador.controller;


import experimento.gerenciador.model.MudarCenario;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class EstoquesController {
    @FXML
    private VBox layoutEstoques;

    @FXML
    void entrarMenu() throws IOException {
        new MudarCenario(layoutEstoques, "view/menu.fxml");
    }

    @FXML
    void entrarCompras() throws IOException {
        new MudarCenario(layoutEstoques, "view/compras.fxml");
    }

    @FXML
    void entrarVendas() throws IOException {
        new MudarCenario(layoutEstoques, "view/vendas.fxml");
    }

    @FXML
    void entrarRegistros() throws IOException {
        new MudarCenario(layoutEstoques, "view/registros.fxml");
    }
}
