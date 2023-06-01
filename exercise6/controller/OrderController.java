package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class OrderController implements Initializable {


    @FXML
    Pane item1, item2, item3;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, price1, price2, price3, qty1, qty2, qty3, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (HomeController.blamp.getProductStatus()) {
        item1.setVisible(true);
        name1.setText(HomeController.blamp.getProductName());
        price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
        qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
        }

        if (HomeController.clamp.getProductStatus()) {
        item2.setVisible(true);
        name2.setText(HomeController.clamp.getProductName());
        price2.setText(Double.toString(HomeController.clamp.getProductPrice()));
        qty2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
        }

        if (HomeController.wlamp.getProductStatus()) {
        item3.setVisible(true);
        name3.setText(HomeController.wlamp.getProductName());
        price3.setText(Double.toString(HomeController.wlamp.getProductPrice()));
        qty3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
        }

        // Set total initial amount
        double totalInitialAmount = 0.00;
        if (HomeController.clamp.getProductStatus() || HomeController.blamp.getProductStatus() || HomeController.wlamp.getProductStatus()) {
            totalInitialAmount = HomeController.blamp.getProductQuantity() * HomeController.blamp.getProductPrice() +
            +HomeController.clamp.getProductQuantity() * HomeController.clamp.getProductPrice()
            + HomeController.wlamp.getProductQuantity() * HomeController.wlamp.getProductPrice();
        }
     
        // Display total initial amount in total label
        total.setText(Double.toString(totalInitialAmount));
    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

}