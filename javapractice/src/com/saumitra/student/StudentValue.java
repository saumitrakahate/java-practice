package com.saumitra.student;

import com.saumitra.interfaces.Valuable;

public class StudentValue implements Valuable {
	
	final static int rollNos[] = { 1, 2, 3, 4};
	final static String skills[] = { "Java","SQL" }; 
	@Override
	public boolean isGraduate(int rollNo) {
		return true;
	}

	@Override
	public boolean isSkillful(String skill) {
		return false;
	}

	@Override
	public int calculateValue(int rollNo) {
		return 0;
	}

	public static void main(String[] args) {
		
		StudentInfo s1 = new StudentInfo("Saumitra",2,"IT","Java");
		StudentInfo s2 = new StudentInfo("XYZ",5,"CS","Angular");
		
		boolean valueable = false;
		
		valueable = isValuable(s1);
	}

	private static boolean isValuable(StudentInfo s1) {
		
		boolean graduate = false;
		boolean skillful = false;
		StudentValue sv = new StudentValue();
		
		graduate = sv.isGraduate(s1.getRollNo());
		
		return false;
	}

}
