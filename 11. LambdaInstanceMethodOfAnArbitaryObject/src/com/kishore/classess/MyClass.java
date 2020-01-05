package com.kishore.classess;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.kishore.models.Student;

public class MyClass {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Kicha", 29, "MCA"));
		studentList.add(new Student(2, "Roshini", 25, "BE ECE"));
		studentList.add(new Student(3, "Sudha", 31, "MCA"));
		studentList.add(new Student(4, "Arumugam", 32, "BA"));

		List<String> names = MyClass.getStudentsNames(studentList, Student::getName);
		names.forEach(System.out::println);
	}

	private static List<String> getStudentsNames(List<Student> studentList, Function<Student, String> function) {
		List<String> result = new ArrayList<String>();
		studentList.forEach((student) -> result.add(function.apply(student)));
		return result;
	}

}
