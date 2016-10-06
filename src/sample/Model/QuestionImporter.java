package sample.Model;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.in;

/**
 * Created by chris on 2016-10-06.
 */
public class QuestionImporter {


    public static ArrayList<Question> getQuestionsFrom(String filepath) throws IOException {
        ArrayList<Question> questions = new ArrayList<>();
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(filepath));
            String line = br.readLine();
            while (line != null){
                Question q = questionBuilder(line);
                if (q != null) questions.add(q);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(br != null)
                br.close();
        }
        return questions;
    }

    private static Question questionBuilder(String line){
        if (line.startsWith("%")) return null;

        int point = -1;
        String desc = "";
        String correctAnswer = "";
        ArrayList<String> choices = new ArrayList<>();

        String[] splits = line.split("::");

        desc = splits[0];
        point = Integer.valueOf(splits[1]);
        correctAnswer = splits[2];
        String[] ch = splits[3].split(",,");

        for (int i = 0; i < ch.length; i++){
            choices.add(ch[i]);
        }

        return new Question(point,desc,choices,correctAnswer);
    }

}
