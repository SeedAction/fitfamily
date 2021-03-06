package org.FitFamily.model;

import java.util.Date;
import java.util.List;

public class Post {
	/*Properties*/
	private int id;
	private String title;
	private String content;
	private Date created;
	private Date updated;
	private List<Comment> comments;
	private int userId;
	
	/*Constructor*/
	public Post(int id, String title, String content, int userId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.created = new Date();
		this.updated = new Date();
		this.comments = null;
		this.userId = userId;
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
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
