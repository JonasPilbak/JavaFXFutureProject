package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static javafx.scene.chart.XYChart.*;

public class Bars extends Application {
    final static String[] name = {"Ram", "Søren", " Jonas", "Kasper", " Casper", " Kasper", "Jakob", "Robert", "Anders", "Rasmuss"};
    final static int[] age = {25, 21, 22, 23, 23, 24, 25, 25, 26, 26};

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        //Setting X & y axis
        final CategoryAxis x = new CategoryAxis();
        final NumberAxis y = new NumberAxis();

        final BarChart<String, Number> bc = new BarChart<>(x, y);
        bc.setTitle("Class age");
        x.setLabel("Names");
        y.setLabel("Ages");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Age");

        for (int i = 0; i < 10; i++) {
            series1.getData().add(new XYChart.Data(name[i], age[i]));

        }

        Scene scene = new Scene(bc, 800, 600);


            bc.getData(). add(series1);

        stage.setScene(scene);
        stage.show();
    }
}