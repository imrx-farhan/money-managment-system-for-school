/**
created by imran ahmad 
this   is responsible for keeping track of students
fees name, grade , fees paid ;
	*/
class student  {
	
	private int id;
	 private String name;
	 private int grade;
	 private int feespaid;
	 private int feesTotal;
	
/**
to create a new student by intializing.
id id for student: unique
name name of the student.
grade of the student.
fees paid initially is 0
	*/

	public  student(int id, String name,int grade) {

		this.feespaid=0
		this.feesTotal=1200
		this.id=id;
		this.name=name;
		this.grade=grade;

	

	}
	//not going to alter student's name, student's id.

/**
used to update the student's grade.
grade new grade of the student.
	*/
	public void setgrade(int grade){
		this.grade=grade;


	}
/**
keep adding the fees to the feespaid field.
just add the fees to the feespaid
the school is going to recevie the funds 
fees the fees that student pays
	*/
	public void	 updatefeespaid(int fees){
		feespaid+=fees;


	}


































	
}



