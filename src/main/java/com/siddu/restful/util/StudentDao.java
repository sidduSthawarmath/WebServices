package com.siddu.restful.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDao {

	private static List<Student> studentList = new ArrayList<Student>(Arrays.asList(new Student(1, "Siddu", "1234"),
			new Student(2, "Ganesh", "1235"), new Student(3, "Mahesh", "1236"), new Student(4, "Ram", "1237")));

	public Student findStudnetByRollNum(int rollNum) {
		for (Student student : studentList) {
			if (student.getRollNum() == rollNum) {
				return student;
			}
		}
		return null;
	}

	// Add student Details
	public List<Student> addStudent(Student student) {
		student.setRollNum((studentList.get(studentList.size()-1)).getRollNum()+1);
		studentList.add(student);
		return studentList;
	}

	// Delete Student details
	public List<Student> deleteStudentByRollNum(int rollNum) {
		int index = -1;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getRollNum() == rollNum) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			studentList.remove(index);
		}

		return studentList;
	}

	// Update Student name using rollNum
	public List<Student> updateNameByRollNum(int rollNum, String name) {

		for (Student student : studentList) {
			if (student.getRollNum() == rollNum) {
				student.setName(name);
				break;
			}
		}
		return studentList;
	}

	// Find all the Student
	public List<Student> findAllStudents() {
		return studentList;
	}

	
/*	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>(Arrays.asList(new Student(1, "Siddu", "1234"),
				new Student(2, "Ganesh", "1235"), new Student(3, "Mahesh", "1236"), new Student(4, "Ram", "1237")));
		
		studentList.remove(0);
		System.out.println(studentList);
		
		
	}*/
}