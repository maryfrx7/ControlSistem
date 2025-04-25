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
/**
 * FXML Controller class
 *
 * @author Mary Flores
 */
public class MenuController implements Initializable {

    @FXML
    private Button btnRegistrarProducto;
    @FXML
    private Button btnRegistrarCliente;
    @FXML
    private Button btnRegistrarVenta;
    @FXML
    private Button btnHistorialVentas;
    @FXML
    private Button close;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registrarProducto(ActionEvent event) {
    }

    @FXML
    private void registrarCliente(ActionEvent event) {
    }

    @FXML
    private void registrarVenta(ActionEvent event) {
    }

    @FXML
    private void historialVentas(ActionEvent event) {
    }

    @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }
    
}
