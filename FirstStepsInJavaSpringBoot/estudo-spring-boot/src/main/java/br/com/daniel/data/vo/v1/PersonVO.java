package br.com.daniel.data.vo.v1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "first_name", "last_Name", "address", "gender"}) //Define a ordem em que aparece no banco de dados
public class PersonVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	
	@JsonProperty("first_name") // Altera o nome do JSON Serialization
	private String firstName;
	
	@JsonProperty("last_Name") // Altera o nome do JSON Serialization
	private String lastName;
	
	private String address;
	
//	@JsonIgnore // Oculta do JSON Serialization
	private String gender;

	public PersonVO() {
		
	}
	
	public PersonVO(long id, String firstName, String lastName, String address, String gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
