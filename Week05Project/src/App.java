
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// so now in order to display the methods, i need to call them
	
		
// this is the test for asterisk logger
		System.out.println("AsteriskLogger Test");
 AsteriskLogger.log("Sword");
 AsteriskLogger.error("Sword");
 
 System.out.println("------------------");
        System.out.println("SpacedLogger Test");
        
SpacedLogger.log("Sword");
SpacedLogger.error("Sword");
	
	
	
	}
	// created the logger interface
	public interface Logger {
		public void log();
		public void error();
	}
	public abstract class AsteriskLogger implements Logger{
		
		// implements Logger
				
				/*
				 * The log method on the AsteriskLogger should print out the String it receives between
				 * 3 asterisks on either side of the String
				 */
				
				public static void log (String userInput) {
					System.out.println("***" + userInput + "***");
				}
				/*
				 * The error method on the AsteriskLogger should print the String
				 *  it receives inside a box of asterisks, with the String preceded by the word “ERROR:”
				 */
				public static void error (String userInput) {
					String errorAdded = ("***Error:" + userInput + "***");
					//accomplishes the error portion
					// need to make a box border, iterate border base on input length?
					int borderSize = errorAdded.length();
					// pulled input length
					StringBuilder borderActual = new StringBuilder();
					
					
					
					for (int i = 0; i <= borderSize; i++) {
						borderActual.append("*");
					}
					// i believe that, that should make the border based on the length of the data placed in
					System.out.println(borderActual.toString());
					System.out.println(errorAdded);
					System.out.println(borderActual.toString());
					/*
					 * Sysout's should make it look like this
					 * ******************
					 * ***Error: Hello***
					 * ******************
					 */
}

	}
	public static abstract class SpacedLogger implements Logger {
		// logger has been implemented
			
			/*
		 * The SpacedLogger should add a space or " " 
		 * between each character of the String argument passed into its methods.
		 */
			
			public static void log (String userInput) {
				System.out.println(spacedInput(userInput));
				
			}
			
			public static void error (String userInput) {
				String errorAdded = ("Error:" + spacedInput(userInput));
				System.out.println(errorAdded);
			}
			static /*
			 * line of thinking is that the instantiation of the 2 methods should stay the same
			 * within each class, since we aren't trying to modify anything other than what i declared as
			 * userInput
			 */
			 String spacedInput (String userInput) {
				
				StringBuilder spacedUserInput = new StringBuilder();
				for (int i = 0; i < userInput.length(); i++) {
					spacedUserInput.append(userInput.charAt(i));
					// this accomplishes identifying how many spaces need to be added to userInput
					if (i < userInput.length() - 1) {
						spacedUserInput.append(" ");
					}
				}
				return spacedUserInput.toString();
				// this returns the spaced version of userInput?
			}
	
	
	
	
	
	
	
	
	}	
	
	
}
