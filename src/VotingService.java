import java.util.Map;
public class VotingService {
    private Question question;

    public void configureQuestion(Question question) {
        this.question = question;
    }

    public void acceptSubmission(Student student, String answer) {
        if (question != null) {
            Map<String, Integer> answerCounts = question.getAnswerCounts();
            if (answerCounts.containsKey(answer)) {
                answerCounts.put(answer, answerCounts.get(answer) + 1);
            }
        }
    }

    public void outputResults() {
        if (question != null) {
            System.out.println("Question: " + question.getQuestionText());
            for (Map.Entry<String, Integer> entry : question.getAnswerCounts().entrySet()) {
                System.out.println(entry.getKey() + " | Vote Count : " + entry.getValue());
            }
        }
    }
}
