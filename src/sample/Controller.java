package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller {


    int valueSpareRibs = 169;
    int valueMediumRibs;
    int valueLargeRibs;
    int valueChicken;
    int valueRoute66;
    int totalInPrice;
    ArrayList<Integer> prices = new ArrayList<>();
    //region Variables
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
    private RadioButton origSparePlus20;
    @FXML
    private RadioButton plus40;
    @FXML
    private RadioButton amiRibsAndChickenBreast;
    @FXML
    private RadioButton route66;
    @FXML
    private RadioButton chilliDip;
    @FXML
    private RadioButton smokeyBBQ;
    //endregion
    @FXML
    private RadioButton aioli;
    @FXML
    private RadioButton chipotleMayo;
    @FXML
    private RadioButton ChooseSoftIce;
    @FXML
    private RadioButton showTotal;
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

    @FXML
    void change(MouseEvent event) {
    }

    @FXML
    void changeBack() {
    }

    @FXML
    void chooseAllYouCanEatIce(ActionEvent event) {
    }


//panes and toogle Group

    /**
     * TestCustomFolding
     *
     * @param event
     */
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
        ToggleGroup group = new ToggleGroup();
        spareRibs.setToggleGroup(group);
        origSparePlus20.setToggleGroup(group);
        plus40.setToggleGroup(group);
        route66.setToggleGroup(group);
        amiRibsAndChickenBreast.setToggleGroup(group);
        CrispyPotatoButtonPlus10.setToggleGroup(group);
        chilliDip.setToggleGroup(group);
        smokeyBBQ.setToggleGroup(group);
        aioli.setToggleGroup(group);
        chipotleMayo.setToggleGroup(group);
        bakedPotatoWSourButter.setToggleGroup(group);
        bakedPotatoWSourCream.setToggleGroup(group);
        bakedPotatoWSourGarlicButter.setToggleGroup(group);
        CrispyPotatoButtonPlus10.setToggleGroup(group);
        ChooseSoftIce.setToggleGroup(group);
        showTotal.setToggleGroup(group);



        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                //RadioButton rb = (RadioButton)group.getSelectedToggle();
                //  System.out.println(newValue);

                prices.add(0);
                if (newValue == spareRibs) {
                    prices.add(169);
                }  if (newValue == origSparePlus20) {
                    prices.add(189);

                }  if (newValue == plus40) {
                    prices.add(209);

                }  if (newValue == amiRibsAndChickenBreast) {
                    prices.add(185);

                }  if (newValue == route66) {
                    prices.add(205);

                }  if (newValue == chilliDip) {
                    prices.add(6);

                }  if (newValue == smokeyBBQ) {
                    prices.add(6);

                }  if (newValue == aioli) {
                    prices.add(6);
                }  if (newValue == chipotleMayo) {
                    prices.add(6);
                }  if (newValue == bakedPotatoWSourButter) {
                    prices.add(10);
                }  if (newValue == bakedPotatoWSourCream) {
                    prices.add(10);
                }  if (newValue == bakedPotatoWSourGarlicButter) {
                    prices.add(10);
                }  if (newValue == CrispyPotatoButtonPlus10 ) {
                    prices.add(10);
                }
                if (newValue == ChooseSoftIce){
                    prices.add(49);
                }
                if(newValue == showTotal){
                    prices.add(0);
                }


                int price = 0;
                for (int i = 0; i < prices.size() - 1; i++) {
                    price = prices.get(i) + price;
                }
                totalPrice.setText("" + price);

            }
        });
    }
}







