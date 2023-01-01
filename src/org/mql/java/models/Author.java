package org.mql.java.models;

public class Author {
	
	private int id;
	private String name;
	private int yearBorn;	
	private String country;
	
	public Author() {
	}

	public Author(int id, String name, int yearBorn, String country) {
		super();
		this.id = id;
		this.name = name;
		this.yearBorn = yearBorn;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearBorn() {
		return yearBorn;
	}

	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
