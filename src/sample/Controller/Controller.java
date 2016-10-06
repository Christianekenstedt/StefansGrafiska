package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.Model.Question;
import sample.Model.QuestionImporter;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    @FXML
    private Label nrLabel;

    @FXML
    private Label questionDescription;

    @FXML
    private RadioButton radioTwo;

    @FXML
    private RadioButton radioThree;

    @FXML
    private RadioButton radioFour;

    @FXML
    private Button backBtn;

    @FXML
    private RadioButton radioOne;

    @FXML
    private Button nextBtn;

    @FXML
    private MenuItem miImportQuestions;

    private ArrayList<Question> questions;
    @FXML
    void miImportQuestionsClicked(ActionEvent event){
        try {
            questions = QuestionImporter.getQuestionsFrom("src/questions.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void backBtnPressed(ActionEvent event) {

    }

    @FXML
    void nextBtnPressed(ActionEvent event) {
        System.out.println("Questions read from file: ");
        for (Question q: questions){
            System.out.println(q.getDescription() + " with choices: " +q.getChoices().toString());
        }
        questionDescription.setText(questions.get(0).getDescription());
        radioOne.setText(questions.get(0).getChoices().get(0));
        radioTwo.setText(questions.get(0).getChoices().get(1));
        radioThree.setText(questions.get(0).getChoices().get(2));
        radioFour.setText(questions.get(0).getChoices().get(3));

    }
}
