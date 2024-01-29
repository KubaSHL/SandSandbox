module com.example.sandboxsimulator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.sandboxsimulator to javafx.fxml;
    exports com.example.sandboxsimulator;
}