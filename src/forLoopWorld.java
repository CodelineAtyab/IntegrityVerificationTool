import org.xml.sax.helpers.NamespaceSupport;

/**
 * 
 */

/**
 * @author SyedAtyabHussain
 *
 */
public class forLoopWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int numOfRows=0; numOfRows<4; numOfRows++) {
			for(int numOfCol=0; numOfCol<4; numOfCol++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int numOfRows=0; numOfRows<4; numOfRows++) {
			for(int numOfCol=0; numOfCol<numOfRows+1; numOfCol++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int numOfRows=0; numOfRows<4; numOfRows++) {
			for(int numOfCol=0; numOfCol<numOfRows+1; numOfCol++) {
				System.out.print(numOfCol+1);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		int spaceCount = 4;
		for(int numOfRows=0; numOfRows<5; numOfRows++,spaceCount--) {
			// Number of spaces
			for(int numOfSpaces=0;numOfSpaces<spaceCount;numOfSpaces++) {
				System.out.print(" ");
			}
			for(int numOfCol=0; numOfCol<numOfRows+1; numOfCol++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
