package Programming.Recursion;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		if(num==check(num))
			System.out.println("Strong Number");
		else
			System.out.println("Not a strong number");
		sc.close();
	}	
	
	static int check(int num) {
		if(num>0)
			return fact(num%10)+check(num/10);
		return 0;
	}
	
	static int fact(int digit) {
		if(digit>1)
			return digit*fact(digit-1);
		return 1;
	}
}
