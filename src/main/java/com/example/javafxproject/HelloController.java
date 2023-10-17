package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblMensagem;

    @FXML
    private Label titleId;
    
    @FXML
    public void onClickBtnVerMensagem() {
        lblMensagem.setText("LEPO!!!");
        titleId.setText("XAROPE");
    }
}
