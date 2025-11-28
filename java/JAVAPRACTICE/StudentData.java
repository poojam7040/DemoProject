package JAVAPRACTICE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class StudentData {
	
	String stdName;
	int rollnum;
	String address;
	long phoneNum;
	
	public StudentData(String stdName, int rollnum, String address, long phoeNum) {
		this.stdName = stdName;
		this.rollnum = rollnum;
		this.address = address;
		this.phoneNum = phoeNum;
	}
	
	public boolean equals(Object o) {
		
		System.out.println("method called");
		StudentData std = (StudentData) o;
		
		if(this.stdName.equals(std.stdName) && this.rollnum == std.rollnum && this.address.equals(std.address) && this.phoneNum == std.phoneNum) {
			return true;
		}
		
		return false;
		
	}
	
	public int hashCode() {
		int hc = 0 ;
		hc = (int) (hc+ rollnum + stdName.hashCode() + phoneNum + address.hashCode());
		return hc;
		
	}
	public String toString() {
		return "[Name : "+this.stdName+", Roll Number : "+this.rollnum + ", Address : "+this.address + ", Mobile Number : "+this.phoneNum+"]";
		
	}
	
	public int compareTo(StudentData std) {
		System.out.println("Metho called compare to");
		  if( this.stdName.compareTo(std.stdName) != 0){
	        return this.stdName.compareTo(std.stdName);
		  }
		else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<StudentData> listOfStudents = new ArrayList<StudentData>();
		
		listOfStudents.add(new StudentData("Zebra", 103, "Nidhan",6730650130l));
		listOfStudents.add(new StudentData("APooja", 101, "Katraj", 8830650130l));
		listOfStudents.add(new StudentData("CPooja", 101, "Katraj", 8830650130l));
		listOfStudents.add(new StudentData("Bhumi", 102, "Nidhan", 9930650130l));
		listOfStudents.add(new StudentData("DShaurya", 103, "Nidhan",6730650130l));
		
		System.out.println(listOfStudents);
		
		HashSet<StudentData> list = new HashSet<StudentData>(listOfStudents);
		
		System.out.println("WE HAVE CONVERTED OVER DATA INTO SET TO REMOVE DUPLICATE DATA ::");
		
		System.out.println(list);
		
		Comparator<StudentData> comparator = (s1, s2) -> {
            int nameCompare = s1.stdName.compareTo(s2.stdName);
            if (nameCompare != 0) {
                return nameCompare; // Sort by name
            } else {
                return s1.rollnum - s2.rollnum; // Tie-breaker: sort by ID
            }
        };

		
		TreeSet<StudentData> treeset = new TreeSet<StudentData>(comparator);
		treeset.addAll(listOfStudents);

		
	//	TreeSet<StudentData> treeset = new TreeSet<StudentData>(listOfStudents);
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("treeset");
		System.out.println();
	    System.out.println(treeset);	
		
	}

	
}
