package org.FitFamily.dao;

import org.FitFamily.model.Post;

public interface PostDao {
	/**
	* Insert a Post in database
	*
	* @param newPost: The post to insert. Must not be null.
	* @return The post created
	*/
	Post create(Post newPost);
	
	/**
	* Retrieve a Post from databases
	*
	* @param id: The id of the post to retrieved
	* @return The post with the id given in parameters, null otherwise.
	*/
	Post read(long id);
	
	/**
	* Update post information in the database based on post id.
	*
	* @param post: The post to update. Must not be null.
	*/
	void update(Post post);
	
	/**
	* Remove a post from the database.
	*
	* @param id: The id of the post to remove.
	*/
	void delete(long id);
}
