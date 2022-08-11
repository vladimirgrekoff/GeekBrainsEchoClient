module com.grekoff.echo_client {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.grekoff.echo_client to javafx.fxml;
    exports com.grekoff.echo_client;
    exports com.grekoff.echo_client.controllers;
    opens com.grekoff.echo_client.controllers to javafx.fxml;
    exports com.grekoff.echo_client.models;
    opens com.grekoff.echo_client.models to javafx.fxml;
}