package com.imcs.training;

import java.io.Serializable;
public class Customer implements Serializable {
	private static final long serialVersionUID = -5577579081118070434L;
	
	private String name;
	private String address;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return id+"::"+name+"::"+address;
		
	}
	
			
}
