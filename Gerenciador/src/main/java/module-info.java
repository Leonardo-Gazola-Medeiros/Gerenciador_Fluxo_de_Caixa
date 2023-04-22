module experimento.gerenciador {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens experimento.gerenciador to javafx.fxml;
    exports experimento.gerenciador;
    exports experimento.gerenciador.controller;
    exports experimento.gerenciador.model;

    opens  experimento.gerenciador.model to javafx.fxml;
    opens experimento.gerenciador.controller to javafx.fxml;
}


