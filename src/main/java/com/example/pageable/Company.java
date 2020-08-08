package com.example.pageable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "COMPANY")
public class Company {

	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Integer companyId;

	@Column(name = "name")
	private final String name;

	@Column(name = "location")
	private final String location;

	public Integer getCompanyId() {
		return companyId;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public Company(Integer companyId, String name, String location) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", name=" + name + ", location=" + location + "]";
	}

	public Company() {
		this.companyId = null;
		this.name = "";
		this.location = "";
	}

}