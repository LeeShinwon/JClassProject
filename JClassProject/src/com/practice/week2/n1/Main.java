package com.practice.week2.n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.practice.week2.n1.*;

public class Main {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student s = new Student();//객체 선언 후 넣
	
		s.setName("이신원");
		list.add(s);
		list.add(new Student("조수빈"));
		list.add(new Student("김세한"));
		list.add(new Student("남정호"));
		list.add(new Student("김은찬"));
		list.add(new Student("이세비"));
		list.add(new Student("박예봄"));
		list.add(new Student("이승현"));
		list.add(new Student("이세민"));
		list.add(new Student("전현우"));
	
		Collections.sort(list);
		
		
		//list 데이터 출력 
		for(int i=0; i<list.size(); i++) {//보통 .size()를 많이 사용한다.
			System.out.println(list.get(i).toString());
		}
		
		/*for(Student ss: list) {//보통 .size()를 많이 사용한다.
			System.out.println(ss.toString());
		}*/
	}

}
