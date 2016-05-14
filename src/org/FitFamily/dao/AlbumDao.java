package org.FitFamily.dao;

import org.FitFamily.model.Album;

public interface AlbumDao {
	/**
	* Insert a Album in database
	*
	* @param newAlbum: The album to insert. Must not be null.
	* @return The album created
	*/
	Album create(Album newAlbum);
	
	/**
	* Retrieve a Album from databases
	*
	* @param id: The id of the album to retrieved
	* @return The album with the id given in parameters, null otherwise.
	*/
	Album read(long id);
	
	/**
	* Update Album information in the database based on album id.
	*
	* @param album: The album to update. Must not be null.
	*/
	void update(Album album);
	
	/**
	* Remove a Album from the database.
	*
	* @param id: The id of the album to remove.
	*/
	void delete(long id);
}
