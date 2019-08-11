import java.util.*;
public class SortingSentences {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arrli;
		
		System.out.print("Sentence: ");
		String sentence = scan.nextLine();
		
		sentence = sentence.toLowerCase();
		
		String[] arrayOfSent = new String[100];

		arrayOfSent = sentence.split(" ");
		
		arrli = new ArrayList<String>(Arrays.asList(arrayOfSent));
		
		
		//System.out.println(Arrays.toString(arrayOfSent));
		
		SortArrayListStrings.sortArrayList(arrli);
		
		
	}

}
