package doubletowns;

public class Place {
	
	String placeName;
	String placeType;
	String county;
	
	public Place() {};
	
	public Place(Place oldPlace) {
		this.placeName = oldPlace.placeName;
		this.placeType = oldPlace.placeType;
		this.county = oldPlace.county;
	}
	
	public Place(String name, String type, String county) {
		super();
		this.placeName = name;
		this.placeType = type;
		this.county = county;
	}

	public String getName() {
		return placeName;
	}

	public void setName(String name) {
		this.placeName = name;
	}

	public String getType() {
		return placeType;
	}

	public void setType(String type) {
		this.placeType = type;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	@Override
	public String toString() {
		return "Place [name=" + placeName + ", type=" + placeType + ", county=" + county
				+ "]";
	}
	
	

}
