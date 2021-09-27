import QnA.Answers;
import QnA.Explanation;
import QnA.Questions;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Questions questions = new Questions();
        Answers answers = new Answers();
        Explanation explanation = new Explanation();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("!!!Heads up, One question you will find an image.\n" +
                "This image will barely be recognisable.\n" +
                "Just know they are supposed to be 3 interlocking circles\n" +
                "Thanks in advance! :D !!!\n");
        System.out.println("Ready? Y/N");
        String go = "";
        while (!go.toLowerCase(Locale.ROOT).equals("y")||!go.toLowerCase(Locale.ROOT).equals("n")){
         go = scanner.next();
         if (go.toLowerCase(Locale.ROOT).equals("y")||go.toLowerCase(Locale.ROOT).equals("n"))
             break;
         else
             System.out.println("Please enter a valid choice.");
        }

//        for (String question : questions.questions) {
//            System.out.println(question +"\n");
//
//        }

//        for (String answer : answers.answers) {
//            System.out.println(answer + "\n");
//        }

    }
}
