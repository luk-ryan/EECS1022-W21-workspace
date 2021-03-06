package model;

public class OnlineSchool {
	
	private final int MAX_NUMBER_OF_PARTICIPANTS = 100; // Max participants online school can hold is 100
	private Participant[] participants;
	
	/*
	 * Constructor Method(s) (initialize variables to use in the class)
	 */
	
	public OnlineSchool() {
		this.participants = new Participant[0];
	}
	
	/*
	 * Accessor Methods (returning some useful information)
	 */
	
	public Participant[] getParticipants(String title) {
		
		Participant[] pRegistered = new Participant[0];
		int noP = 0; // number of students registered into course
		
		for (int i = 0; i < this.participants.length; i++) { // loop through array of total participants first
			for (int j = 0; j < this.participants[i].getRegistrations().length; j++) { // loop through each participant's registered courses
				if (this.participants[i].getRegistrations()[j].getTitle() == title) { // compare each registered course title to the input title
					noP++;
				}
			}
		}
		// set length of registered participants array to the number of participants found to be registered in the course
		pRegistered = new Participant[noP];
		int count = 0;
		
		for (int i = 0; i < this.participants.length; i++) { // loop through array of total participants first
			for (int j = 0; j < this.participants[i].getRegistrations().length; j++) { // loop through each participant's registered courses
				if (this.participants[i].getRegistrations()[j].getTitle() == title) { // compare each registered course title to the input title
					pRegistered[count] = this.participants[i];
					count ++;
				}
			}
		}
		return pRegistered;
	}
	
	/*
	 * Mutator Methods (Not returning anything but alters data within class)
	 */
	
	public void addParticipant(Participant participant) {
		if (this.participants.length < MAX_NUMBER_OF_PARTICIPANTS) {
			Participant[] tempArray = new Participant[this.participants.length + 1];
		
			// put all participants into temporary array
			for (int i = 0; i < this.participants.length; i++) {
				tempArray[i] = this.participants[i];
			}
		
			// complete temporary array by adding the new participant to last index
			tempArray[this.participants.length] = participant;
		
			// replace old participant array with an empty array but with one more index
			this.participants = new Participant[tempArray.length];
		
			// move all participants from temporary array to the registrations array
			for (int i = 0; i < this.participants.length; i++) {
				this.participants[i] = tempArray[i];
			}
		}
	}
}
