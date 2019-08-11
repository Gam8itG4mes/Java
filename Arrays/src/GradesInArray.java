import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class GradesInArray {
	public static void main (String [] args)throws IOException {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int [] grades = new int[5];
		
		
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Filename: ");
		String file = scan.nextLine();
		scan.close();
		
		
		for (int i = 0; i < 5; i++) {
			grades[i] = (r.nextInt(100-1)+1);
		}
		
		System.out.println("\nHere are your random grades:");
		for (int j = 0; j < grades.length; j++) {
			System.out.println("Grade " +(j+1) + ": " +grades[j]);
		}	
		
		PrintWriter writer = new PrintWriter(file, "UTF-8");
		
		writer.println(name);
		for (int k = 0; k < grades.length; k++) {
			writer.print(grades[k] + " ");
		}
		writer.close();
		
	}
}
