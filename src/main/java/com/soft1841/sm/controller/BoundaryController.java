package com.soft1841.sm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BoundaryController {
    @FXML
    private BorderPane syContainer;
    @FXML
    public void showCard() throws Exception{
        Stage stage = new Stage();
        Parent card = FXMLLoader.load(getClass().getResource("/fxml/card.fxml"));
        stage.show();
        syContainer.setCenter(card);
    }
}
