package model;

public class Registration {
	
	private String title;
	private int marks;
	private String[] report;
	
	Instructor instructor;
	
	/*
	 * Constructor Method(s) (initialize variables to use in the class)
	 */
	
	public Registration(String title) {
		this.title = title;
		this.report = new String[2];
	}
	
	public Registration(String title, Instructor instructor) {
		this.title = title;
		this.instructor = instructor;
		this.report = new String[2];
	}
	
	/*
	 * Accessor Methods (returning some useful information)
	 */
	
	public String getTitle() {
		return this.title;
	}
	
	public int getMarks() {
		return this.marks;
	}
	
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	public String[] getGradeReport() {
		
		if (90 <= this.marks) {
			this.report[0] = "A+";
			this.report[1] = "Exeptional";
		}
		else if (80 <= this.marks) {
			this.report[0] = "A";
			this.report[1] = "Excellent";
		}
		else if (70 <= this.marks) {
			this.report[0] = "B";
			this.report[1] = "Good";
		}
		else if (60 <= this.marks) {
			this.report[0] = "C";
			this.report[1] = "Competent";
		}
		else if (50 <= this.marks) {
			this.report[0] = "D";
			this.report[1] = "Passing";
		}
		else {
			this.report[0] = "F";
			this.report[1] = "Failing";
		}
		return this.report;
	}
	
	public String getInformation() {
		String result = this.title + " has not yet been assigned an instructor";
		
		if (this.instructor != null) {
			result = String.format("%s, taught by %s, is completed with raw marks %d (%s ; %s)", this.title, this.instructor.getName(), this.marks, this.report[0], this.report[1]);
		}
		
		return result;
	}
	
	/*
	 * Mutator Methods (Not returning anything but alters data within class)
	 */
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
