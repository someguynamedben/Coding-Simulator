package CodingSim;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller controller = new Controller();
        BorderPane borderPane = new BorderPane();
        Text titleText = new Text("Fix all the bugs\n(Turn them off)");
        HBox hBox = new HBox(titleText);
        
        controller.setPrefSize(140, 230);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(5, 5, 0, 5));
        hBox.setStyle("-fx-background-color: silver");
        borderPane.setCenter(controller);
        borderPane.setTop(hBox);
        primaryStage.setTitle(null);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(borderPane));
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
