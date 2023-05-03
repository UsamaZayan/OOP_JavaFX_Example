package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class StartController {

    @FXML
    public AnchorPane rootPane;
    Navigation navigation = new Navigation();

    public void onAddStudent() {
        navigation.navigateTo(rootPane, navigation.ADD_STUDENT_FXML);
    }

    public void onShowStudents() {
        navigation.navigateTo(rootPane, navigation.SHOW_STUDENTS_FXML);
    }
}
