module com.example.fiftytazo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fiftytazo to javafx.fxml;
    exports com.example.fiftytazo;
}