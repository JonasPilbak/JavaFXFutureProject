package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Controller {

    @FXML
    private Pane mainCourse;

    @FXML
    private Pane burgers;

    @FXML
    private Pane sideDish;

    @FXML
    private Pane desert;




    @FXML
    private TextField totalPrice;

    @FXML
    private RadioButton spareRibs;
    @FXML
    private Button courses;

    @FXML
    private Button salats;

    @FXML
    private Button dishes;

    @FXML
    private Button dips;

    ArrayList<String> prices = new ArrayList<>();


    public void goToDesert()
    {


            sideDish.setVisible(false);
            burgers.setVisible(false);
            mainCourse.setVisible(false);
            desert.setVisible(true);


    }
    public void goToBurger()
    {
        mainCourse.setVisible(false);
        desert.setVisible(false);
        sideDish.setVisible(false);
        burgers.setVisible(true);
    }

    public void goToMain()
    {
        mainCourse.setVisible(true);
        desert.setVisible(false);
        sideDish.setVisible(false);
        burgers.setVisible(false);
    }


    public void change()
    {
    courses.setStyle("-fx-background-color: red");
    }
    public void changeBack()
    {
        courses.setStyle("-fx-background-color: grey");
    }



    public void price()
    {

       if (spareRibs.isFocused())
       {
         prices.add("169");
         totalPrice.setText(prices.get(0));


       }
    }
}
