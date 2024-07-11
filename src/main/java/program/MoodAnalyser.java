package program;

//Exception class
@SuppressWarnings("serial")
class MoodAnalysisException extends Exception{
	public MoodAnalysisException(String message) {
		super(message);
	}
}

//enum for differentiate mood analysis errors
enum MoodAnalysisError {
	NULL_OR_EMPTY_MESSAGE;
}

//mood analysis class
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
	
	public String analyseMood() throws MoodAnalysisException {
		try {
			if(message == null || message.isEmpty()){
				throw new MoodAnalysisException("The message cannot be null or empty");
			}
	        message = message.toLowerCase();
	
	        if(this.message.contains("sad")) {
	        	return "Sad";
	        }
	        return "HAPPY";
		}
		catch (NullPointerException e) {
			throw new MoodAnalysisException("the message cannot be null or empty");
		}
    }

	public static void main(String[] args) {
		//Test case 1.1:
		MoodAnalyser analyser1 = new MoodAnalyser();
        analyser1.setMessage("I am in Sad Mood");
        try {
			System.out.println("Test case 1.1: " + analyser1.analyseMood());
		

        // Test case 1.2:
        MoodAnalyser analyser2 = new MoodAnalyser();
        analyser2.setMessage("I am in Happy Mood");
        System.out.println("Test case 1.2: " + analyser2.analyseMood());
        
        //Test case 2.1: Handling null
        MoodAnalyser analyser3 = new MoodAnalyser();
        analyser2.setMessage(null);
        System.out.println("Test case 2.1 - Null case handling: " + analyser3.analyseMood());
        
        } catch (MoodAnalysisException e) {
			System.out.println("Error: " + e.getMessage());
		}

    }
}
