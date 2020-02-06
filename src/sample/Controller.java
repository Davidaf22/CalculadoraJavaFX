package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    public String operacion="";
    @FXML
    public Label label;
    public TextField ip;
    public TextField puerto;

    @FXML
    void calcular(javafx.event.ActionEvent event) throws IOException {

        String ipA = ip.getText();
        String puertoS = puerto.getText();
        int puertoI = Integer.parseInt(puertoS);


        label.setText(ConexionHilo.conectar(operacion,puertoI,ipA));
        operacion="";

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
