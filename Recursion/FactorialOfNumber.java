package programming.recursion;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println(fact(num));
		sc.close();
	}

	static int fact(int num) {
		if(num>1)
			return num*fact(num-1);
		return 1;
	}
}
