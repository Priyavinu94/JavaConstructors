package reportCard;

public class Student {
	
	String studentName;
	int studentGrade; //variable to store the class/grade in which the student is studying
	double percentage;
	
	Student(){
		
	}
	
	Student(String studentName, int studentGrade) {
		this.studentName = studentName;
		this.studentGrade = studentGrade;
	}
	
	Student(int studentGrade, double percentage) {
		this.studentGrade = studentGrade;
		this.percentage = percentage;
	}

	Student(String studentName, int studentGrade, double percentage) {
		this.studentName = studentName;
		this.studentGrade = studentGrade;
		this.percentage = percentage;
	}

	String getStudentName() {
		return studentName;
	}

	void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	int getStudentGrade() {
		return studentGrade;
	}

	void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}

	double getPercentage() {
		return percentage;
	}

	void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	void printStudentInfo(String studentName, int studentGrade) {
		System.out.println(studentName + " of Grade "+ studentGrade + " scored " + this.percentage + "% in current year");
	}
}
