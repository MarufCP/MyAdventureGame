/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2v2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/**
 *
 * @author Maruf Siddique
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private Button helpBtn;

    @FXML
    private Label label;

    @FXML
    private Button exitBtn;

    @FXML
    private TextArea txtArea;
    
    private World worldObject;

    @FXML
    private TextField commandTextfield;

    @FXML
    void handleExitButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void handleHelpButton(ActionEvent event) {

        txtArea.setText("valid commands are:\n\tsearch\n\tdescribe\n\tenter n\n\tgo to n\n");
    }
    

    @FXML
    void handlecommandTextfieldchange(ActionEvent event) {
        String data = commandTextfield.getText();

        txtArea.setText("command entered:" + data);
    }
   
    public void startGame(World w) {
        worldObject = w;
        w.start();
        
        String roomD = w.describe();
        txtArea.appendText(roomD);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
