package org.college;

public class Student extends College {
private void studentName() {
System.out.println("Student Name = Naveen");
}
private void studentDept() {
System.out.println("Student Department = B.com");
}
private void studentId() {
System.out.println("Student ID = 2022112");
}
public static void main(String[] args) {
	Student s=new Student();
	s.collegeName();
	s.collegeCode();
	s.collegeRank();
	s.studentName();
	s.studentId();
	s.studentDept();
	s.hostelName();
	s.deptName();
}
}
