package com.sba3.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="custdet")
public class CustomerModel {
	

			@Id
			private long id;
			
			private String name;
			private String city;
			private String contactnumber;
			private String date;
			
			
			

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCity() {
				return city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getContactnumber() {
				return contactnumber;
			}

			public void setContactnumber(String contactnumber) {
				this.contactnumber = contactnumber;
			}

			public String getDate() {
				return date;
			}

			public void setDate(String date) {
				this.date = date;
			}

				

}
