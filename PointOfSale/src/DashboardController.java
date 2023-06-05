/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author user
 */
public class DashboardController implements Initializable {

    @FXML
    private Button btnTable;

    Scene fxmlFile;
    Parent root;
    Stage window;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void table(ActionEvent event) {
        try{
            
        }catch(Exception ex){
    
        }
        
    }
    
    private void openModalWindow(String resource, String title)throws IOException{
       root =  FXMLLoader.load(getClass().getResource(resource));
       fxmlFile = new Scene(root);
       window = new Stage();
       window.setScene(fxmlFile);
       window.initModality(Modality.APPLICATION_MODAL);
       window.setAlwaysOnTop(true);
       window.setIconified(false);
       window.initStyle(StageStyle.UNDECORATED);
       window.setTitle(title);
       window.showAndWait();              
    }
}
