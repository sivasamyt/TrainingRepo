package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.model.Student;

public class StudentService {

	public boolean SearchByName(Student Student, String name) {

		if (Student.getName().equalsIgnoreCase(name)) {
			return true;
		} else {
			return false;
		}
	}

	public List<Student> SearchByNameList(List<Student> students, String string) throws Exception {
		List<Student> list = new ArrayList<Student>();
		for (Student student : students) {
			if (student.getName().equalsIgnoreCase(string)) {
				list.add(student);
			}
		}
		if (list.size() > 0) {
			return list;
		}

		else {
			throw new Exception("NO SUCH STUIDENT");

		}

	}
}
