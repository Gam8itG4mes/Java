
public class Range {
	int [] makeRange(int lower, int upper)
	{
		int arr[] = new int[(upper-lower+1)]; //allocates number of indices
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = lower++;
		}
		return arr;
	}
	
	public static void main (String [] args ) {
		int theArray[];
		
		Range theRange = new Range();
		
		theArray = theRange.makeRange(1, 20);
		System.out.print("The Array: [ ");
		for (int i = 0; i < theArray.length; i++) 
		{
			System.out.print(theArray[i] + " ");
		}
		System.out.println("]");
	}
}
