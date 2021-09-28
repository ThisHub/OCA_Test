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
        int total = 0;
        int correct = 0;

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

        while (go.toLowerCase(Locale.ROOT).equals("y")){
            int questionNo = random.nextInt(199);
            System.out.println(questions.questions.get(questionNo));
            total++;
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.toLowerCase(Locale.ROOT).equals(answers.answers.get(questionNo).toLowerCase(Locale.ROOT))){
                System.out.println("Correct!, here is why: " + explanation.explanations.get(questionNo));
                correct++;
            }
            else
                System.out.println("Incorrect. Better luck next time here is the explanation: \n" + explanation.explanations.get(questionNo));
            double percentage = (double) ((correct*100)/total);
            System.out.println("\nYour current score is "+correct + "/" + total + " or " + percentage + "%");
            System.out.println("\nPress enter to continue, press C to stop");
            while (!go.toLowerCase(Locale.ROOT).equals("")||!go.toLowerCase(Locale.ROOT).equals("c")){
                scanner.nextLine();
                go = scanner.nextLine();

                if (go.toLowerCase(Locale.ROOT).equals("")||go.toLowerCase(Locale.ROOT).equals("c")) {
                    if (go.toLowerCase(Locale.ROOT).equals("")) {
                        go = "y";
                    }
                    if (go.equals("c")){
                        go = "n";
                    }
                    break;
                }
                else
                    System.out.println("Please enter a valid choice.");
            }

        }

//        for (String question : questions.questions) {
//            System.out.println(question +"\n");
//
//        }

//        for (String answer : answers.answers) {
//            System.out.println(answer + "\n");
//        }

    }

    public void getQuestion(int id){
        ;
    }
}
