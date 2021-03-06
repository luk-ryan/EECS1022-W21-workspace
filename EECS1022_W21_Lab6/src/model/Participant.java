package model;

public class Participant {
	
	private String name;
	private String report;
	
	private final int MAX_NUMBER_OF_REGISTRATIONS = 5; // Each participant can register for up to 5 subjects
	private Registration[] registrations;

	/*
	 * Constructor Method(s) (initialize variables to use in the class)
	 */
	
	public Participant(String name) {
		this.name = name;
		this.report = "";
		this.registrations = new Registration[0];
	}
	
	/*
	 * Accessor Methods (returning some useful information)
	 */
	
	public Registration[] getRegistrations() {
		return this.registrations;
	}
	
	public String getGPAReport() {
		
		if (this.registrations.length == 0) {
			this.report = "No GPA available yet for " + this.name;
		}
		else {
			this.report = this.name + "'s GPA of {";
			int tempMark = 0;
			String tempGrade = "";
			int totalGP = 0;
			// loop through array of registrations to get gp of each one
			for (int i = 0; i < this.registrations.length; i++) {
				// get temporary gp and grade letter for each registration
				tempMark = this.registrations[i].getMarks() / 10;
				tempGrade = this.registrations[i].getGradeReport()[0];
				totalGP += tempMark;
				if (i == this.registrations.length - 1) { 
					this.report += tempMark + " (" + tempGrade + ")}: ";
				}
				else {
					this.report += tempMark + " (" + tempGrade + "), ";
				}
			}
			// calculate grade point average as a decimal and add it into the report to one decimal place
			double gradePointAverage = (totalGP+0.0)/this.registrations.length;
			this.report += String.format("%.1f",gradePointAverage);
		}
		return this.report;
	}
	
	public int marksOf(String title) {
		int mark = -1;
		
		// loop through array of registrations to see if the input registration is there and return the mark from Registration class
		for (int i = 0; i < this.registrations.length; i++) {
			if (this.registrations[i].getTitle() == title) {
				mark = this.registrations[i].getMarks();
			}
		}
		return mark;
	}
	
	/*
	 * Mutator Methods (Not returning anything but alters data within class)
	 */
	
	// Add new registration to current array of registrations
	public void addRegistration(Registration registration) {
		
		if (this.registrations.length < MAX_NUMBER_OF_REGISTRATIONS) {
			Registration[] tempArray = new Registration[this.registrations.length + 1];
		
			// put all registrations into temporary array
			for (int i = 0; i < this.registrations.length; i++) {
				tempArray[i] = this.registrations[i];
			}
		
			// complete temporary array by adding the new registration to last index
			tempArray[this.registrations.length] = registration;
		
			// replace old registration array with an empty array but with one more index
			this.registrations = new Registration [tempArray.length];
		
			// move all registrations from temporary array to the registrations array
			for (int i = 0; i < this.registrations.length; i++) {
				this.registrations[i] = tempArray[i];
			}
		}
	}
	
	// make an add registration method for a string input
	public void addRegistration(String title) {
		Registration r = new Registration(title);
		this.addRegistration(r);
	}
	
	public void updateMarks(String title, int mark) {
		// loop through array of registrations to see if the input registration is there and set the mark using registration object's mark
		for (int i = 0; i < this.registrations.length; i++) {
			if (this.registrations[i].getTitle() == title) {
				this.registrations[i].setMarks(mark);
			}
		}
	}
	
	// set length of registrations array to 0
	public void clearRegistrations() {
		this.registrations = new Registration[0];
	}
}
