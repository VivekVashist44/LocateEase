package FindByPinCode.FindByPinCode.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HospitalEntity {
    
	@Id
	@Column(name="sr_no")
	public long id;
	
	@Column(name="location_coordinates")
	public  String locationCordinate;
	
	@Column(name="address")
	public  String Address;
	
	@Column(name="hospital_name")
	public  String hospitalName;

	@Column(name="state")
	public  String state;
	
	@Column(name="district")
	public  String district;
	@Column(name="pincode")
	public  String pinCode;
	
	@Column(name="telephone")
	public  String telephoneNumber;
	
	@Column(name="hospital_primary_email")
	public  String email;
	
	@Column(name="website")
	public  String website;
	
	@Column(name="state_id")
	public  String stateId;
	@Column(name="district_id")
	public  String districtId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLocationCordinate() {
		return locationCordinate;
	}
	public void setLocationCordinate(String locationCordinate) {
		this.locationCordinate = locationCordinate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
}
