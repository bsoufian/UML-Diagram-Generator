package org.mql.java.models;

import java.util.List;
import java.util.Vector;

public class ClassModel {
	private String name;
	private List<Attribute> attributes;
	private List<Operation> operations;
	
	
	public ClassModel(String name) {
		this.name = name;
		this.operations = new Vector<>();
		attributes = new Vector<>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Attribute> getAttributes() {
		return attributes;
	}


	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}


	public List<Operation> getOperations() {
		return operations;
	}


	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}


	public ClassModel(String name, List<Attribute> attributes, List<Operation> operations) {
		super();
		this.name = name;
		this.attributes = attributes;
		this.operations = operations;
	}


	@Override
	public String toString() {
		return "ClassModel [name=" + name + ", attributes=" + attributes + ", operations=" + operations + "]";
	}
	

}
