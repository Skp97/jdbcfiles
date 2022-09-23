package jdbc_use_batch_execution;

class Student {
	private int id;
	private String name;
	private String address;
	private long mobNo;
	private long pin;
	public Student(int id, String name, String address, long mobNo, long pin) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobNo = mobNo;
		this.pin = pin;
	}
	public Student() {
		
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	
}
