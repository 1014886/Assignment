package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class City {
	
	String cityName;
	int cityPopulation;
	int cityArea;
	

	public City(String cityName, int cityPopulation, int cityArea) {
		this.cityName = cityName;
		this.cityPopulation = cityPopulation;
		this.cityArea = cityArea;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<City> al=new ArrayList<City>();
		al.add(new City("Nagar",100000,500));
		al.add(new City("Mumbai",500000,800));
		al.add(new City("Pune",120000,700));
		al.add(new City("Nagpur",50000,900));
		al.add(new City("Chennai",70000,200));
		
		City Hp=al.stream().max((obj1,obj2)->obj1.cityPopulation>obj2.cityPopulation?1:-1).get();
		System.out.println("City with highest population: "+Hp.cityName);
		
		List<Integer> set=al.stream().map(e->e.cityPopulation).collect(Collectors.toList());
		System.out.println("Set of city population: "+set);
		
		City minArea=al.stream().min((obj1,obj2)->obj1.cityArea>obj2.cityArea?1:-1).get();
		System.out.println("city withmin area: "+minArea.cityArea);
		

	}

}





