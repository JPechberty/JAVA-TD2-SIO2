package com.courses.javatd2sio2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ComboBox cbCities;
    @FXML
    private TableColumn tcCandidat;
    @FXML
    private TableColumn tcNbVoix;
    @FXML
    private TableView tvResults;
    @FXML
    private Button btnImportData;
    @FXML
    private Label lblSelectedFile;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblSelectedFile.setText("Select a file to import data");
    }

    @FXML
    protected void onSelectFileBtnClick() throws IOException {

    }

    @FXML
    protected void onImportBtnClick(){

    }

    @FXML
    protected void onNationalResultsBtnClicked(){

    }

    @FXML
    protected void onPollingStationResultsBtnClicked(){

    }
}