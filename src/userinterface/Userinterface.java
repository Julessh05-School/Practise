package userinterface;

import java.util.ArrayList;
import java.util.Collections;

import models.Person;

public final class Userinterface
{

	public static void main(String[] args)
	{
		
		// With Strings
		final ArrayList<String> list = new ArrayList<String>();
		final ArrayList<String> a = new ArrayList<String>();
		a.add("Test");
		a.add("Another Test");
		list.addAll(a);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		final String[] stringA = list.toArray(new String[0]);
		
		// Three loops for same thing.
		for(int i = 0; i < stringA.length; i++) {
			System.out.println(stringA[i]);
		}
		
		list.forEach(element -> System.out.println(element));
		
		for(String element : list) {
			System.out.println(element);
		}
		
		// With Persons
		final ArrayList<Person> personA = new ArrayList<Person>();
		final ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Myself", 750));
		persons.add(new Person("Another Person", 1435));
		personA.addAll(persons);
		
		for(int i = 0; i < personA.size(); i++) {
			System.out.println(personA.get(i).getName());
		}
		
		personA.forEach(person -> System.out.println(person.getName()));
		
		for(Person person : personA) {
			System.out.println(person.getName());
		}
		
		final ArrayList<Integer> iList = new ArrayList<Integer>();
		final Integer[] iA = {2, 5, 1, 7, 6};
		Collections.addAll(iList, iA);
	}
}