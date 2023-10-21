import java.util.HashMap;
import java.util.Map;
public class Question {

    private String questionText;
    private Map<String, Integer> answerCounts;

    public Question(String questionText) {
        this.questionText = questionText;
        answerCounts = new HashMap<>();
    }

    public void configureAnswer(String answer) {
        answerCounts.put(answer, 0);
    }

    public String getQuestionText() {
        return questionText;
    }

    public Map<String, Integer> getAnswerCounts() {
        return answerCounts;
    }

}
