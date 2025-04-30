/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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
        String user = username.getText();
        String pass = password.getText();
        
        if(user.equals("admin") && pass.equals("1234")){
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/archivos/menu.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setTitle("Error de login");
            alerta.setHeaderText("Credenciales incorrectas");
            alerta.setContentText("Usuario o contraseña incorrectos");
            alerta.showAndWait();
        }
    }

    
}
