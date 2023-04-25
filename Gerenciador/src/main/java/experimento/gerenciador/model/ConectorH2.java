package experimento.gerenciador.model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectorH2 {

    public String namedatabase = "FluxoCaixa";
    private String url = "jdbc:h2:C:/Users/PC/Desktop/Trabalhos/GitHub/Gerenciador_Fluxo_de_Caixa/Gerenciador/src/main/java/experimento/gerenciador/database/FluxoCaixa";
    private String user = "usuario";
    private String password = "";

    public Connection fileconnection(){
        try {
            Class.forName("org.h2.Driver");
            Connection connectData = DriverManager.getConnection(url,user,password);
            System.out.println("Conectado com Sucesso!");
            return connectData;
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage());
            return null;

        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage());
            return null;

        }

    }

}
