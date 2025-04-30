/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controladores;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
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
    private TextField txtId;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void registrarProducto(ActionEvent event) {
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
