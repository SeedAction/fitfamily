package org.FitFamily.model;

import java.util.Date;

public class Picture {
	/*Properties*/
	private int id;
	private String title;
	private Date created;
	private Date updated;
	private int userId;
	private int albumId;
	
	/*Constructor*/
	public Picture(int id, String title, int userId, int albumId) {
		super();
		this.id = id;
		this.title = title;
		this.created = new Date();
		this.updated = new Date();
		this.userId = userId;
		this.albumId = albumId;
	}

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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
}