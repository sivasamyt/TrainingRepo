package com.main;

import java.util.ArrayList;
import java.util.List;

import com.exception.StudentExcept;
import com.model.Student;
import com.service.StudentService;

public class UseStudent {
	public static void main(String[] args) {
		StudentExcept ex=new StudentExcept();
		Student student1 = new Student("KABILAN", 123, 'm');
		Student student2 = new Student("Siva", 456, 'm');
		Student student3 = new Student("prasanth", 457, 'm');
		List <Student> students=  new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
	
		StudentService service = new StudentService();
		// List
		
		try {
			
			List<Student> student =service.SearchByNameList(students,"kabilan");
			if(student!=null) {
	for (Student student4 : student) {
		
	
			System.out.println(student4.getName()+"  "+student4.getStuId());
			}}
		} catch (Exception e) {
			
			e.getMessage();
			}
		
		
		
		
		
	//	Normal
		boolean res = service.SearchByName(student1, "Shiva");

		String ans = (res == true) ? "AVAILABLE" : "NOT AVAILABLE";
		System.out.println(ans);
		}
}