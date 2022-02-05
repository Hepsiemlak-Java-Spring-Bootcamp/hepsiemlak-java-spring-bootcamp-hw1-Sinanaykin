package Models;

public class Realestate {
	
	private String province;
	private String district;
	private String housinType;
	private String roomNumber;
	private int area;
	private int floorLocation;
	private boolean isFurnised;
	
	public Realestate() {
		
	}

	public Realestate(String province, String district, String housinType, String roomNumber, int area,
			int floorLocation, boolean isFurnised) {
		super();
		this.province = province;
		this.district = district;
		this.housinType = housinType;
		this.roomNumber = roomNumber;
		this.area = area;
		this.floorLocation = floorLocation;
		this.isFurnised = isFurnised;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getHousinType() {
		return housinType;
	}

	public void setHousinType(String housinType) {
		this.housinType = housinType;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getFloorLocation() {
		return floorLocation;
	}

	public void setFloorLocation(int floorLocation) {
		this.floorLocation = floorLocation;
	}

	public boolean isFurnised() {
		return isFurnised;
	}

	public void setFurnised(boolean isFurnised) {
		this.isFurnised = isFurnised;
	}
	
	

}
