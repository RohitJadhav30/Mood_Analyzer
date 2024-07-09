package program;

public class MoodAnalyzer {
	
	public String analyzeMood(String message) {
		message = message.toLowerCase();
		 
		if(message.contains("sad")) {
			return "sad";
		}
		
		return "happy";
	}

	public static void main(String[] args) {
		//Test case 1.1
		String message = "I am in a sad mood";
		
		//test case 1.2
		String message1 = "I am in a happy mood";
		
		MoodAnalyzer analyze = new MoodAnalyzer();
		//Test case 1.1
		System.out.println("Test case 1.1 - The mood is: " + analyze.analyzeMood(message));
		
		//test case 1.2
		System.out.println("Test case 1.2 - The mood is: " + analyze.analyzeMood(message1));


	}

}
