package advance.dev.models;

public class Student extends Person{
double mark;

	public double getMark() {
	return mark;
}

public void setMark(double mark) {
	this.mark = mark;
}

	public Student(String name, int old, double mark2) {
	super(name, old);
	this.mark = (double) mark2;
}

	public Student(String name, int old) {
		super(name, old);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return String.format("name:%s - old:%d - mark:%.2f", name, old, mark);
		
	}
	


	
	

}
