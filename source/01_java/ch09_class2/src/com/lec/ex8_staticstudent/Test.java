package com.lec.ex8_staticstudent;
// Student.java => ex1_student, ex8_sstaticstudent ��Ű��
import com.lec.ex1_student.Student;
public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ", 90, 90, 90);
		s1.print();
		com.lec.ex8_staticstudent.Student s8 = new com.lec.ex8_staticstudent.Student("ȫ8", 88, 88, 88);
		s8.print();
	}

}
