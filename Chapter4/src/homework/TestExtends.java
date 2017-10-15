package homework;

class Student{         //创建学生类
	private String name;
	private int age;
	private String education;
	public Student(String Name,int Age,String Education) {    //构造方法
		setName(Name);
		setAge(Age);
		setEducation(Education);
	}
	private void setName(String Name) {
		name = Name;
	}
	private void setAge(int Age) {
		age = Age;
	}
	private void setEducation(String Education) {
		education = Education;
	}
	public void show() {
		System.out.println("姓名："+name+"  年龄："+age+"  学历："+education);
	}
}
class Undergraduate extends Student{   //由学生类派生本科生类
	private String specialty;
	public Undergraduate(String Name,int Age,String Education,String Specialty) {
		super(Name, Age, Education);
        setSpecialty(Specialty);
	}
	private void setSpecialty(String Specialty) {
		specialty = Specialty;
	}
	public void show() {
		super.show();
		System.out.println("专业："+specialty);
	}
}
class Graduate extends Student{    //由学生类派生研究生类
	private String direction;
	public Graduate(String Name, int Age, String Education,String Direction) {
		super(Name, Age, Education);
		setDirection(Direction);
	}
	private void setDirection(String Direction) {
		direction = Direction;
	}
	public void show() {
		super.show();
		System.out.println("研究方向："+direction);
	}
}

public class TestExtends {
	public static void main(String args[]) {
		Student 张三;
		张三 = new Student("张三",18,"高中");
		张三.show();
		System.out.println();
		Undergraduate 李四;
		李四 = new Undergraduate("李四",20,"学士","软件工程");
		李四.show();
		System.out.println();
		Graduate 王五;
		王五 = new Graduate("王五",24,"硕士","图像识别");
		王五.show();
	}

}
