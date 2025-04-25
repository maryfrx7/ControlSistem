/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mary Flores
 */
  
public class LoginController implements Initializable {
    @FXML
    private Button close;
    @FXML
    private Button loginBtn;
    @FXML
    private PasswordField password;
    @FXML
    private TextField username;
    
    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    void loginAdmin(ActionEvent event) {
        System.out.println("¡Login presionado!");
    }

    
}
