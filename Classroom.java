import java.io.*;
import java.util.ArrayList;
import java.util.*;


public class Classroom{
	 String course;
	 Teacher teacher;
	 List<Students> students;
	public Classroom(String course, Teacher teacher, List<Students> student){
		this.course = course;
		this.teacher = teacher;
		this.students = new ArrayList<Students> (student);

	}
	public Teacher getTname(){
		return this.teacher;
	}
	public void setTname(Teacher teach){
		this.teacher = teach;
	}
	public List<Students> getStudents(){
		return this.students;

	}

	public void setStudents(Students students){
		students.add(students);
	}

}