package programming.recursion;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter limit: ");
		int lim=sc.nextInt();
		System.out.print("0 1 ");
		print(0,1,lim);
		sc.close();
	}

	static void print(int num1, int num2, int lim) {
		if(num1+num2<=lim) {
			System.out.print(num1+num2+" ");
			print(num2, num1+num2, lim);
		}
	}
}
