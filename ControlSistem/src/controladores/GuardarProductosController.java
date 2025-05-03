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
public class GuardarProductosController implements Initializable {

    @FXML
    private TextField txtNombreP;
    @FXML
    private TextField txtStockP;
    @FXML
    private TextField txtPrecioP;
    @FXML
    private TextField txtIdP;
    @FXML
    private ComboBox<String> Categoria;
    @FXML
    private Button btnAceptar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Categoria.getItems().addAll("Lacteos", "Bebidas", "Limpieza", "Abarrotes");
    }

    private void comboEvent(ActionEvent event) {
        System.out.println(Categoria.getValue());
    }

    @FXML
    private void registrarProducto(ActionEvent event) {
        String id = txtIdP.getText();
        String nombreProducto = txtNombreP.getText();
        String stockStr = txtStockP.getText();
        String precioStr = txtPrecioP.getText();

        if (id.isEmpty() || nombreProducto.isEmpty() || stockStr.isEmpty() || precioStr.isEmpty() || Categoria.getValue() == null) {
            System.out.println("Faltan datos por llenar.");
            return;
        }

        try {
            int stock = Integer.parseInt(stockStr);
            double precio = Double.parseDouble(precioStr);
            LocalDate fechaActual = LocalDate.now();

            System.out.println("Producto registrado:");
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombreProducto);
            System.out.println("Categoría: " + Categoria.getValue());
            System.out.println("Stock: " + stock);
            System.out.println("Precio: $" + precio);
            System.out.println("Fecha: " + fechaActual);

        } catch (NumberFormatException e) {
            System.out.println("Stock o precio no válidos.");
        }
    }

}
