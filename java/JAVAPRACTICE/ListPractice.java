package JAVAPRACTICE;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Pooja");
		list.add("Bhumi");
		String name = list.get(0);
		
		System.out.println(list);
		
	}
	
}
