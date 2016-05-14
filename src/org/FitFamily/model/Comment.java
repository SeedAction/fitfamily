package org.FitFamily.model;

import java.util.Date;

public class Comment {
	/*Properties*/
	private int id;
	private String content;
	private Date created;
	private Date updated;
	private int userId;
	private int postId;
	
	/*Constructor*/
	public Comment(int id, String content, int userId, int postId) {
		super();
		this.id = id;
		this.content = content;
		this.created = new Date();
		this.updated = new Date();
		this.userId = userId;
		this.postId = postId;
	}
	
	/*Getters/Setters*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
}
