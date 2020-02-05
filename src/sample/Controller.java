package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane potatoPane;

    @FXML
    private Pane dessertPane;

    @FXML
    private Label allYouCanEatSoftLabel;

    @FXML
    private RadioButton ChooseSoftIce;

    @FXML
    private Pane burgers;

    @FXML
    private Pane sideDish;

    @FXML
    private Pane mainCourse;

    @FXML
    private RadioButton spareRibs;

    @FXML
    private RadioButton SpareRibsSauceButton;

    @FXML
    private RadioButton whiskySauceButton;

    @FXML
    private RadioButton BearSauceButton;

    @FXML
    private RadioButton CrispyPotatoButtonPlus10;

    @FXML
    private RadioButton bakedPotatoWSourCream;

    @FXML
    private RadioButton bakedPotatoWSourButter;

    @FXML
    private RadioButton bakedPotatoWSourGarlicButter;

    @FXML
    private Button goToMainCoursesPane;

    @FXML
    private Button goToBurgerPane;

    @FXML
    private Button goToDishes;

    @FXML
    private Button goToPotatoPane;

    @FXML
    private Button goToDesserts;

    @FXML
    private TextField totalPrice;

    ArrayList<String> prices = new ArrayList<>();

    @FXML
    void change(MouseEvent event) {

    }

    @FXML
    void changeBack(MouseEvent event) {

    }

    @FXML
    void chooseAllYouCanEatIce(ActionEvent event) {


    }

    @FXML
    void goToBurger(ActionEvent event) {

        mainCourse.setVisible(false);
        dessertPane.setVisible(false);
        sideDish.setVisible(false);
        burgers.setVisible(true);
        potatoPane.setVisible(false);
    }

    @FXML
    void goToDesert(ActionEvent event) {
        sideDish.setVisible(false);
        burgers.setVisible(false);
        mainCourse.setVisible(false);
        dessertPane.setVisible(true);
        potatoPane.setVisible(false);

    }

    @FXML
    void goToMain(ActionEvent event) {

        mainCourse.setVisible(true);
        dessertPane.setVisible(false);
        sideDish.setVisible(false);
        burgers.setVisible(false);
        potatoPane.setVisible(false);
    }

    @FXML
    void potatoPane(ActionEvent event) {

        potatoPane.setVisible(true);
        burgers.setVisible(false);
        sideDish.setVisible(false);
        dessertPane.setVisible(false);
        mainCourse.setVisible(false);

    }

    @FXML
    void price(ActionEvent event) {
        if (spareRibs.isFocused()) {
            prices.add("169");
            totalPrice.setText(prices.get(0));
        }


    }
}
