package com.yash.MavenEmbeddedHibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="EmpAdd1")
//@Embeddable
public class Address 
{
		
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empid" ,columnDefinition="INTEGER")
	
private int empid;
	
	@Column(name="STREETNAME" ,columnDefinition="VARCHAR(25)")
		private String street;
	@Column(name="CITYNAME" ,columnDefinition="VARCHAR(25)")
		private String city;
	@Column(name="STATENAME" ,columnDefinition="VARCHAR(25)")
		private String state;
	@Column(name="PINCODE" ,columnDefinition="VARCHAR(25)")
		private String pincode;
		@OneToOne(targetEntity=Employee.class)
		//@JoinColumn(name="id")
	private Employee emp;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		
		public Employee getEmp() {
			return emp;
		}
		public void setEmp(Employee emp) {
			this.emp = emp;
		}
		public Address(int empid,String street, String city, String state, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.empid= empid;
	}
		public Address() {
			
		}
		public String getStreet() 
		{
			return street;
		}
		public void setStreet(String street) 
		{
			this.street = street;
		}
		public String getCity() 
		{
			return city;
		}
		public void setCity(String city) 
		{
			this.city = city;
		}
		public String getState() 
		{
			return state;
		}
		public void setState(String state) 
		{
			this.state = state;
		}
		public String getPincode() 
		{
			return pincode;
		}
		public void setPincode(String pincode) 
		{
			this.pincode = pincode;
		}
		
	//	@Override
	//	public String toString() {
		//	return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	//	}
		@Override
		public String toString() {
			return "Address [empid=" + empid + ", street=" + street + ", city=" + city + ", state=" + state
					+ ", pincode=" + pincode + "]";
		}
		

		
		
		
}
 