import java.util.Scanner;
class Student{
	String name;
	int dob;
	String Gender;
	
	void getData(String studName, int studDob, String studGender){
	name = studName;
	dob = studDob;
	Gender = studGender;
	}
	
	void putData(){
		System.out.println("Name:"+name);
		System.out.println("Dob:"+dob);
		System.out.println("Gender:"+Gender);
	}
}

class StudentDetailsArray{
	public  static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		Student[] s1= new Student[5];
		int dob;
		for(int i=0; i<5; i++)
		{
			s1[i] = new Student();
			dob = scan.nextInt();
			s1[i].getData("Abc",dob,"Male");
			s1[i].putData();
		}
	}
}
