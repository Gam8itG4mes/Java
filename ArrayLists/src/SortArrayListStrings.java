import java.util.*;

public class SortArrayListStrings {
	public static void main (String [] args) {
		ArrayList<String> arrli = new ArrayList<String>(10);
		
		arrli.add("ask");
		arrli.add("not");
		arrli.add("what");
		arrli.add("your");
		arrli.add("country");
		arrli.add("can");
		arrli.add("do");
		arrli.add("for");
		arrli.add("you");
		arrli.add("but");
		
		System.out.println("ArrayList before: " + arrli);
		
		sortArrayList(arrli);
		
	}
	
	public static void sortArrayList(ArrayList<String> array) {
		Collections.sort(array);
		System.out.println("ArrayList after : " + array);
	}

}
