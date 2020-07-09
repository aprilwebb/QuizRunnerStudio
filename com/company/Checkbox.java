package com.company;
import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<String> choices;

    public Checkbox(String question, ArrayList<String> choices, String answer) {
        super(question, answer);
        this.choices = choices;
    }
}
