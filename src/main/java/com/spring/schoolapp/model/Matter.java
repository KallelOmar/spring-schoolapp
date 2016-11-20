package com.spring.schoolapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MATTER")
public class Matter {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int matterId;
	
	@Column(name="name")
	private String matterName;
	
	@Column(name="coefficient")
	private int coefficient;

	public int getMatterId() {
		return matterId;
	}

	public void setMatterId(int matterId) {
		this.matterId = matterId;
	}

	public String getMatterName() {
		return matterName;
	}

	public void setMatterName(String matterName) {
		this.matterName = matterName;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
}
