

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

@Override
public void log() {
	// TODO Auto-generated method stub
	
}
@Override
public void error() {
	// TODO Auto-generated method stub
	// eclipse forced me to make this for code to run???
}


}




