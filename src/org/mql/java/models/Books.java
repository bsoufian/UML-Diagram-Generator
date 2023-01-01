package org.mql.java.models;

public class Books {
	private int id;
	private String Author;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}
	

	public Books(int id, String author) {
		super();
		this.id = id;
		Author = author;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	
	
	
}
