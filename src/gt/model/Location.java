package gt.model;

public class Location {
	
	private int LocationId;
	private int Floor;
	private String HallName;
	private String HallCoord;
	
	private int Bookshelf;
	private String BookShelfCoord;
	private int Column;
	private int Layer;
	
	
	// get and set class member
	public int getLocationId() {
		return LocationId;
	}
	public void setLocationId(int locationId) {
		LocationId = locationId;
	}
	public int getFloor() {
		return Floor;
	}
	public void setFloor(int floor) {
		Floor = floor;
	}
	public String getHallName() {
		return HallName;
	}
	public void setHallName(String hallName) {
		HallName = hallName;
	}
	public String getHallCoord() {
		return HallCoord;
	}
	public void setHallCoord(String hallCoord) {
		HallCoord = hallCoord;
	}
	public int getBookshelf() {
		return Bookshelf;
	}
	public void setBookshelf(int bookshelf) {
		Bookshelf = bookshelf;
	}
	public String getBookShelfCoord() {
		return BookShelfCoord;
	}
	public void setBookShelfCoord(String bookShelfCoord) {
		BookShelfCoord = bookShelfCoord;
	}
	public int getColumn() {
		return Column;
	}
	public void setColumn(int column) {
		Column = column;
	}
	public int getLayer() {
		return Layer;
	}
	public void setLayer(int layer) {
		Layer = layer;
	}

	
	


}
