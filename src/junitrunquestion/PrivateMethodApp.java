package junitrunquestion;
public class PrivateMethodApp {

	private Integer pvMethod(Integer id) {
		System.out.println(id + 10);
		return id + 10;
	}

}