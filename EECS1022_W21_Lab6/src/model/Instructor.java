package model;

public class Instructor {
	
	private String name;
	private int phoneExtension;
	private String email;
	
	/*
	 * Constructor Method(s) (initialize variables to use in the class)
	 */
	
	public Instructor(String name, int phoneExtension, String email) {
		this.name = name;
		this.phoneExtension = phoneExtension;
		this.email = email;
	}
	
	/*
	 * Accessor Methods (returning some useful information)
	 */
	
	public String getName() {
		return this.name;
	}
	
	public int getPhoneExtension() {
		return this.phoneExtension;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getInformation() {
		String result = String.format("Instructor %s has campus phone extension %d and contact email %s", this.name, this.phoneExtension, this.email);
		return result;
	}
	
	/*
	 * Mutator Methods (Not returning anything but alters data within class)
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneExtension(int phoneExtension) {
		this.phoneExtension = phoneExtension;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
