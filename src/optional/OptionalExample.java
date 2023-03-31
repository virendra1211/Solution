package optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) throws Exception {
		Optional optional = Optional.empty();
		System.out.println(optional.toString());
		
		Optional optional1 = Optional.ofNullable(null);

		Optional optionalString = Optional.of("value");
		optionalString.ifPresent(s -> System.out.println(s));
		
		Optional<Employee> op = getEmployee();
		op.orElseThrow(() -> new Exception());
		System.out.println(op.get());
	}

	public static Optional<Employee> getEmployee() {
		Employee emp = new Employee("test");
		return Optional.ofNullable(emp);
	}
}
/**
 * @author Eshu
 *
 */
class Employee{
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}