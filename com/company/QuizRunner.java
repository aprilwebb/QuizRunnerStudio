import com.company.Checkbox;
import com.company.MultipleChoice;
import com.company.Question;
import com.company.TrueFalse;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<Question>();

        questions.add(new TrueFalse("True or False: The sky is blue.", "True"));

        ArrayList<String> choices = new ArrayList<String>();

        choices.add("clouds");
        choices.add("ocean");
        choices.add("dirt");

        questions.add(new MultipleChoice("Which of these is found in the sky? \n A) clouds \n B) ocean \n C) dirt",
                choices, "A"));

        ArrayList<String> checkChoices = new ArrayList<String>();

        choices.add("red");
        choices.add("green");
        choices.add("blue");
        questions.add(new MultipleChoice("Which colors are in the sky? \n 1) red \n 2) blue \n 3) green", checkChoices, "2"));

        for (Question question: questions) {
            // Ask the question
            System.out.println(question);

            // Get an answer from the user
            String choice = input.nextLine();

            // Determine whether or not the user got the question correct
            if (choice.equals(question.getAnswer())) {
                System.out.println("20 points!");
            } else {
                System.out.println("Incorrect");
            }
        }

        System.out.println("Yay!");

        input.close();
    }
}
