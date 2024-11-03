

public abstract class SpacedLogger implements Logger {
// logger has been implemented
	
	/*
 * The SpacedLogger should add a space or " " 
 * between each character of the String argument passed into its methods.
 */
	
	public static void log (String userInput) {
		System.out.println(userInput);
	}
	
	public static void error (String userInput) {
		String errorAdded = ("***Error:" + userInput + "***");
	}
	/*
	 * line of thinking is that the instantiation of the 2 methods should stay the same
	 * within each class, since we aren't trying to modify anything other than what i declared as
	 * userInput
	 */
	private String spacedInput (String userInput) {
		
		StringBuilder spacedUserInput = new StringBuilder();
		for (int i = 0; i <= userInput.length(); i++) {
			spacedUserInput.append(userInput.charAt(i));
			// this accomplishes identifying how many spaces need to be added to userInput
		}
		return spacedUserInput.toString();
		// this returns the spaced version of userInput?
	}
	
	
}
