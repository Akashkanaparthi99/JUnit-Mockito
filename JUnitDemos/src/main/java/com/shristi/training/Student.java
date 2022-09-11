package com.shristi.training;

import com.shristi.exceptions.ExceedingNumException;
import com.shristi.exceptions.NegativeValueException;

public class Student {

	public int totalMarks(int marks1 , int marks2, int marks3) throws NegativeValueException, ExceedingNumException {
		
		if (marks1<0||marks2<0||marks3<0) {
			throw new NegativeValueException("NEGATIVE VALUES ARE NOT ALLOWED");
		}
		else if (marks1>100||marks2>100|| marks3>100) {
			throw new ExceedingNumException("Out of 100 entered");
		}
		
		return marks1+marks2+marks3;
	}
	
	public String getGrade(int[] marks) throws ExceedingNumException {
		int sum = 0;
		if (marks != null) {
		for (int mark : marks) {
			if (mark>100 || mark<0) {
				throw new ExceedingNumException("HI");
			}
			else {
				sum += mark;
			}
		}
		int avg = sum/marks.length;
		if (avg >=90) {
			return "A Grade";
		} else if (avg >=70 && avg<90) {
			return "B Grade";
		} else if (avg >=50 && avg<70) {
			return "C Grade";
		}else if (avg<50 && avg>=40) {
			return "D Grade";
		} else {
		return "Fail";
		}
		}
		return "Done";
		
	}
}
