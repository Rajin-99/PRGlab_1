module com.example.rajinshresthalab1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.rajinshresthalab1 to javafx.fxml;
    exports com.example.rajinshresthalab1;
}