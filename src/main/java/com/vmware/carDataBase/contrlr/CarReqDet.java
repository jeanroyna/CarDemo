package com.vmware.carDataBase.contrlr;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="CarReqDet")
public class CarReqDet {

   
	private String firstName;
	
	private String lastName;
	private String designation;
	private String carComp;
	private String carType;
	private String carName;
	private String gender;
	
	
	public CarReqDet() {
		super();
	}

	public CarReqDet(String firstName, String lastName, String designation, String gender, String carComp, String carType) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.carComp = carComp;
		this.carType = carType;
		this.carName = carName;
		this.gender = gender;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getCarComp() {
		return carComp;
	}

	public void setCarComp(String carComp) {
		this.carComp = carComp;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "CarReqDet [firstName=" + firstName + ", lastName=" + lastName + ", designation=" + designation
				+ ", carComp=" + carComp + ", carType=" + carType + ", carName=" + carName + ", gender=" + gender + "]";
	}


	
}
