package swa;


public class Address {

	private String hNum,street,city,pin;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String hNum, String street, String city, String pin) {
		super();
		this.hNum = hNum;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public boolean equals(Object o)
	{
		if(o instanceof Address)
		{
			Address a = (Address) o;
			if(this.hNum.equals(a.hNum) && this.city.equals(a.city) && this.pin.equals(a.pin) && this.street.equals(a.street))
				return true;
			else
				return false;	
		}
		else
			return false;
	}

	public String gethNum() {
		return hNum;
	}

	public void sethNum(String hNum) {
		this.hNum = hNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}

