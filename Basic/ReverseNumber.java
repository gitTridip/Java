package programming.basic;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		System.out.println("Reverse is: "+reverse(num));
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
