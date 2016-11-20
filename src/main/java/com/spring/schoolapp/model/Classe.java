package com.spring.schoolapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLASS")
public class Classe {

		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
		private int classId;
		
		@Column(name="level")
		private int classLevel;
		
		@Column(name="arrange")
		private int classArrange;

		@ManyToMany
		@JoinTable(name = "CLASS_TEACHER",
	             joinColumns = { @JoinColumn(name = "class") }, 
	             inverseJoinColumns = { @JoinColumn(name = "teacher")})
		private List<Teacher> techersList = new ArrayList<Teacher>();
		
		public List<Teacher> getTechersList() {
			return techersList;
		}

		public void setTechersList(List<Teacher> techersList) {
			this.techersList = techersList;
		}
		
		public int getClassId() {
			return classId;
		}

		public void setClassId(int classId) {
			this.classId = classId;
		}

		public int getClassLevel() {
			return classLevel;
		}

		public void setClassLevel(int classLevel) {
			this.classLevel = classLevel;
		}

		public int getClassArrange() {
			return classArrange;
		}

		public void setClassArrange(int classArrange) {
			this.classArrange = classArrange;
		}
}
