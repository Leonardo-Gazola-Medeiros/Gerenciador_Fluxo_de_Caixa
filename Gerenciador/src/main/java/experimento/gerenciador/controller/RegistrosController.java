package experimento.gerenciador.controller;


import experimento.gerenciador.model.ConectorH2;
import experimento.gerenciador.model.MudarCenario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import experimento.gerenciador.model.FluxoModel;

public class RegistrosController implements Initializable {
    @FXML
            private VBox layoutRegistros;

    @FXML
            private ComboBox<String> filtrarPor;
    @FXML
            private Label labelFiltros;
    @FXML
            private TableView<FluxoModel> tabelaRegistros;
    @FXML
            private TableColumn<FluxoModel, Integer > id;
    @FXML
            private TableColumn<FluxoModel, String> produto;
    @FXML
            private TableColumn<FluxoModel, String> valor;
    @FXML
            private TableColumn<FluxoModel, Date> data;
    @FXML
            private TableColumn<FluxoModel,String> tipo;
    @FXML
            private TableColumn<FluxoModel, String> segundaParte;
    @FXML
            private TableColumn<FluxoModel, String> notaFiscal;
    @FXML
            private TableColumn<FluxoModel, String> cnpjSegundaParte;
    @FXML
            private TableColumn<FluxoModel, String> intermedio;

    ObservableList<FluxoModel> listaRegistros = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        filtrarPor.setItems(FXCollections.observableArrayList("Todos","Compras","Vendas"));


        id.setCellValueFactory(new PropertyValueFactory<>("ID"));
        produto.setCellValueFactory(new PropertyValueFactory<>("NOME_PRODUTO"));
        valor.setCellValueFactory(new PropertyValueFactory<>("VALOR"));
        tipo.setCellValueFactory(new PropertyValueFactory<>("TIPO"));
        data.setCellValueFactory(new PropertyValueFactory<>("DATA"));




        try{
            ConectorH2 conH2 = new ConectorH2();
            Connection con = conH2.fileconnection();

            String sql = "SELECT * FROM FLUXO";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()) {

                listaRegistros.add(new FluxoModel(
                        resultSet.getString("ID"),
                        resultSet.getString("NOME_PRODUTO"),
                        resultSet.getString("DATA"),
                        resultSet.getString("VALOR"),
                        resultSet.getString("TIPO"),
                        resultSet.getString("SEGUNDA_PARTE"),
                        resultSet.getString("NOTA_FISCAL"),
                        resultSet.getString("CNPJ_SEGUNDA_PARTE"),
                        resultSet.getString("INTERMEDIO")
                ));
            }
            tabelaRegistros.setItems(listaRegistros);


        }catch(Exception exception){

        }

    }

    @FXML
    void entrarMenu() throws IOException {
        new MudarCenario(layoutRegistros, "view/menu.fxml");
    }

    @FXML
    void entrarCompras() throws IOException {
        new MudarCenario(layoutRegistros, "view/compras.fxml");
    }

    @FXML
    void entrarVendas() throws IOException {
        new MudarCenario(layoutRegistros, "view/vendas.fxml");
    }

    @FXML
    void entrarEstoques() throws IOException {
        new MudarCenario(layoutRegistros, "view/estoques.fxml");
    }

}
