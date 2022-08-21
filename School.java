package MiniProject;

import java.util.List;

public class School {
	private List<Teacher> teachers; //to ensure school have many teachers
	private List<Student> students; //to ensure school have many students
	private static int totalMoneyEarned;
	private static int totalMoneySpent;  //we use static we can access the method
	
	public void School()
	{
		
	}

	public School(List<Teacher> teachers, List<Student> students) { //new school object is created
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student student) {
		this.students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned+=MoneyEarned;     //adds the totalmoney by the school
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned-=MoneySpent; //update the money spent by the school
	}
	

}