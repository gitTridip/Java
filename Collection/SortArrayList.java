package programming.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("How many value you want to enter: ");
		int lim=sc.nextInt();
		while(lim>0) {
			System.out.print("value: ");
			al.add(sc.nextInt());
			System.out.println();
			lim--;
		}
		sort(al);
		System.out.println(al.toString());
		sc.close();
	}

	static void sort(ArrayList<Integer> al) {
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)>al.get(j)) {
					int x=al.get(i);
					al.set(i, al.get(j));
					al.set(j, x);
				}
			}
		}
		
	}
}
