package experimento.gerenciador.controller;


import experimento.gerenciador.model.ConectorH2;
import experimento.gerenciador.model.MudarCenario;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import javax.swing.text.html.ListView;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class ComprasController {

    @FXML
    private VBox layoutCompras;

    @FXML
    void entrarMenu() throws IOException {
        new MudarCenario(layoutCompras, "view/menu.fxml");
    }

    @FXML
    void entrarVendas() throws IOException {
        new MudarCenario(layoutCompras, "view/vendas.fxml");
    }

    @FXML
    void entrarEstoques() throws IOException {
        new MudarCenario(layoutCompras, "view/estoques.fxml");
    }

    @FXML
    void entrarRegistros() throws IOException {
        new MudarCenario(layoutCompras, "view/registros.fxml");
    }


}
