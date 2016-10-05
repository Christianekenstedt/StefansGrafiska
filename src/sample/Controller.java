package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button clickMeBtn;
    @FXML
    private TextField textField;

    public void clickMeBtnPressed(){
        System.out.println(textField.getText());
        System.out.println("nice!");
    }

}
