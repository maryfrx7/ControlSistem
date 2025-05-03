/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controladores;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mary Flores
 */
public class EliminarProductosController implements Initializable {

    @FXML
    private TextField txtIdConfirmacion;
    @FXML
    private Button btnAceptar;
    @FXML
    private TextField txtIdEliminar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void eliminarProducto(ActionEvent event) {
        String id = txtIdConfirmacion.getText();
        String idEliminar = txtIdEliminar.getText();

        if (id.isEmpty() || idEliminar.isEmpty() ) {
            System.out.println("Faltan datos por llenar.");
            return;
        }
        try {
            LocalDate fechaActual = LocalDate.now();
            System.out.println("Producto Eliminado");

        } catch (NumberFormatException e) {
            System.out.println("Stock o precio no válidos.");
        }
    }

}
