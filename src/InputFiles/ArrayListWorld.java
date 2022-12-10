/**
 * 
 */
package InputFiles;

import java.util.ArrayList;

/**
 * @author SyedAtyabHussain
 *
 */
public class ArrayListWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> namesOfSomePeople = new ArrayList<String>();
		
		// Add some names in the list
		namesOfSomePeople.add("Mr A");
		namesOfSomePeople.add("Mr B");
		namesOfSomePeople.add("Mr C");
		namesOfSomePeople.add("Mr D");
		namesOfSomePeople.add("Mr E");
		namesOfSomePeople.add("Mr Z");
		
		// See all the elements in the list
		for(int index=0;index<namesOfSomePeople.size();index++) {
			System.out.println(namesOfSomePeople.get(index));
		}

	}

}
