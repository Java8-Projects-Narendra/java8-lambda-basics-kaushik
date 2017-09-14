package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java.model.Person;

public class LambdaExercise {
	
	
	public static void main(String[] args) {
		//-------------- task 1 - sort list by first name
		//------ Using java 7 way
		List<Person> personList = Arrays.asList( new Person("narendra", "nirala", 27), 
				new Person("pankaj", "yadav", 27),
				new Person("sanjay", "sahu", 28),
				new Person("prakash", "solemn", 27),
				new Person("bhagwat", "chandra", 30));
		
		
		Comparator<Person> comp = new Comparator<Person>() {	
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getFirstName().compareTo(p2.getFirstName());
			}
		};
		
		Collections.sort(personList, comp);
		
		System.out.println(personList);
		
		//------Java 8 way
		List<Person> personList2 = Arrays.asList( new Person("narendra", "nirala", 27), 
				new Person("pankaj", "yadav", 27),
				new Person("sanjay", "sahu", 28),
				new Person("prakash", "solemn", 27),
				new Person("bhagwat", "chandra", 30));
		
		Collections.sort(personList2, (person1,person2) -> person1.getFirstName().compareTo(person2.getFirstName()));
		System.out.println(personList2);
		
		
		//---------------------------Task 2 - print all elements
		System.out.println("-------------Task 2 - print all elements------------------");
		// java 8 way 1
		personList2.forEach(System.out::println);
		
		// java 8 way 2
		
		personList2.forEach(s -> System.out.println(s));
		
		//------------------------Task 3 - Print conditionally and define what to do if condition satisfied
		// Java 8 way
		System.out.println("----------Task 3 - Print conditionally---------------------");
		printConditionally(personList, p -> p.getFirstName().startsWith("b") , p -> System.out.println(p.getFirstName().toUpperCase()));
		printConditionally(personList, p -> p.getLastName().startsWith("s"), p -> System.out.println(p.getFirstName().toUpperCase()));
		
	}
	
	public static void printConditionally(List<Person> personList , Predicate<Person> condition, Consumer<Person> consumer){
		for(Person person : personList){
			if(condition.test(person)){
				consumer.accept(person);
			}
		}
	}
	

}

