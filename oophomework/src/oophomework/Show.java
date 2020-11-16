package oophomework;

public class Show {
	private String genre;
	private String title;
	private String venue;
	private boolean isTicketed;
	private int capacity;
	
	public Show() {
	}
	
	public Show(String title, String venue) {
		this.title = title;
		this.venue = venue;
	}
	
	public Show (String genre, 
			String title, 
			String venue, 
			boolean isTicketed, 
			int capacity) {
		this.genre = genre;
		this.title = title;
		this.isTicketed = isTicketed;
		this.capacity = capacity;
		}

	public String getGenre() {
		return genre;
	}

	public String getTitle() {
		return title;
	}
	
	public String getVenue() {
		return venue;
	}
	
	public boolean getIsTicketed() {
		return isTicketed;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	public void setIsTicketed(boolean isTicketed) {
		this.isTicketed = isTicketed;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void makeFree() {
		if (this.isTicketed == true) {
			this.isTicketed = false;
		}
	}
	
	public void moveOutside() {
		if (venue != "outside") {
			venue = "outside";
		}
	}
}
	
	
	
	
	
	
}
