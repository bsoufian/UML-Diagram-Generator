package org.mql.java.models;

import java.util.List;

public class Operation {
	private String name;
	private String visibility;
	private String returnType;
	private List<Attribute> params;
	
	public Operation() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public List<Attribute> getParams() {
		return params;
	}

	public void setParams(List<Attribute> params) {
		this.params = params;
	}

	public Operation(String name, String visibility, String returnType, List<Attribute> params) {
		super();
		this.name = name;
		this.visibility = visibility;
		this.returnType = returnType;
		this.params = params;
	}

	@Override
	public String toString() {
		return visibility + " " + name +"():"+ returnType;
	}
	
	

}
