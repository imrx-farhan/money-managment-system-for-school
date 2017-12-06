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

class Main {
	public static void main(String[] args) {
		
		Teacher mohammad =new Teacher(id:1,name"mohammad",salary:500);
		Teacher javedAhmad =new Teacher(id:2,name"javedAhmad",salary:700);
		Teacher fatima =new Teacher (id:3,name "fatima",salary 600);
		list<Teacher> Teacherlist = new arraylist<>[];
		Teacherlist.add(mohammad);
		Teacherlist.add(javedAhmad);
		Teacherlist.add(fatima);


		student  imran = new student(id:1,name"imran",grade:1);
		student nazarMohammad = new student(id:2,name"nazarMohammad", grade:2);
		student shafiq = new student (id:2, name"shafiq",grade:12);
		list<student> studentlist = new arraylist<>[];
		studentlist.add(imran);
		studentlist.add(nazarMohammad);
		studentlist.add(shafiq);


		school ZahirShahiHighSchool = new school (Teacherlist,studentlist);
		System.out.println("ZahirShahiHighSchool has  Earned $ "ZahirShahiHighSchool.getTotalMoneyEarned());


		System.out.println("<----------------MAKING ZahirShahiHighSchool PAY SALARY---------------->");
		
	
	}
	
}