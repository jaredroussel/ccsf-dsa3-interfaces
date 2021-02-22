// Homework Question 2
public class Person implements Comparable<Person> {

	private String firstName, lastName;
	private int id;
	
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + id + ")";
	}

	// Homework Question 3
	public int compareTo(Person p) {

		if (p==null) {
			throw new IllegalArgumentException();
		}

		if (p==this) {
			return 0;
		}

		int compareLastName = lastName.compareToIgnoreCase(p.lastName);
		int compareFirstName = firstName.compareToIgnoreCase(p.firstName);

		if (compareLastName==0 && compareFirstName==0) { // If both names match
			return Integer.compare(id, p.id); // Order based on id instead
		}

		return compareLastName; // Otherwise order based on last name
	}
}
