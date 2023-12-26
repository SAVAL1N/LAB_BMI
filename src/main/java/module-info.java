module java_lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    exports model;
    exports com.example.main;
    opens model to javafx.fxml;
    opens com.example.main to javafx.fxml;
}
