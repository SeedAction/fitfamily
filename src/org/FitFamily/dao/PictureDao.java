package org.FitFamily.dao;

import org.FitFamily.model.Picture;

public interface PictureDao {
	/**
	* Insert a Picture in database
	*
	* @param newPicture: The picture to insert. Must not be null.
	* @return The picture created
	*/
	Picture create(Picture newPicture);
	
	/**
	* Retrieve a Picture from databases
	*
	* @param id: The id of the picture to retrieved
	* @return The picture with the id given in parameters, null otherwise.
	*/
	Picture read(long id);
	
	/**
	* Update picture information in the database based on picture id.
	*
	* @param picture: The picture to update. Must not be null.
	*/
	void update(Picture picture);
	
	/**
	* Remove a picture from the database.
	*
	* @param id: The id of the picture to remove.
	*/
	void delete(long id);
}
