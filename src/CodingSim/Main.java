package CodingSim;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ToggleSwitch toggleSwitch = new ToggleSwitch();
        Controller controller = new Controller();
        //Parent root = FXMLLoader.load(getClass().getResource("switches.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(controller));
        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
