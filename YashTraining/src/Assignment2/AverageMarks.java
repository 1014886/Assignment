package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}

     public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Student>li=new ArrayList<Student>();
		li.add(new Student(1,"Swapnil",80));
		li.add(new Student(2,"Nil",70));
		li.add(new Student(3,"Swap",60));
		li.add(new Student(4,"Sattya",90));
		
		OptionalDouble avg=li.stream().mapToInt(av->av.marks).average();
		System.out.println("Average of marks of studList: "+avg.getAsDouble());

	}

}



