package com.stgcodes.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("George", "Torres", "torresgeorge2014@gmail.com"));
		students.add(new Student("Roberta", "Zamudio", "tweettweetbirdie@gmail.com"));
		students.add(new Student("Juray", "Grantham", "Grantham301@gmail.com"));
		
		return students;
	}
}
