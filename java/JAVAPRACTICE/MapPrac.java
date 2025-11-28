package JAVAPRACTICE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPrac {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("Pooja");
		list.add("Bhumi");
		
		List<String> list2 = new ArrayList();
		list2.add("Pooja");
		list2.add("Bhumi");
	Map<Integer, List<String>> studentData = new  HashMap();
	
	studentData.put(101, new ArrayList(list));
	studentData.put(102, new ArrayList(list2));
//	studentData.put(103, "Rekha");
//	studentData.put(104, "Ruhi");
//	studentData.put(105, "Bhumi");
//	studentData.put(106, "Reva");
//	studentData.put(107, "Tanu");
//	studentData.put(108, "Pooja");
//	studentData.put(109, "Rajeshvari");
	
//	Set<Entry<Integer, String>> itr = studentData.entrySet();
//		
//	for(Map.Entry<Integer, String> data :itr) {
//      
//		if(data.getValue().equals("Pooja")) {
//			studentData.put(data.getKey(),"Swapnil");
//		}
//	 
//	}
	
	System.out.println(studentData);
	}
}
