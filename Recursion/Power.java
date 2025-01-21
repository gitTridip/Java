package programming.recursion;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		System.out.println("Enter power: ");
		int power=sc.nextInt();
		System.out.println(calc(num,power));
		sc.close();
	}

	static int calc(int num,int power) {
		if(power>0)
			return num*calc(num, power-1);
		return 1;
	}
}
