package com.example.triviadefender;

import org.apache.commons.text.StringEscapeUtils;

import java.util.ArrayList;

public class TriviaQuestion implements java.io.Serializable{

    private String question; //The question
    private String correct; //The right answer
    private ArrayList<String> answers = new ArrayList<String>(); //The other answers including the right answer

    TriviaQuestion(String q, String c, ArrayList<String> a){
        this.question = formatter(q);
        this.correct = formatter(c);
        for(String choice: a){
            String f = formatter(choice);
            this.answers.add(f);
        }
    }

    public String getQuestion(){
        return question;
    }

    public String getCorrect(){
        return correct;
    }

    public ArrayList<String> getAnswers(){
        return answers;
    }

    //This is used to convert html into the proper special characters
    public String formatter(String element){
        String results = StringEscapeUtils.unescapeHtml4(element);
        return results;
    }
}
