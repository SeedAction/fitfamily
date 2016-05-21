package org.FitFamily.model;

import java.util.Date;

public class FriendRequest {
	/*Properties*/
	private int id;
	private String message;
	private Date created;
	private Boolean accepted;
	private Boolean acknowledged;
	private int senderId;
	private int recipientId;

	/*Getters/Setters*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Boolean getAccepted() {
		return accepted;
	}

	public void setAccepted(Boolean accepted) {
		this.accepted = accepted;
	}

	public Boolean getAcknowledged() {
		return acknowledged;
	}

	public void setAcknowledged(Boolean acknowledged) {
		this.acknowledged = acknowledged;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(int recipientId) {
		this.recipientId = recipientId;
	}
}
