public class SimulationDriver {
    public static void main(String[] args) {

        // creating a multiple choice question
        MultipleChoiceQuestion mcQuestion = new MultipleChoiceQuestion("Which car manufacturer is American?");
        mcQuestion.configureAnswer("A.) Honda");
        mcQuestion.configureAnswer("B.) Ford");
        mcQuestion.configureAnswer("C.) Chevrolet");

        VotingService mcVotingService = new VotingService();
        mcVotingService.configureQuestion(mcQuestion);

        // creating a single choice question
        SingleChoiceQuestion scQuestion = new SingleChoiceQuestion("Which is the least valuable chess piece?");
        scQuestion.configureAnswer("A.) Pawn");
        scQuestion.configureAnswer("B.) Knight");
        scQuestion.configureAnswer("C.) Bishop");

        VotingService scVotingService = new VotingService();
        scVotingService.configureQuestion(scQuestion);

        // creating students and their answers
        Student student1 = new Student("01");
        student1.submitAnswer(mcQuestion, "B.) Ford");
        mcVotingService.acceptSubmission(student1, "B.) Ford");

        Student student2 = new Student("02");
        student2.submitAnswer(mcQuestion, "C.) Chevrolet");
        mcVotingService.acceptSubmission(student2, "C.) Chevrolet");

        Student student3 = new Student("03");
        student3.submitAnswer(scQuestion, "A.) Pawn");
        scVotingService.acceptSubmission(student3, "A.) Pawn");

        Student student4 = new Student("04");
        student1.submitAnswer(mcQuestion, "A.) Honda");
        mcVotingService.acceptSubmission(student1, "A.) Honda");

        Student student5 = new Student("05");
        student3.submitAnswer(scQuestion, "B.) Knight");
        scVotingService.acceptSubmission(student3, "B.) Knight");

        // output the results for both questions
        mcVotingService.outputResults();
        scVotingService.outputResults();
    }
}