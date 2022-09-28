package models;

/**
 * This represents a single Person
 */
public final class Person
{
	/**
	 * Name of the Person
	 */
	private String name;
	
	/**
	 * Age of the Person
	 */
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Returns the Name of the Person
	 * 
	 * @return the Name of the Person as a String
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * Returns the Age of the Person
	 * 
	 * @return the Age of the Person as an Integer
	 */
	public final int getAge() {
		return age;
	}
}
