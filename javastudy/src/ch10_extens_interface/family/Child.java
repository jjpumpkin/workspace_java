package ch10_extens_interface.family;

public class Child extends Parent{

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public void sayHello() {
		super.sayHello();
	}


}
