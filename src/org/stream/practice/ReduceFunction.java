package org.stream.practice;

import java.util.Arrays;
import java.util.List;

public class ReduceFunction {

	public static void main(String[] args) {
		List<User> listUser = Arrays.asList(new User("a",30),new User("b",40));		
		
	int computeAge = 	listUser.stream().reduce(0,(partialAge,user) ->partialAge + user.getSal(),Integer::sum);
		System.out.println(computeAge);

		int ans = listUser.stream().map(User::getSal).mapToInt(Integer::intValue).sum();
	System.out.println(ans);
	}
	
	

}
class User{
	private String name;
	private Integer sal;
	public User(String name, Integer sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
}