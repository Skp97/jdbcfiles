package jdbc_use_maven;

public class Person {
	private int id;
	private String name;
	private String address;
	private long phoneNum;
	private long  pin;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	
}
