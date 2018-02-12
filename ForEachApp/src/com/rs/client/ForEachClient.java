package com.rs.client;

import java.util.ArrayList;
import java.util.List;

public class ForEachClient {
	
	public static void main(String[] args) {
		List<String> namesList=null;
		//ArrayList
		namesList=new ArrayList<>();
		
		namesList.add("Lenovo");
		namesList.add("Dell");
		namesList.add("Hp");
		namesList.add("Sony");
		namesList.add("Apple");
		namesList.add("Acer");
		namesList.add("Samsung");
		
		namesList.forEach(name->{
			System.out.println(name+" ");
		});
		//print the elements
		System.out.println(namesList.get(1)+" "+namesList.get(2)+" "+namesList.get(3));
	}
	//new comment
	//old comment
	public static void add(ArrayList list){
		list.add(list);
	}
}