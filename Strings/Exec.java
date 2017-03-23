package wbl.assignment.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exec {
	public static void main(String args[]){
	Student s = new Student("H456");
	Student s2 = new Student("H456");
	System.out.println(s.equals(s2)); // it will return false because it invokes equals method which is provided by the objects class.
	
	
	Map<Student,ReportCard> studentsReport = new HashMap<Student,ReportCard>(); //map allows only unique values in the key area.
	studentsReport.put(s, new ReportCard());
	studentsReport.put(s2, new ReportCard());
	
	System.out.println(studentsReport.size());
	Set<Student> studentsSet = new HashSet<Student>();

	Student[] students = new Student[100];
	
	for(int i=0;i<100;i++){
		
		studentsSet.add(new Student("H" +i));
	}
	
	System.out.println(studentsSet.size());
	
	long startTime = System.nanoTime();
	System.out.println(studentsSet.contains(new Student("H4")));
	System.out.println("Elapsed time" +(System.nanoTime()-startTime));// gives how much time it took to search for an object in nano seconds
	Student s4 = new Student("H234");
    System.out.println(s.equals(s));
    System.out.println(s.equals(s2) + "  "+s2.equals(s));
    System.out.println(s.equals(s2) + "---" +s2.equals(s4)+"---"+s.equals(s4));
    System.out.println(s.equals(null));
	}

}
