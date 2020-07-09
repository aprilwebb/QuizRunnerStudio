package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> choices;

    public MultipleChoice(String question, ArrayList<String> choices, String answer) {
        super(question, answer);

        this.choices = choices;
    }
}
