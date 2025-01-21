package programming.main;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many prime number you want to print: ");
		int lim=sc.nextInt();
		int count=0;
		for(int num=2;count<lim;num++) {
			if(check(num,num-1)) {
				count++;
				System.out.print(num+" ");
			}
		}
		sc.close();
	}

	static boolean check(int num,int div) {
		if(div==1)
			return true;
		if(num%div==0)
			return false;
		return check(num,div-1);
	}
}
