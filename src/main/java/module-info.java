module io.github.mthsilva98.sistemabiblioteca {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.mthsilva98 to javafx.fxml;
    exports io.github.mthsilva98;
}