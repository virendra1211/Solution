package streampractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunction {
	public static void main(String[] args) {
		  Integer[] empIds = { 1, 2, 3 };
		    
		    List<Employee> employees = Stream.of(empIds)
		      .map(StreamFunction::findById)
		      .collect(Collectors.toList());
		    System.out.println(employees);
	}

	private static Employee findById(Integer integer1) {
		return new Employee(integer1);
	}
}

class Employee{
	private Integer id;
	public Employee(Integer integer1) {
		this.id= integer1;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return id.toString();
	}
	
}
