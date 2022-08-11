module com.grekoff.echo_client {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.grekoff.echo_client to javafx.fxml;
    exports com.grekoff.echo_client;
}