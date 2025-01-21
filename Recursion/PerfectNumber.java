package programming.recursion;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		if(num==check(num))
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
		sc.close();
	}
	static int check(int num) {
		int factor=num-1;
		int sum=0;
		while(factor!=0) {
			if(num%factor==0)
				sum=sum+factor;
			factor--;
		}
		return sum;
	}
}
