import java.util.ArrayList;
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
		
		 int userInput = Integer.parseInt(inputReader.nextLine());
		 System.out.println("User Input: " + userInput);
		 
		 String userInputStr = inputReader.nextLine();
		 System.out.println("User Input: " + userInputStr);
		 
		 inputReader.next()
		 
		 inputReader.close();
		
		String[] myArrayStrings = new String[3];
		
		myArrayStrings[0] = "1";
		myArrayStrings[1] = "2";
		myArrayStrings[2] = "3";
		
		for(int i=0; i<myArrayStrings.length;i++) {
			System.out.println("Element: " + myArrayStrings[i]);
		}
		
		for(int i=0; i<args.length;i++) {
			System.out.println("Element: " + args[i]);
		}
		
		ArrayList<String> listOfStudents = new ArrayList<String>();
		
		listOfStudents.add("Mr A");
		listOfStudents.add("Mr B");
		listOfStudents.add("Mr C");
		
		for(int i=0; i<listOfStudents.size();i++) {
			System.out.println("Element: " + listOfStudents.get(i));
		}
		
		FileManager fileManagerInstance= new FileManager();
		String contentString = fileManagerInstance.getFileContent("");
		System.out.println(contentString);

	}

}
