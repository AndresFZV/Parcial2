module co.edu.uniquindio.parcial2.parcial2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.parcial2.parcial2 to javafx.fxml;
    exports co.edu.uniquindio.parcial2.parcial2;
    opens co.edu.uniquindio.parcial2.parcial2.viewcontroller to javafx.fxml;
}