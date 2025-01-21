package programming.collection;

import java.util.ArrayList;

public class PrintOnlySpecifiedType {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(5);
		al.add('c');
		al.add('h');
		al.add("Aandu");
		al.add("Gandu");
		al.add("Qspiders");
		al.add("akfvjs");
		System.out.println(al);
		System.out.println();
		System.out.println("Only Integer");
		for(Object i:al) {
			if(i instanceof Integer)
				System.out.println(i);
		}
		System.out.println();
		System.out.println("Only Character");
		for(Object i:al) {
			if(i instanceof Character)
				System.out.println(i);
		}
		System.out.println();
		System.out.println("Strings start with A/a");
		for(Object i:al) {
			if(i instanceof String && (((String) i).charAt(0)=='A' || ((String) i).charAt(0)=='a'))
				System.out.println(i);
		}
		System.out.println();
		System.out.println("Strings end with S/s");
		for(Object i:al) {
			if(i instanceof String && (((String) i).charAt(((String) i).length()-1)=='S' || ((String) i).charAt(((String) i).length()-1)=='s'))
				System.out.println(i);
		}
	}
}
