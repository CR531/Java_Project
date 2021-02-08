package com.assignment.app.model;

import java.io.Serializable;

public class SKU implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String id;
	
	Type type;
	
	String name;
	

	public SKU(String id, Type type, String name) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
