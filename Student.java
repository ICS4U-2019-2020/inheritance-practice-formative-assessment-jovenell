
public class Student extends Person{

	// Name, Birthdate
	
	private int id;
	private int grade;
	private int yearsAtSchool;
	private String advisor;
	
	public Student(int i, int g, int y, String a) {
		id = i;
		grade = g;
		yearsAtSchool = y;
		advisor = a;
	}
	
	public Student() {
		id = 1000;
		grade = 12;
		yearsAtSchool = 12;
		advisor = "Gledhill";
	}
	
	public void setID(int i) {
		id = i;
	}
	public int getID() {
		return id;
	}
	
	public void setGrade(int g) {
		grade = g;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setYearsAtSchool(int y) {
		yearsAtSchool = y;
	}
	public int getYearsAtSchool() {
		return yearsAtSchool;
	}
	
	public void setAdvisor(String a) {
		advisor = a;
	}
	public String getAdvisor() {
		return advisor;
	}
	
	public static void toString(Student s) {
		System.out.println(s.name);
		System.out.println(s.getAge());
		System.out.println(s.getHeight());
		System.out.println(s.birthdate);
		System.out.println(s.getID());
		System.out.println(s.getGrade());
		System.out.println(s.getYearsAtSchool());
		System.out.println(s.getAdvisor());
	}
	
	public boolean equals(Student s) {
		if(this.name == s.name && this.getAge() == s.getAge() && this.getHeight() == s.getHeight() && this.birthdate == s.birthdate && this.id == s.id && this.grade == s.grade && this.yearsAtSchool == s.yearsAtSchool && this.advisor == s.advisor) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = (Student) new Person();
		Person p1 = new Student();
		Person p2 = (Person) new Object();
		Object o1 = new Student();
		Object o2 = new Person();
		
	}
	
}
