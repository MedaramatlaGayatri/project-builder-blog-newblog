package model;

import java.time.LocalDate;

// Type your code
/*Create a class called Blog inside the model package with the following arguments*
2.
5.*Generate appropriate getters and setters.*
6.*Generate a 3 argument constructor in the Blog class.*
*/
public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	public Blog(String title, String description, LocalDate postedOn) {
		super();
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	
}