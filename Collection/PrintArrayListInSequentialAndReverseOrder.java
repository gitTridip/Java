package programming.collection;

import java.util.ArrayList;

public class PrintArrayListInSequentialAndReverseOrder {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Mohan");
		al.add(10);
		al.add(5);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("------------------------");
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
	}
}
