/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controladores;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mary Flores
 */
public class ProductosController implements Initializable {

    @FXML
    private Button btnRegistrarProducto;
    @FXML
    private ComboBox<String> Categoria;
    @FXML
    private Button close;
    @FXML
    private AnchorPane anchorderecho;
    @FXML
    private Button btnRegresar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnBuscar;
    @FXML
    private Button btnEliminar;
    @FXML
    private TextField txtNombreP;
    @FXML
    private TextField txtStockP;
    @FXML
    private TextField txtPrecioP;
    @FXML
    private TextField txtIdP;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Categoria.getItems().addAll("Lácteos", "Bebidas", "Abarrotes", "Limpieza");
    }


     @FXML
    void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void regresar(ActionEvent event) throws IOException {
     FXMLLoader loader = new FXMLLoader(getClass().getResource("/archivos/menu.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
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


    @FXML
    private void modificarProducto(ActionEvent event) {
    }

    @FXML
    private void buscarProducto(ActionEvent event) {
    }

    @FXML
    private void eliminarProducto(ActionEvent event) {
    }

}
