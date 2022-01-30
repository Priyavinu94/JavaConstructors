package reportCard;

public class ClassReportCard {

	public static void main(String[] args) {
		
		Student student1 = new Student();	//constructor with no arguments (reference student1)
		student1.setStudentName("Divya");
		student1.setStudentGrade(5);
		student1.setPercentage(88.45);
		student1.printStudentInfo(student1.getStudentName(), student1.getStudentGrade());
		
		
		Student student2 = new Student("Kavya", 10); 	//constructor with two arguments (reference student2)
		student2.setPercentage(54.65);
		student2.printStudentInfo(student2.getStudentName(), student2.getStudentGrade());
		
		
		Student student3 = new Student(11, 95.64);	 //constructor with two arguments (reference student3)
		student3.setStudentName("Anand");
		student3.printStudentInfo(student3.getStudentName(), student3.getStudentGrade());
		
		
		Student student4 = new Student("Adithya", 6, 94.85);	 //constructor with three arguments (reference student4)
		student4.printStudentInfo(student4.getStudentName(), student4.getStudentGrade());
	
	}

}
