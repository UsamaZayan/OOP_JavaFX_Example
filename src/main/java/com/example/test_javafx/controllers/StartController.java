package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class StartController {

    @FXML
    public AnchorPane rootPane;
    Navigation navigation = new Navigation();

    public void onAddStudent(ActionEvent actionEvent) {
        navigation.navigateTo(rootPane, navigation.ADD_STUDENT_FXML);
    }

    public void onShowStudents(ActionEvent actionEvent) {
        navigation.navigateTo(rootPane, navigation.SHOW_STUDENTS_FXML);
    }
}
