package Models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Advert {
	private Realestate realEstate;
	private String title;
	private User user; 
	private String[] pictureList = new String[5];
	private int price;
	private int time;
	private boolean isPutforward = false;
	private boolean isReview = false;
	private String releaseDate;
	private boolean isActive;
	private String adverType;
	
	public Advert() {
		
	}

	public Advert(Realestate realEstate, String title, User user, String[] pictureList, int price, int time,
			boolean isPutforward, boolean isReview, String releaseDate, boolean isActive, String adverType) {
		super();
		this.realEstate = realEstate;
		this.title = title;
		this.user = user;
		this.pictureList = pictureList;
		this.price = price;
		this.time = time;
		this.isPutforward = isPutforward;
		this.isReview = isReview;
		this.releaseDate = releaseDate;
		this.isActive = isActive;
		this.adverType = adverType;
	}

	public Realestate getRealEstate() {
		return realEstate;
	}

	public void setRealEstate(Realestate realEstate) {
		this.realEstate = realEstate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String[] getPictureList() {
		return pictureList;
	}

	public void setPictureList(String[] pictureList) {
		this.pictureList = pictureList;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public boolean isPutforward() {
		return isPutforward;
	}

	public void setPutforward(boolean isPutforward) {
		this.isPutforward = isPutforward;
	}

	public boolean isReview() {
		return isReview;
	}

	public void setReview(boolean isReview) {
		this.isReview = isReview;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAdverType() {
		return adverType;
	}

	public void setAdverType(String adverType) {
		this.adverType = adverType;
	}
	

}

