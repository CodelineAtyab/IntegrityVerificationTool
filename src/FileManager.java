import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 */

/**
 * @author SyedAtyabHussain
 *
 */
public class FileManager {
	
	public static String getFileContent(String filePath) {
		String data = "";
		
		try {
			data = new String(Files.readAllBytes(Paths.get("./src/InputFiles/my_intro.txt")), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return data;
	}
}
