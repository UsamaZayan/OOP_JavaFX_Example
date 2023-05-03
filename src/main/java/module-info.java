module com.example.test_javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires java.naming;


    exports com.example.test_javafx;
    opens com.example.test_javafx to javafx.fxml;
    exports com.example.test_javafx.controllers;
    opens com.example.test_javafx.controllers to javafx.fxml;
    exports com.example.test_javafx.models;
    opens com.example.test_javafx.models to javafx.fxml;
}