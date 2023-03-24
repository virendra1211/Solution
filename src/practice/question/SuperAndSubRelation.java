package practice.question;

interface I1 {
	public void p();

	public void p1();
}

interface I2 extends I1 {
	public void p();
}

class G implements I2 {

	@Override
	public void p() {
		System.out.println("G class");
	}

	@Override
	public void p1() {
		// TODO Auto-generated method stub

	}

}

public class SuperAndSubRelation {

	public static void main(String[] args) {
		Sup obj = new Sub();

		// obj.p="9"; not possible if it's private
		obj.setP("virendraa");
		System.out.println(obj.get());
	}

}

class Sup {
	private String p;

	public String get() {
		return p;
	}

	void setP(String p) {
		this.p = p;
	}
}

class Sub extends Sup {
	public String p;

	public String get() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
}
