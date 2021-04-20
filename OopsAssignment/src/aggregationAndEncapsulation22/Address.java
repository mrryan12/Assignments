package aggregationAndEncapsulation22;

public class Address {
	private String addressLine;
	private String city;
	private String officialAddress;
	
	public String getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(String officialAddress) {
		this.officialAddress = officialAddress;
	}

	public String getAddressDetails()
	{
		return addressLine  +", officialAddress : " +officialAddress+ ", city : "+ city;
	}
	
	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String addressLine,String officialAddress, String city) {
		this.addressLine = addressLine;
		this.city = city;
		this.officialAddress =officialAddress;
	}
}
