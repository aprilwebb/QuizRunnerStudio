package com.company;

public abstract class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public String getAnswer () {
        return answer;
    }

    @Override
    public String toString(){
        return question;
    }
}



