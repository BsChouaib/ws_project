package org.bs.gestion.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Subscribers")
public class Subscriber implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long k_subskriber;
	private String firstName;
	private String lastName;
	private int cin;
	private Date date_naissance;
	public Subscriber() {
		super();
	}
	public Subscriber(String firstName, String lastName, int cin, Date date_naissance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cin = cin;
		this.date_naissance = date_naissance;
	}
	public long getK_subskriber() {
		return k_subskriber;
	}
	public void setK_subskriber(long k_subskriber) {
		this.k_subskriber = k_subskriber;
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
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

}
