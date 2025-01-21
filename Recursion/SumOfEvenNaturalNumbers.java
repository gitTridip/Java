package programming.recursion;

import java.util.Scanner;

public class SumOfEvenNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count:");
		int count=sc.nextInt();
		int sum=0;
		System.out.println("Sum of Even number: "+sum(count,sum));
		sc.close();
	}

	static int sum(int count, int sum) {
		if(count>0)
			return sum+sum(count-1, sum+2);
		return sum;
	}
}
