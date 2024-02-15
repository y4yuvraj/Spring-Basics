package noConfigWithProperties;

public class Address {

	private int houseNo;

	private String state;

	public Address() {
		super();
	}

	public Address(int houseNo, String state, String city) {
		super();
		this.houseNo = houseNo;
		this.state = state;
		this.city = city;
	}

	private String city;

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", state=" + state + ", city=" + city + "]";
	}

}
