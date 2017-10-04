package com.main.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedStudents {

	public static void main(String[] args) {
		
		List<StudentInfo> studentList = Arrays.asList(
				new StudentInfo(33, "Tina", 3.68),
				new StudentInfo(85, "Louis", 3.85),
				new StudentInfo(56, "Samil", 3.75),
				new StudentInfo(19, "Samar", 3.75),
				new StudentInfo(25, "Samar", 3.75),
				new StudentInfo(22, "Lorry", 3.76));
		
		// Sorting the student list according to given sort order
		studentList.sort(Comparator.comparing(StudentInfo::getGpa)
				.reversed()
				.thenComparing(Comparator.comparing(StudentInfo::getFname))
				.thenComparing(Comparator.comparing(StudentInfo::getId)));
		
		studentList.forEach(System.out::println);
	}
}
