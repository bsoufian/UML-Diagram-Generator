package org.mql.java.models;

public class Attribute {
	private String visibility;
	private String type;
	private String name;
	
	public Attribute() {
		// TODO Auto-generated constructor stub
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attribute(String visibility, String type, String name) {
		super();
		this.visibility = visibility;
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return visibility + " " + name + " : " + type;
	}
	
	

}
