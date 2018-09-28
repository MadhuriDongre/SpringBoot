package com.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mytable")
public class MyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;

	@Column(name = "name")
	public String name;

	@Column(name = "email")
	public String email;

	@Column(name = "address")
	public String address;

	@Column(name = "city")
	public String city;

	@Column(name = "country")
	public String country;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public MyEntity() {
		super();
	}

	public MyEntity(int id, String name, String email, String address, String city, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "MyEntity [Id=" + id + ", Name=" + name + ", Email=" + email + ", Address=" + address + ", city=" + city
				+ ", Country=" + country + "]";
	}

}
