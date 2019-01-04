package com.sb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blogger")
public class Blogger implements Serializable {
	
	public Blogger() {
	}

	public Blogger(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getBloggerid() {
		return bloggerid;
	}

	public void setBloggerid(long bloggerid) {
		this.bloggerid = bloggerid;
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

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bloggerid;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	

	@Override
	public String toString() {
		return String.format("Blogger[id=%d, firstName='%s', lastName='%s']", bloggerid, firstName, lastName);
	}
}
