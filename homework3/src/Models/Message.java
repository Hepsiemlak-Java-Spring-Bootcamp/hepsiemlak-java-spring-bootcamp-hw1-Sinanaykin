package Models;

import java.util.Date;

public class Message {
	
	private String title;
	private String contents;
	private String sendDate;
	private String readDate;
	private boolean isSee;
	private User sender;
	private User buyer;
	
	public Message(){
		
	}
	public Message(String title, String contents, String sendDate, String readDate, boolean isSee, User sender,
			User buyer) {
		super();
		this.title = title;
		this.contents = contents;
		this.sendDate = sendDate;
		this.readDate = readDate;
		this.isSee = isSee;
		this.sender = sender;
		this.buyer = buyer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getSendDate() {
		return sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	public String getReadDate() {
		return readDate;
	}
	public void setReadDate(String readDate) {
		this.readDate = readDate;
	}
	public boolean isSee() {
		return isSee;
	}
	public void setSee(boolean isSee) {
		this.isSee = isSee;
	}
	public User getSender() {
		return sender;
	}
	public void setSender(User sender) {
		this.sender = sender;
	}
	public User getBuyer() {
		return buyer;
	}
	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

}
