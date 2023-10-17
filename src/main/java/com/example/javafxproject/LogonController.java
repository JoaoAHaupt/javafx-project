package com.example.javafxproject;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LogonController {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private CheckBox checkBoxId;
    @FXML
    private Button buttonCadastroId;
    @FXML
    private Label errorLabel;

    public void onActionCadastrar(Event event){
        errorLabel.setText("");
        String nome = nameTextField.getText();
        String email = emailTextField.getText();
        String telefone = phoneTextField.getText();
        Boolean termos = checkBoxId.isSelected();

        if(!termos){
            errorLabel.setText("Aceite os termos e condições");
        }
        else{
            errorLabel.setText("Usuario cadastrado!");
            errorLabel.setStyle("-fx-text-fill: GREEN;");
        }
    }

}
