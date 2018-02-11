package com.rs.client;

import java.util.ArrayList;
import java.util.List;

public class ForEachClient {
	
	public static void main(String[] args) {
		List<String> namesList=null;
		
		namesList=new ArrayList<>();
		
		namesList.add("Lenovo");
		namesList.add("Dell");
		namesList.add("Hp");
		namesList.add("Sony");
		//print the elements
		System.out.println(namesList.get(1)+" "+namesList.get(2)+" "+namesList.get(3));
	}
}