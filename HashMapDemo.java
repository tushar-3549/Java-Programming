//package PartTwo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> name = new HashMap<Integer,String>();
		name.put(101, "Tushar");
		name.put(102, "Maruf");
		name.put(103, "Sakib");
		
		System.out.println(name.get(101));
		System.out.println(name.get(102));
		System.out.println(name.get(103));

	}

}
