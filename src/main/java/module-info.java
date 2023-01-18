module com.example.tema4 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tema4 to javafx.fxml;
    exports com.example.tema4;
}