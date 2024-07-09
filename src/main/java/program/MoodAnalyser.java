package program;
public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
        message = message.toLowerCase();

        if(this.message.contains("sad")) {
        	return "Sad";
        }

        return "HAPPY";
    }

	public static void main(String[] args) {
		//Test case 1.1
		MoodAnalyser analyser1 = new MoodAnalyser();
        analyser1.setMessage("I am in Sad Mood");
        System.out.println("Test case 1.1: " + analyser1.analyseMood());

        // Test case 1.2:
        MoodAnalyser analyser2 = new MoodAnalyser();
        analyser2.setMessage("I am in Happy Mood");
        System.out.println("Test case 1.2: " + analyser2.analyseMood());
    }
}
