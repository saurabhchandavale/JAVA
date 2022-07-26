import java.util.Scanner;

class Grade{
	private float maths, science, eng, bio, chem;
	private float total_marks, avg_mark;
	String grade;
	public void CreateResult(float maths, float science, float eng, float bio, float chem) {
		this.maths = maths;
		this.science = science;
		this.eng = eng;
		this.bio = bio;
		this.chem = chem;
	}

	public float Calculation() {
		total_marks =  (maths + science + eng + bio + chem);

		return total_marks  ;

	}

	public float Average() {
		avg_mark = (total_marks/500) * 100;
		return avg_mark;
	} 

	public String Grade() {
		if(avg_mark > 90) {
			grade = "A";
		}else if(avg_mark > 70 && avg_mark <= 90) {
			grade = "B";
		}else if(avg_mark > 60 && avg_mark <= 70){
			grade = "C";
		}else if(avg_mark > 50 && avg_mark <= 60){
			grade = "D";
		}else if(avg_mark > 40 && avg_mark <= 50){
			grade = "E";
		}else {
			grade = "F";

		}
		return grade;
	}


}

class StudentDetails{
	private Grade studentGrade;
	private String studentName;
	private String studentFatherName;
	private String studentMotherName;
	private String studentGender;
	private String studentDOB;

	public void AcceptData() {
		float maths, science, eng, bio, chem; 
		Scanner scn = new Scanner(System.in);
		//	
		//scn.nextLine();

		System.out.println("Enter Student Name");
		studentName = scn.nextLine();

		System.out.println("Enter Student Father's Name");
		studentFatherName = scn.nextLine();

		System.out.println("Enter Student Mother's Name");
		studentMotherName = scn.nextLine();

		System.out.println("Enter Student Gender ");
		studentGender = scn.nextLine();

		System.out.println("Enter Student Date of Birth ");
		studentDOB = scn.nextLine();

		System.out.println("Enter Maths Mark");
		maths = scn.nextInt();

		System.out.println("Enter science Mark");
		science = scn.nextInt();

		System.out.println("Enter eng Mark");
		eng = scn.nextInt();

		System.out.println("Enter bio Mark");
		bio = scn.nextInt();

		System.out.println("Enter chem Mark");
		chem = scn.nextInt();

		this.studentGrade = new Grade();
		this.studentGrade.CreateResult(maths, science, eng, bio, chem);


	}

	public String DisplayStudentDetails() {
		return "Student Name : " + studentName + " Student Father's Name : " + studentFatherName + " Student Mother's Name : " + studentMotherName +
				" Student Gender : " + studentGender + " Student Date of Birth : " + studentDOB;
	}

	public String DisplayResult() {
		return "Total marks of " + studentName + " is " + this.studentGrade.Calculation() + " Average is : " + this.studentGrade.Average() 
		+ " Grade is " + this.studentGrade.Grade();
	}




}

public class Result1{
	public static void main(String[] args) {
		while(true){
			Scanner scn = new Scanner(System.in);

			StudentDetails s = new  StudentDetails();
			s.AcceptData();
			System.out.println(s.DisplayStudentDetails());
			System.out.println(s.DisplayResult());
			System.out.println("Do you want to calculate one more result[yes/no]");
			String option = scn.next();
			if(option.equalsIgnoreCase("No")) {
				break;
			}
		}


	}

}