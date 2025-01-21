package programming.main;

import java.util.Scanner;
import java.util.Stack;

public class ValidCharacterPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter parenthish:");
		String p=sc.nextLine();
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<p.length();i++) {
			Character c=p.charAt(i);
			if(st.isEmpty()||st.peek()!=c)
				st.push(c);
			else
				st.pop();
		}
		p="";
		for(Character c:st) {
			p=p+c;
		}
		if(st.isEmpty())
			System.out.println("No remending character");
		else
			System.out.println(p);
		
		sc.close();
	}
}