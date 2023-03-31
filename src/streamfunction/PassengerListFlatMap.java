package streamfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PassengerListFlatMap {

	public static void main(String[] args) {
		String s[] = { "abc@gmail.com", "bcd.epam.com", "ccd@yahoo.com" };
		List<String> listOfEmails = Arrays.asList(s);

		Passengers passenger1 = new Passengers("a", 12, listOfEmails);
		Passengers passenger2 = new Passengers("ab", 13, listOfEmails);
		Passengers passenger3 = new Passengers("abc", 15, listOfEmails);
		
		List<Passengers> passengerList = new ArrayList<>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		
		Map<String,Long> result = generateEmail(passengerList);
		System.out.println(result);
		List<String> address = passengerList.stream().flatMap(p ->p.getListOfEmails().stream()).collect(Collectors.toList());
		System.out.println(address);
		
		/////////////////////////
		  // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "GFG",
                                 "GeeksforGeeks", "gfg");
  
        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(str -> 
                         Stream.of(str.charAt(2))).
                         forEach(System.out::println);
	}

	private static Map<String, Long> generateEmail(List<Passengers> passengerList) {
		Map<String,Long> map = passengerList.stream().flatMap(p ->p.getListOfEmails().stream().map(a -> {
			String emails[] = a.split("");
			return emails.clone()[1].trim();
		})).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		return map;
	}

}

class Passengers {

	String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public List<String> getListOfEmails() {
		return listOfEmails;
	}

	public void setListOfEmails(List<String> listOfEmails) {
		this.listOfEmails = listOfEmails;
	}

	int i;
	List<String> listOfEmails;

	public Passengers(String string, int i, List<String> listOfEmails) {
		this.string = string;
		this.i = i;
		this.listOfEmails = listOfEmails;
	}

}
