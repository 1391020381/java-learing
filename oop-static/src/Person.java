
public class Person {

	public static int count;

	String name;

	public Person(String name) {
		this.name = name;
		Person.count = Person.count + 1;
	}
	public static int getCount() {
		return Person.count;
	}
}
