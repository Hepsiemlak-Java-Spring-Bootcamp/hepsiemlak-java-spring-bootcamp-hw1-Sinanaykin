package Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
	
	private String userType;
	private String name;
	private String mail;
	private String picture;
	private String biography;
	private String vknNo;
	public Set<Advert> favoriteAdvert = new HashSet<>();
	public  List<Advert> releaseAdvert =new ArrayList<Advert>();
	public List<Message> MessageBox=new ArrayList<Message>();	
	
	public User() {
		
	}
	
	public User(String userType, String name, String mail, String picture, String biography, String vknNo
			) {
		super();
		this.userType = userType;
		this.name = name;
		this.mail = mail;
		this.picture = picture;
		this.biography = biography;
		this.vknNo = vknNo;

	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getVknNo() {
		return vknNo;
	}

	public void setVknNo(String vknNo) {
		this.vknNo = vknNo;
	}

	public Set<Advert> getFavoriteAdvert() {
		return favoriteAdvert;
	}

	public void setFavoriteAdvert(Set<Advert> favoriteAdvert) {
		this.favoriteAdvert = favoriteAdvert;
	}

	public List<Advert> getReleaseDate() {
		return releaseAdvert;
	}

	public void setReleaseDate(List<Advert> releaseDate) {
		this.releaseAdvert = releaseDate;
	}

	public List<Message> getMessageBox() {
		return MessageBox;
	}

	public void setMessageBox(List<Message> messageBox) {
		MessageBox = messageBox;
	}

	


}

