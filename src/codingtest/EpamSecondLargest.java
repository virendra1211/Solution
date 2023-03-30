package codingtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EpamSecondLargest {
	public static void main(String[] args) {
		List<Person> listOfPerson = new ArrayList<Person>();
		listOfPerson.add(new Person(5, "a"));
		listOfPerson.add(new Person(25, "a3"));
		listOfPerson.add(new Person(15, "a6"));
		listOfPerson.add(new Person(11, "a3"));
		listOfPerson.add(new Person(13, "a2"));
		Optional<Person> p = listOfPerson.stream().sorted(Comparator.comparingInt(Person::getId).reversed()).skip(1)
				.findFirst();
		Optional<Person> maxId = listOfPerson.stream().max(Comparator.comparingInt(Person::getId));
		System.out.println(maxId.get().getName() + " - " + maxId.get().getId());
		System.out.println(p);
	}
}
class Person{
	private String name;
	private Integer id;
@Override
public String toString() {
	return id+ " "+name;
}

	public Person(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Person(int i, String string) {
			this.id =i;
			this.name= string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}