package advance.dev.models;

public class Person {
	public static String getName;
	public static String getOld;
	String name;
	int old;
	
	public Person(String name, int old) {
		super();
		this.name = name;
		this.old = old;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	
	

}