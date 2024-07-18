package program;

import moodException.InvalidMoodException;
import java.util.Locale;

public class MoodAnalyzer {
    private String message;

    enum Mood {
        HAPPY, SAD
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
        this.message = "";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {
        String result = "";
        try {
            if (message == null) {
                throw new InvalidMoodException("NULL");
            } else if (message.isEmpty()) {
                throw new InvalidMoodException("EMPTY");
            }

            message = message.toUpperCase(Locale.ROOT);
            if (message.contains(Mood.SAD.toString())) {
                result = "SAD";
            } else if (message.contains(Mood.HAPPY.toString())) {
                result = "HAPPY";
            } else {
                result = "NEUTRAL";
            }
        } catch (InvalidMoodException e) {
            result = e.getMessage();
        } catch (NullPointerException e) {
            result = "NULL";
        }
        return result;
    }

    public static void main(String[] args) {
        MoodAnalyzer analyzer1 = new MoodAnalyzer("I am feeling very happy today!");
        MoodAnalyzer analyzer2 = new MoodAnalyzer("This is a sad moment.");
        MoodAnalyzer analyzer3 = new MoodAnalyzer("");
        MoodAnalyzer analyzer4 = new MoodAnalyzer(null);

        System.out.println(analyzer1.analyseMood()); // Should print "HAPPY"
        System.out.println(analyzer2.analyseMood()); // Should print "SAD"
        System.out.println(analyzer3.analyseMood()); // Should print "EMPTY"
        System.out.println(analyzer4.analyseMood()); // Should print "NULL"
    }
}
