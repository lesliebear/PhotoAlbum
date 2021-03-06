package cs213.photoAlbum.model;

import java.io.IOException;
import java.util.ArrayList;


/**
 * 
 * @author Tian Qi Xiong
 *
 */
public interface Model {
	/**
	 * 
	 * reads in a user from storage into memory	
	 * @param userID - unique ID of user used to log in
	 * @return User object of user with this ID containing 
	 * all constituent user data
	 * @throws IOException 
	 * @throws ClassNotFoundException
	 */
	public SessionPersistence readUser() throws IOException, 
	ClassNotFoundException;
	
	/**
	 * 
	 * writes a user to storage from memory
	 * @param user - user object containing all constituent user data
	 *  to move to storage from memory
	 * @throws IOException
	 */
	public void writeUser(SessionPersistence sp)throws IOException;
	
	/**
	 * adds a user, creates new user with unique user ID
	 * @param userID- unique ID used for newly created user used for login
	 */
	public void addUser(String userID, String username);
	
	/**
	 * 
	 * deletes specified user
	 * @param userID - ID of user to be deleted
	 */
	public void deleteUser(String userID);
	
	/**
	 * 
	 * get a list of existing users, identified by user ID's
	 * @return
	 */
	public ArrayList<User> getUsers();
	

}
