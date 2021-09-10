package com.practice.week2.n2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Fruit> ft = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		ft.add(new Fruit(101,"Apple",1000));
		ft.add(new Fruit(102,"Kiwi",2000));
		ft.add(new Fruit(103,"Peach",5000));
		ft.add(new Fruit(201,"Banana",3000));
		ft.add(new Fruit(301,"Tomato",2100));
		ft.add(new Fruit(401,"Grape",5500));
		ft.add(new Fruit(501,"Lemon",2000));
		ft.add(new Fruit(601,"Cherry",40000));
		ft.add(new Fruit(701,"Orange",1500));
		ft.add(new Fruit(801,"Melon",7000));
		
		Collections.sort(ft, new FruitComparator());
		
		for(int i=0; i<ft.size(); i++) {
			System.out.println(ft.get(i).toString());
		}
		
		System.out.println("\nFruit List (reverse ordered by name)");
		Collections.sort(ft, new FruitComparatorDesc());
		
		for(Fruit f : ft) {
			System.out.println(f);
		}
		
	}

}
