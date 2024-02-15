package stereotypeAnnotationsExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	final String city_name="doon";
	
	@Value("101")
	private int houseNo;
	
	@Value("uk")
	private String state;
	
	@Value(city_name)
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
