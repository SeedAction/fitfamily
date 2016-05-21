package org.FitFamily.model;

import java.util.Date;
import java.util.List;

public class Album {
	/*Properties*/
	private int id;
	private String title;
	private Date created;
	private Date updated;
	private List<Picture> pictures;
	private int userId;
	
	/*Getters/Setters*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}