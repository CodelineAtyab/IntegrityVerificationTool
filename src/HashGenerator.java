import java.util.Scanner;

/**
 * 
 */

/**
 * @author SyedAtyabHussain
 *
 */
public class HashGenerator {

	/**
	 * This class can be used to generate hashes of files and strings.
	 * @param args: List of arguments received from the command line.
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner inputReader = new Scanner(System.in);
		
		// String userInput = inputReader.nextLine();
		// System.out.println("User Input: " + userInput);
		
		String[] myArrayStrings = new String[3];
		
		myArrayStrings[0] = "1";
		myArrayStrings[1] = "2";
		myArrayStrings[2] = "3";
		
		for(int i=0; i<myArrayStrings.length;i++) {
			System.out.println("Element: " + myArrayStrings[i]);
		}
		
		FileManager fileManagerInstance= new FileManager();
		String contentString = fileManagerInstance.getFileContent("");
		System.out.println(contentString);

	}

}
