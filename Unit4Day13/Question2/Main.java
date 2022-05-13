package Unit4Day13.Question2;

import java.util.*;
import java.util.stream.Collectors;
public class Main {
	
      public static void main(String[] args) {
		
    	  List<Student> students = new ArrayList<>();
    	     
          students.add(new Student(34,"Anand",400));
          students.add(new Student(39,"Kunal",300));
          students.add(new Student(35,"Prince",200));
          students.add(new Student(14,"Deepak",240));
          students.add(new Student(32,"Saurabh",400));
          
          List<Student> sList =students.stream()
        		  .sorted((s1,s2)->s1.getRoll()>s2.getRoll()?+1:-1)
        		  .filter(s->s.getMarks()<=250).collect(Collectors.toList());
          
          System.out.println("Filtered Student Details");
    	  System.out.println("**************************");
    	  
          for(Student s: sList)
          {
        	  
        	  System.out.println("Student Roll No: "+s.getRoll());
        	  System.out.println("Student Name:"+s.getName());
        	  System.out.println("Student Marks: "+s.getMarks());
        	  System.out.println("-------------------------------");
          }
	}
     
  

}