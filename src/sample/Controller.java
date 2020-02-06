package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class Controller {

    public String operacion="";
    @FXML
    public Label label;

    @FXML
    void calcular(javafx.event.ActionEvent event) throws IOException {

        label.setText(ConexionHilo.conectar(operacion));

    }

    @FXML
    void recogerNumero(javafx.event.ActionEvent event) {

        String valor = ((Button) event.getSource()).getText();
        operacion = operacion + valor;

        label.setText(operacion);
    }

    @FXML
    void recogerOperacion(javafx.event.ActionEvent event) {
        String valor = ((Button) event.getSource()).getText();
        operacion = operacion + valor;

        label.setText(operacion);

    }
}
