package CodingSim;

import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * Custom pane that contains the switches for the program.
 */
public class Controller extends Pane{
    private ToggleSwitch switchOne = new ToggleSwitch();
    private ToggleSwitch switchTwo = new ToggleSwitch();
    private ToggleSwitch switchThree = new ToggleSwitch();
    private ToggleSwitch switchFour = new ToggleSwitch();
    private ToggleSwitch switchFive = new ToggleSwitch();
    private ToggleSwitch switchSix = new ToggleSwitch();
    private Text bug258 = new Text("Bug #258");
    private Text bug259 = new Text("Bug #259");
    private Text bug260 = new Text("Bug #260");     //I should've named these differently so it'd be easier to refer to
    private Text bug261 = new Text("Bug #261");     //them while programming, but oh well.
    private Text bug262 = new Text("Bug #262");
    private Text bug263 = new Text("Bug #263");
    private HBox hBoxOne = new HBox(switchOne, bug258);
    private HBox hBoxTwo = new HBox(switchTwo, bug259);
    private HBox hBoxThree = new HBox(switchThree, bug260);
    private HBox hBoxFour = new HBox(switchFour, bug261);
    private HBox hBoxFive = new HBox(switchFive, bug262);
    private HBox hBoxSix = new HBox(switchSix, bug263);
    private VBox vBox = new VBox(hBoxOne, hBoxTwo, hBoxThree, hBoxFour, hBoxFive, hBoxSix);
    
    /**
     * Constructor for the custom pane. Sets up the switches and stuffs.
     */
    Controller(){
        switchOne.setMinHeight(25);
        switchOne.setMaxHeight(25);
        switchOne.setMinWidth(50);
        switchOne.setMaxWidth(50);
        
        switchTwo.setMinHeight(25);
        switchTwo.setMaxHeight(25);
        switchTwo.setMinWidth(50);
        switchTwo.setMaxWidth(50);
        
        switchThree.setMinHeight(25);
        switchThree.setMaxHeight(25);
        switchThree.setMinWidth(50);
        switchThree.setMaxWidth(50);
        
        switchFour.setMinHeight(25);
        switchFour.setMaxHeight(25);
        switchFour.setMinWidth(50);
        switchFour.setMaxWidth(50);
        
        switchFive.setMinHeight(25);
        switchFive.setMaxHeight(25);
        switchFive.setMinWidth(50);
        switchFive.setMaxWidth(50);
        
        switchSix.setMinHeight(25);
        switchSix.setMaxHeight(25);
        switchSix.setMinWidth(50);
        switchSix.setMaxWidth(50);
        
        hBoxOne.setSpacing(10);
        hBoxTwo.setSpacing(10);
        hBoxThree.setSpacing(10);
        hBoxFour.setSpacing(10);
        hBoxFive.setSpacing(10);
        hBoxSix.setSpacing(10);
        
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20));
        vBox.setStyle("-fx-background-color: silver");
    
        switchOne.setOnMouseClicked(this::handleButtonClick);
        switchTwo.setOnMouseClicked(this::handleButtonClick);
        switchThree.setOnMouseClicked(this::handleButtonClick);
        switchFour.setOnMouseClicked(this::handleButtonClick);
        switchFive.setOnMouseClicked(this::handleButtonClick);
        switchSix.setOnMouseClicked(this::handleButtonClick);
        
        switchTwo.toggleOnOrOff();
        switchFive.toggleOnOrOff();
        
        this.getChildren().add(vBox);
    }
    
    /**
     * Handles what happens when a switch is clicked on.
     *
     * @param mouseEvent Mouse clicked event.
     */
    private void handleButtonClick(MouseEvent mouseEvent){
        if(mouseEvent.getSource().equals(switchOne)){
            switchThree.toggleOnOrOff();
        }else if(mouseEvent.getSource().equals(switchTwo)){
            switchThree.toggleOnOrOff();
            switchFour.toggleOnOrOff();
        }else if(mouseEvent.getSource().equals(switchThree)){
            switchSix.toggleOnOrOff();
            switchFour.toggleOnOrOff();
            switchTwo.toggleOnOrOff();
        }else if(mouseEvent.getSource().equals(switchFour)){
            switchFive.toggleOnOrOff();
            switchOne.toggleOnOrOff();
        }else if(mouseEvent.getSource().equals(switchFive)){
            switchOne.toggleOnOrOff();
            switchThree.toggleOnOrOff();
        }else if(mouseEvent.getSource().equals(switchSix)){
            switchTwo.toggleOnOrOff();
        }
    }
}
