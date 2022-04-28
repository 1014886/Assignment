package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentName {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<String>();
		al.add("Swapnil");
		al.add("Nil");
		al.add("Anil");
		al.add("Sattya");
		al.add("Pappu");
		al.add("aadi");
		
		List<String> ls=al.stream().filter(obj->obj.toUpperCase().charAt(0)=='A').collect(Collectors.toList());
		System.out.println("List of Names which are starts with A: "+ls);

	}

}



