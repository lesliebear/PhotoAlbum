package cs213.photoAlbum.model;

import java.util.ArrayList;


public interface PhotoInterface {
	/**
	 * @author Bill Baker
	 */
	

	/**
	 * checks if two photos are the same/identical
	 * @param photo1- compared with photo2
	 * @param photo2- compared with photo1
	 * @return true if photos are identical, false if not identical
	 */
	public boolean identicalPhotos(Photo photo1);
		
	
	
	/**
	 * lists Tags of photo
	 * @param photo - photo of tags to be listed
	 * @return an array list of tags in format tagtype:tagvalue
	 */
	public ArrayList<String> listTags ();


	
	/**
	 * adds tag to photo OR 
	 * advises tag already exists
	 * @param photo - photo being altered
	 * @param tagType - string with tagType
	 * @param tagValue - string with tagValue
	 *  
	 */
	public void addTag (String tagType, String tagValue);

	/**
	 * deletes tag from photo
	 * OR advises tag does not exist for photo
	 * @param photo - photo being altered
	 * @param tagType - string of tagType
	 * @param tagValue - string with tagValue
	 * 
	 */
	public void deleteTag (String tagType, String tagValue);
	

	
	/**
	 * 
	 * @param photo - photo to re-caption
	 * @param newCaption - new caption to replace old caption
	 */
	public void recaptionPhoto(String newCaption);
	

}
