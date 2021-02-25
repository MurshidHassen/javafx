package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

public class Welcome {
    @FXML
    private Button loginBtn;
    @FXML
    private Button signBtn;
    @FXML
    private Button layoutsBtn;

    @FXML
    public void pressLoginButton(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            //main.stg.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pressLayoutButton(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layouts.fxml"));
            //Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            // LAYOUT LOGICS HERE
            Pane root = new Pane();

            Rectangle rect = new Rectangle(25, 25, 50, 50);
            rect.setFill(Color.CADETBLUE);

            Line line = new Line(90, 40, 230, 40);
            line.setStroke(Color.BLACK);

            Circle circle = new Circle(130, 130, 30);
            circle.setFill(Color.CHOCOLATE);

            root.getChildren().addAll(rect, line, circle);

            Scene scene = new Scene(root, 250, 220, Color.WHITESMOKE);

            stage.setTitle("Absolute layout");


            stage.setScene(scene);
            stage.show();
            //main.stg.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pressRegisterButton(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            //main.stg.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
