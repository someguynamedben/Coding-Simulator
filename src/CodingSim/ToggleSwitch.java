package CodingSim;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


/**
 * This class created by "TheItachiUchiha" on GitHub via the link to his GitHub repo -> https://gist.github.com/TheItachiUchiha/12e40a6f3af6e1eb6f75
 * I plan to create my own implementation of this code down the road, this just serves as a temporary placeholder. Also I modified it a bit.
 *
 * @author TheItachiUchiha
 * @see <a href="https://gist.github.com/TheItachiUchiha/12e40a6f3af6e1eb6f75">https://gist.github.com/TheItachiUchiha/12e40a6f3af6e1eb6f75</a>
 */
public class ToggleSwitch extends HBox {
    
    private final Label label = new Label();
    private final Button button = new Button();
    
    private SimpleBooleanProperty switchedOn = new SimpleBooleanProperty(false);
    public SimpleBooleanProperty switchOnProperty() { return switchedOn; }
    
    private void init() {
        
        label.setText("OFF");
        
        getChildren().addAll(label, button);
        button.setOnAction((e) -> {
            switchedOn.set(!switchedOn.get());
        });
        label.setOnMouseClicked((e) -> {
            switchedOn.set(!switchedOn.get());
        });
        setStyle();
        bindProperties();
    }
    
    private void setStyle() {
        //Default Width
        setWidth(80);
        label.setAlignment(Pos.CENTER);
        setStyle("-fx-background-color: grey; -fx-text-fill:black; -fx-background-radius: 4;");
        setAlignment(Pos.CENTER_LEFT);
    }
    
    private void bindProperties() {
        label.prefWidthProperty().bind(widthProperty().divide(2));
        label.prefHeightProperty().bind(heightProperty());
        button.prefWidthProperty().bind(widthProperty().divide(2));
        button.prefHeightProperty().bind(heightProperty());
    }
    
    /**
     * Toggles the value of the switch on or off.
     */
    public void toggleOnOrOff(){
        if(switchedOn.getValue()){
            switchedOn.setValue(false);
        }else if(!switchedOn.getValue()){
            switchedOn.setValue(true);
        }
    }
    
    public ToggleSwitch() {
        init();
        switchedOn.addListener((a,b,c) -> {
            if (c) {
                label.setText("ON");
                setStyle("-fx-background-color: red;");
                label.toFront();
            }
            else {
                label.setText("OFF");
                setStyle("-fx-background-color: grey;");
                button.toFront();
            }
        });
    }
}