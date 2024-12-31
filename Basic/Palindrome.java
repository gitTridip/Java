package Programming.Basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		if(reverse(num)==num)
			System.out.println("Palindrome");
		else 
			System.out.println("Not an palindrome");
		sc.close();
	}

	static int reverse(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		return rev;
	}
}
