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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mary Flores
 */
public class ModificarProductosController implements Initializable {

    @FXML
    private TextField txtNombreNuevo;
    @FXML
    private TextField txtStockNuevo;
    @FXML
    private TextField txtPrecioNuevo;
    @FXML
    private TextField txtIdNuevo;
    @FXML
    private ComboBox<String> CategoriaNuevo;
    @FXML
    private Button btnAceptar;
    @FXML
    private TextField txtIdActual;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CategoriaNuevo.getItems().addAll("Lacteos", "Bebidas", "Limpieza", "Abarrotes");
    }

    @FXML
    private void registrarProducto(ActionEvent event) {
        String idActual = txtIdActual.getText();
        String id = txtIdNuevo.getText();
        String nombreProducto = txtNombreNuevo.getText();
        String stockStr = txtStockNuevo.getText();
        String precioStr = txtPrecioNuevo.getText();

        if (idActual.isEmpty() || id.isEmpty() || nombreProducto.isEmpty() || stockStr.isEmpty() || precioStr.isEmpty() || CategoriaNuevo.getValue() == null) {
            System.out.println("Faltan datos por llenar.");
            return;
        }

        try {
            int stock = Integer.parseInt(stockStr);
            double precio = Double.parseDouble(precioStr);
            LocalDate fechaActual = LocalDate.now();

            System.out.println("Producto Modificado:");
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombreProducto);
            System.out.println("Categoría: " + CategoriaNuevo.getValue());
            System.out.println("Stock: " + stock);
            System.out.println("Precio: $" + precio);
            System.out.println("Fecha: " + fechaActual);

        } catch (NumberFormatException e) {
            System.out.println("Stock o precio no válidos.");
        }
    }

}
