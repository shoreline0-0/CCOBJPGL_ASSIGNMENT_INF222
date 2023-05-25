package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinkController {

	@FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Milktea milktea = new Milktea();
    PineappleJuice pineapplejuice = new PineappleJuice();
    Rootbeer rootbeer = new Rootbeer();
    Tea tea = new Tea();
    Water water = new Water();

    public void initialize() {

        milktea.setColor("Brown");
        milktea.setTaste("Very Sweet");

        pineapplejuice.setColor("Yellow");
        pineapplejuice.setTaste("Sweet and Sour");
        
        rootbeer.setColor("Black");
        rootbeer.setTaste("Sweet");

        tea.setColor("Dark brown");
        tea.setTaste("Bitter");

        water.setColor("Transparent");
        water.setTaste("No taste");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton == btn1) {
            alert.setContentText("Pineapple juices are " + pineapplejuice.getColor() + " and " + pineapplejuice.getTaste());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Milkteas are " + milktea.getColor() + " and " + milktea.getTaste());
        }
        
        if (sourceButton.equals(btn3)) {
            alert.setContentText("Rootbeers are " + rootbeer.getColor() + " and " + rootbeer.getTaste());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Waters are " + water.getColor() + " and " + water.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Teas are " + tea.getColor() + " and " + tea.getTaste());
        }

        alert.showAndWait();

    }
}