package swa;

import java.util.Date;

public class Employee {
	private String name;
	private Date dob;
	private Address homeAdress;
	private Address officeAddress;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Employee)
		{
			Employee e = (Employee) obj;
			if(this.name.equals(e.name) && this.dob.equals(e.dob) && 
					this.homeAdress.equals(e.homeAdress) && this.officeAddress.equals(e.officeAddress))
				return true;
			else
				return false;
		}
		else
			return false;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getHomeAdress() {
		return homeAdress;
	}
	public void setHomeAdress(Address homeAdress) {
		this.homeAdress = homeAdress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}



}





