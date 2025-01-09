package Programming.main;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class CheckForValidParenthisis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter parenthish:");
		String p=sc.nextLine();
		Stack<Character> st=new Stack<Character>();
		try {
			for(int i=0;i<p.length();i++) {
				Character c=p.charAt(i);
				if(c=='(' || c=='{' || c=='[')
					st.push(c);
				else if(c==st.peek())
					st.pop();
				else if(c==st.peek())
					st.pop();
				else if(c==st.peek())
					st.pop();
			}
			if(st.isEmpty())
				System.out.println("Valid");
			else
				System.out.println("Not Valid");
			
		} catch (EmptyStackException e) {
			System.out.println("Not valid");
		}
		
		sc.close();
	}
}