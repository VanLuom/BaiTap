package advance.dev.models;

public class Teacher extends Person {
double salary;

	public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

	public Teacher(String name, int old, double salary2) {
	super(name, old);
	this.salary = (double) salary2;
}

	public Teacher(String name, int old) {
		super(name, old);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return String.format("name:%s - old:%d - salary:%.2f", name, old, salary);
	}
	

}
