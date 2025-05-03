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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mary Flores
 */
public class BuscarProductosController implements Initializable {

    @FXML
    private TextField txtNombreBuscar;
    @FXML
    private TextField txtStockBuscar;
    @FXML
    private TextField txtPrecioBuscar;
    @FXML
    private TextField txtIdBuscar;
    @FXML
    private ComboBox<?> CategoriaBuscar;
    @FXML
    private Button btnAceptar;

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
    
}
