import QnA.Questions;

public class Main {
    public static void main(String[] args) {
        Questions questions = new Questions();
        for (String question : questions.questions) {
            System.out.println(question +"\n");

        }

    }
}