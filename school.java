import java.util*;
class school {
/** the school can have many teachers, many students . 
	by using arraylist we can add as much students and teachers as we want 
	*/
	private  list<Teacher> teachers;
	private list<student> students;

	private int totalmoneyEarned;
	private int totalmoneySpent;


/** 
new school object is created;
teachers list of teachers
students list ofstudents;
*/
public school(list<Teacher> teachers,list<student> students ){
	this.teachers=teachers;
	this.students=students;
	totalmoneyEarned=0;
	totalmoneySpent=0;


}
public list<Teacher>getTeachers() {
	return teachers;
}
public void addTeacher(Teacher teachers){
	this.teachers=teachers;

}
public list<student> getstudents(){
	return students;

}
public void addstudents (list<students> students){
	this.students=students;

}
public int getTotalmoneyEarned(){
	return totalmoneyEarned;

}
public void  setTotalmoneyEarned(int totalmoneyEarned){
	this.totalmoneyEarned+=moneyEarned;


}

public int gettotalmoneySpent(){
	return totalmoneySpent;


}
public void settotalmoneySpent(int totalmoneySpent){
	this.totalmoneySpent=totalmoneySpent;


}
}

/**
group members
imran ahmad farhan 
javed ahmad 
rahmatullah 
qudratullah 
abdullhakim
ziaudin
abdullwaris

	*/
