package com.capgemini.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessagePojo {

	private long id;
	private String message;
	private String creator;
	private String deletedOn;
	public MessagePojo() {
		super();
		
	}
	public MessagePojo(long id, String message, String creator, String deletedOn) {
		super();
		this.id = id;
		this.message = message;
		this.creator = creator;
		this.deletedOn = deletedOn;
	}
	public long getId() {
		return id;
	}
	public void setId(long i) {
		this.id = i;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getDeletedOn() {
		return deletedOn;
	}
	public void setDeletedOn(String deletedOn) {
		this.deletedOn = deletedOn;
	}
	@Override
	public String toString() {
		return "MessagePojo [id=" + id + ", message=" + message + ", creator=" + creator + ", deletedOn=" + deletedOn
				+ "]";
	}
	
}
