package programming.collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateWordsFromString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();
		String [] str=s.split(" ");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		for(String st:str) {
			lhs.add(st);
		}
		s="";
		for(String st:lhs) {
			s=s+st+" ";
		}
		System.out.println(s);
		sc.close();
	}
}
