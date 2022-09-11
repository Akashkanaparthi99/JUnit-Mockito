package com.testcases.studentapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shristi.exceptions.ExceedingNumException;
import com.shristi.exceptions.NegativeValueException;
import com.shristi.training.Student;

public class StudentTest {

	Student student = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	@Test
	@DisplayName("Testing positive values")
	void testTotalMarks() throws NegativeValueException, ExceedingNumException {
		assertEquals(255, student.totalMarks(80, 90, 85), "valuses do not match expected value 255");
	}

	@Test
	@DisplayName("Testing negative values")
	void testNegTotal() {
		assertThrows(NegativeValueException.class, () -> student.totalMarks(-20,50,80));
	}

	@Test
	@DisplayName("Testing greater than 100")
	void testGreaterTotalMarks() throws NegativeValueException{
		assertThrows(ExceedingNumException.class, () -> student.totalMarks(120, 58, 223));
	}
	
	@Test
	@DisplayName("Testing Grade - A")
	void testGradeA() throws ExceedingNumException {
		int [] marks = {90,95,97};
		String grade = student.getGrade(marks);
		assertEquals("A Grade", grade);
	}
	
	@Test
	@DisplayName("Testing Grade - B")
	void testGradeB() throws ExceedingNumException {
		int [] marks = {90,86,78};
		String grade = student.getGrade(marks);
		assertEquals("B Grade", grade);
	}
	
	@Test
	@DisplayName("Testing Grade - C")
	void testGradeC() throws ExceedingNumException {
		int [] marks = {50,60,58,77};
		String grade = student.getGrade(marks);
		assertEquals("C Grade", grade);
	}
	
	@Test
	@DisplayName("Testing Grade - D")
	void testGradeD() throws ExceedingNumException {
		int [] marks = {50,45,42};
		String grade = student.getGrade(marks);
		assertEquals("D Grade", grade);
	}
	
	@Test
	@DisplayName("Testing Grade - fail")
	void testGradeF() throws ExceedingNumException {
		int [] marks = {20,23,31};
		String grade = student.getGrade(marks);
		assertEquals("Fail", grade);
	}
	
	@Test
	@DisplayName("Testing Grade - NEG")
	void testGradeNeg() throws ExceedingNumException {
		int [] marks = {-75,-20};
		assertThrows(ExceedingNumException.class,()->student.getGrade(marks));
	}
	
	@Test
	@DisplayName("Testing Grade -exceed")
	void testGradeExceed() throws ExceedingNumException {
		int [] marks = {120,45,1288};
		assertThrows(ExceedingNumException.class,()->student.getGrade(marks));
	}
	
	@Test
	@DisplayName("Testing Grade - NULL")
	void testGradeNull() throws ExceedingNumException {
		int [] marks = null;
		assertEquals("Done",student.getGrade(marks));
	}
	

}
