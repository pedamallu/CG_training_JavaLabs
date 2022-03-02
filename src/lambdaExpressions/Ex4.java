package lambdaExpressions;
class Student
{
	private int id;
	private String name;
	private String school;
	public Student(int id,String name,String school)
	{
		this.id=id;
		this.name=name;
		this.school=school;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", school=" + school + "]";
	}
	
}
@FunctionalInterface
interface If{
	Student getStudent(int id,String name,String school);
}
public abstract class Ex4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		If ob=Student::new;
		Student s1=ob.getStudent(101, "Ram", "Bhasyam");
		System.out.println(s1);
	}

}
