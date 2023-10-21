import java.util.HashMap;
import java.util.Map;

public class Student {

    private String studentID;
    private Map<Question, String> answers;

    public Student(String studentID) {
        this.studentID = studentID;
        answers = new HashMap<>();
    }
    public void submitAnswer(Question question, String answer) {
        answers.put(question, answer);
    }

    public String getStudentID() {
        return studentID;
    }

    public Map<Question, String> getAnswers() {
        return answers;
    }
}
