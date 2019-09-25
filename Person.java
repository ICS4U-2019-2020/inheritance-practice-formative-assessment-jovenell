
public class Person extends Object{

	// Superclass - Object
	// Subclass - Person
	
	public String name;
	private int age;
	private int height;
	protected String birthdate;
	
	public Person(String n, int a, int h, String b) {
		name = n;
		age = a;
		height = h;
		birthdate = b;
	}
	
	public Person() {
		name = "Justin";
		age = 17;
		height = 100;
		birthdate = "June 6 2002";
	}
	
	public void setAge(int a) {
		if(a > 0) {
			age = a;
		}
	}
	public int getAge() {
		return age;
	}
	
	public void setHeight(int h) {
		if(h > 0) {
			height = h;
		}
	}
	public int getHeight() {
		return height;
	}
	
	public static void toString(Person p) {
		System.out.println(p.name);
		System.out.println(p.getAge());
		System.out.println(p.getHeight());
		System.out.println(p.birthdate);
	}
	
	public boolean equals(Person p) {
		if(this.name == p.name && this.getAge() == p.getAge() && this.getHeight() == p.getHeight() && this.birthdate == p.birthdate) {
			return true;
		}
		return false;
	}
}
