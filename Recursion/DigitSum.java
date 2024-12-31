package Programming.Recursion;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int sum=0;
		System.out.println(sum(num,sum));
		sc.close();
	}

	static int sum(int num,int sum) {
		if(num>0) {
			sum=sum+sum(num/10,num%10);
		}
		return sum;
	}
}
