import java.util.Scanner;

public class Main {
	public static void main(String[]args) {

	Student S1 = new Student(1,"Nam", 23);
	Student S2 = new Student(2,"Hao", 25);
	Student S3 = new Student(3,"Hoa", 23);
	Student S4 = new Student(4,"Kaka", 24);
		
	Student Students[] = new Student[4];
	Students[0] = S1;
	Students[1] = S2;
	Students[2] = S3;
	Students[3] = S4;
	// in ra danh sach
	Scanner Input = new Scanner(System.in);
	System.out.println(" Nhap ten can tim: ");
	String querryName = Input.next();
	for(int i = 0; i < Students.length; i++) {
		Student s = Students[i];
		if(s.name.equals(querryName)) {
		System.out.println(" Id: " + s.id);
		System.out.println(" name: " + s.name);
		System.out.println(" Age: " + s.age);
		}
	 
	   }
				
	}

}

	

