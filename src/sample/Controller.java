package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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

    @FXML
    private RadioButton aioli;

    @FXML
    private RadioButton chipotleMayo;

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

    int valueSpareRibs = 169;
    int valueMediumRibs;
    int valueLargeRibs;
    int valueChicken;
    int valueRoute66;
    int totalInPrice;
    @FXML
    private TextField totalPrice;

    ArrayList<Integer> prices = new ArrayList<>();

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




        ToggleGroup group = new ToggleGroup();

        spareRibs.setToggleGroup(group);
        origSparePlus20.setToggleGroup(group);
        plus40.setToggleGroup(group);
        route66.setToggleGroup(group);
        amiRibsAndChickenBreast.setToggleGroup(group);
/*
        if (spareRibs.isFocused()) {
            int rib = 169;
            totalPrice.setText("" + rib);



        } else if (origSparePlus20.isFocused())
        {

        }


 */

     group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
         @Override
         public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
             //RadioButton rb = (RadioButton)group.getSelectedToggle();
           //  System.out.println(newValue);
             if (newValue == spareRibs)
             {
                 valueSpareRibs = 169;
                 totalPrice.setText("" + valueSpareRibs);
             }
             else if (newValue == origSparePlus20)
             {
                 valueMediumRibs = 189;
                 totalPrice.setText("" + valueMediumRibs);
             }
            else if (newValue == plus40)
            {
                valueLargeRibs = 209;
                totalPrice.setText("" + valueLargeRibs);
            }
             else if (newValue == amiRibsAndChickenBreast)
             {
                 valueChicken = 185;
                 totalPrice.setText("" + valueChicken);
             }
             else if (newValue == route66)
             {
                 valueRoute66 = 255;
                 totalPrice.setText("" + valueRoute66);
             }

         }
     });




/*
        if(ChooseSoftIce.isFocused()){
            prices.add(49);
        }
        if(chilliDip.isFocused()){
            prices.add(6);
        }
        if(chipotleMayo.isFocused()){
            prices.add(6);
        }
        if(smokeyBBQ.isFocused()){
            prices.add(6);
        }
        if(aioli.isFocused()){
            prices.add(6);
        }
        /*
        if (origSparePlus20.isFocused())
        {
            prices.add(20);
        }


        if(CrispyPotatoButtonPlus10.isFocused())
        {
            prices.add(10);
            totalPrice.setText("" + prices.get(1));
        }
  */

        /*
        int price = 0;
        for (int i = 0; i <prices.size()-1 ; i++) {
             String test2 = prices.get(i);
             price = Integer.parseInt(test2.trim());
             price = price+price;


        }

        String newtotalPrice = Integer.toString(price);
        totalPrice.setText(newtotalPrice);


         */
    }





}

