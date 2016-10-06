package sample.Model;

import java.util.ArrayList;

/**
 * Created by chris on 2016-10-06.
 */
public class Question {
    private int point;
    private String description;
    private ArrayList<String> choices;
    private String correctAnswer;

    public Question(int point, String description, ArrayList<String> choices, String correctAnswer) {
        this.point = point;
        this.description = description;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
