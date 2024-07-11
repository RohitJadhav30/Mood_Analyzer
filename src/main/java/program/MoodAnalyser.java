package program;

// Exception class
@SuppressWarnings("serial")
class MoodAnalysisException extends Exception {
    private MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalysisError error) {
        super(error.toString());
        this.error = error;
    }

    public MoodAnalysisError getError() {
        return error;
    }
}

// Enum for differentiating mood analysis errors
enum MoodAnalysisError {
    NULL_MESSAGE("The message cannot be null"),
    EMPTY_MESSAGE("The message cannot be empty");

    private String message;

    MoodAnalysisError(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}

// Mood analysis class
public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        if (message == null) {
            throw new MoodAnalysisException(MoodAnalysisError.NULL_MESSAGE);
        } else if (message.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisError.EMPTY_MESSAGE);
        }

        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        }
        return "Happy";
    }

    public static void main(String[] args) {

        try {
            // Test case 3.1:
            MoodAnalyser analyser1 = new MoodAnalyser(null);
            System.out.println("Test case 3.1: " + analyser1.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Test case 3.1 Error: " + e.getMessage());
        }

        try {
            // Test case 3.2:
            MoodAnalyser analyser2 = new MoodAnalyser("");
            System.out.println("Test case 3.2: " + analyser2.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Test case 3.2 Error: " + e.getMessage());
        }
    }
}
