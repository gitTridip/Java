package Programming.main;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		Stack<Integer> bin=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal value: ");
		int num=sc.nextInt();
		if(num==0)
			bin.push(0);
		else if(num<0)
			System.out.println("NotPossibleException");
		else {
			while (num>0) {
				bin.push(num%2);
				num=num/2;
			}
		}
		
		String binNum="";
		for(Integer i:bin)
			binNum=binNum+i;
		
		System.out.println(binNum);
		sc.close();
	}
}
