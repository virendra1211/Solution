package test;

import java.util.List;
import java.util.stream.Collectors;
/* EPAM interview 
 * https://ramj2ee.blogspot.com/2017/07/how-to-get-unique-names-in-upper-case.html
 */
public class StreamQus {
	public static void main(String[] args) {

		Author a1 = new Author("sachin", "rane", 60);
		Author a2 = new Author("vijay", "sing", 30);
		Author a3 = new Author("chandan", "patil", 70);
		Author a4 = new Author("rahul", "shinde", 60);
		Author a5 = new Author("veer", "sing", 55);
		Author a6 = new Author("manish", "sir", 30);
		List<Book> listOfBooks = List.of(new Book(a1), new Book(a2), new Book(a3), new Book(a4),new Book(a5),new Book(a6));
		System.out.println(listOfBooks);

		List<String> ans = listOfBooks.stream().map(book -> book.getAuthor()).filter(author -> author.getAge() > 50)
				.map(Author::getLastName).map(String::toUpperCase).distinct().limit(3).collect(Collectors.toList());
		// find out author age is more than 50 , first 10 books(will support 2 book,
		System.out.println(ans);

		List<String> filteredAutherNameList = listOfBooks.stream() // Stream of book
                .map(book -> book.getAuthor()) // Stream<book> to Stream<Author>
                .filter(author -> author.getAge() >= 30) // Filter the author whose Age is >=30
                .map(Author::getLastName) //Stream<Author> to Stream<Name>
                .map(String::toUpperCase) // Convert name as upper case
                .distinct() // Get the unique elements[i.e. name]
                .limit(2) // Grab the first 2
                .collect(Collectors.toList()); // collect the result as a list
	}
}

class Book {
	Book(Author author) {
		this.author = author;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author.getLastName() + " " + author.getAge() + "]";
	}

	Author author;

}

class Author {
	public String getFirstName() {
		return firstName;
	}

	public Author(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String firstName;
	private String lastName;
	private int age;
}