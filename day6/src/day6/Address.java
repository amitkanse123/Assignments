package day6;

import java.util.Comparator;

public class Address implements Comparable<Address> {

	private int pincode;
	String address;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", address=" + address + "]";
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Address(int pincode, String address) {
		super();
		this.pincode = pincode;
		this.address = address;
	}
	@Override
	
	public int compareTo(Address arg0) {
		
		return this.address.compareToIgnoreCase(arg0.address);
	}
	
	

}
