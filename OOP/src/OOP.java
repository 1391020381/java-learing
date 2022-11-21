
public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ming = new Person();
		ming.setName("xiao ming");
		ming.setAge(20);
		System.out.println(ming.getName()+ "," + ming.getAge());
		Student stu = new Student("justodit");
		stu.run();
		System.out.println(stu.getName());
	}

}
interface IPerson{
	void run();
	String getName();
}
class Student implements IPerson{
	private String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(this.name + "run");
	}
	@Override
	public String getName() {
		return this.name;
	}
}
class Person{
	private String name;
	private int age;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age<0 || age>100) {
			 throw new IllegalArgumentException("invalid age value");
		}
		this.age = age;
	}
}