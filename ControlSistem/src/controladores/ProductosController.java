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
public class ProductosController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtStock;
    @FXML
    private TextField txtPrecio;
    @FXML
    private Button btnRegistrarProducto;
    @FXML
    private ComboBox<?> Categoría;
    @FXML
    private Button close;
    @FXML
    private TextField txtId;

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
    void close(ActionEvent event) {
        System.exit(0);
    }
}
