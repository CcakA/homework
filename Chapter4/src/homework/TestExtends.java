package homework;

class Student{         //����ѧ����
	private String name;
	private int age;
	private String education;
	public Student(String Name,int Age,String Education) {    //���췽��
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
		System.out.println("������"+name+"  ���䣺"+age+"  ѧ����"+education);
	}
}
class Undergraduate extends Student{   //��ѧ����������������
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
		System.out.println("רҵ��"+specialty);
	}
}
class Graduate extends Student{    //��ѧ���������о�����
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
		System.out.println("�о�����"+direction);
	}
}

public class TestExtends {
	public static void main(String args[]) {
		Student ����;
		���� = new Student("����",18,"����");
		����.show();
		System.out.println();
		Undergraduate ����;
		���� = new Undergraduate("����",20,"ѧʿ","�������");
		����.show();
		System.out.println();
		Graduate ����;
		���� = new Graduate("����",24,"˶ʿ","ͼ��ʶ��");
		����.show();
	}

}
