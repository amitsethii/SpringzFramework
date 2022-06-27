package com.spring.database.database.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


//@Table(name="person")

@Entity
public class Person {
	
	//uses sequemce to auto genrate id 
	    @Id
	    @GeneratedValue  
		private int id;
		
		//@Column(name="name")
	    
		private String name;
		private String location;
		private Date birthDate;
		public Person(int id, String name, String location, Date birthDate) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.birthDate = birthDate;
		}
		
		//with hibernate fdont want to create id bcz auto genrated 
		public Person( String name, String location, Date birthDate) {
			super();
			this.name = name;
			this.location = location;
			this.birthDate = birthDate;
		}
		
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Date getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}
		//must  have no argument constructor 
		public Person() {
			
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
		}
		
		
}
