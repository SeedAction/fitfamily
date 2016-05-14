package org.FitFamily.dao;

import org.FitFamily.model.Comment;

public interface CommentDao {
	/**
	* Insert a Comment in database
	*
	* @param newComment: The comment to insert. Must not be null.
	* @return The comment created
	*/
	Comment create(Comment newComment);
	
	/**
	* Retrieve a Comment from databases
	*
	* @param id: The id of the comment to retrieved
	* @return The comment with the id given in parameters, null otherwise.
	*/
	Comment read(long id);
	
	/**
	* Update Comment information in the database based on comment id.
	*
	* @param comment: The comment to update. Must not be null.
	*/
	void update(Comment comment);
	
	/**
	* Remove a comment from the database.
	*
	* @param id: The id of the comment to remove.
	*/
	void delete(long id);
}
