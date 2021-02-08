package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Welcome {
    @FXML
    private Button loginBtn;
    @FXML
    private Button signBtn;

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
