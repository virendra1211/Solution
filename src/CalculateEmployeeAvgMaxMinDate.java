

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CalculateEmployeeAvgMaxMinDate{

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(6, "G2", 50, "M", "IT", 2021, 90000, LocalDate.of(2021,01,01)),
				new Employee(16, "G1", 30, "M", "IT", 2021, 10000,  LocalDate.of(2021,03,01)),
				new Employee(11, "G11", 45, "M", "IT", 2021, 30000, LocalDate.of(2023,05,11)),
				new Employee(66, "G3", 30, "M", "IT", 2021, 20000,  LocalDate.of(2023,06,3)),
				new Employee(63, "G12", 30, "M", "IT", 2021, 15000, LocalDate.of(2022,01,1)),
				new Employee(64, "G4", 19, "M", "IT", 2021, 30000,  LocalDate.of(2022,04,4)),
				new Employee(12, "G9", 20, "M", "IT", 2021, 16000,  LocalDate.of(2022,01,4)),
				new Employee(67, "G8", 25, "M", "IT", 2021, 91000,  LocalDate.of(2023,03,5)),
				new Employee(53, "G13", 50, "M", "IT", 2021, 17000, LocalDate.of(2021,03,7)));

		// Oldest person detail
		Optional<Employee> employee = list.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println(employee);
		
		// get Max salaried employee
		Optional<Employee> maxSalary = list.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(maxSalary);

		// get average salaried employee
		Double averageSalary = list.stream().mapToDouble(p ->p.getSalary()).average().getAsDouble();
		System.out.println(averageSalary);
		
		// Obtain a list of employee who joined in before 2023 and after 2022
		List<Employee> empList = list.stream().filter(p -> p.getDateOfJoining().compareTo(LocalDate.of(2022, 01, 01)) >= 0).
		filter(p -> p.getDateOfJoining().compareTo(LocalDate.of(2023, 12, 12)) <= 0).distinct().collect(Collectors.toList());
		empList.forEach(System.out::println);
		
		// 
	}

}

class Employee {
	int id;

	private LocalDate dateOfJoining;
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary,LocalDate dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	@Override
	public String toString() {
		return this.getName() + " || " + this.getGender() + " || " + this.getSalary() + " || " + this.getYearOfJoining()+" || "+this.getDateOfJoining();
	}
}