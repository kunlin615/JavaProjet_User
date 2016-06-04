/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of User.
 * 
 * @author Cristain.L
 */
public class User {
	/**
	 * Description of the property Login.
	 */
	public String Login = "";

	/**
	 * Description of the property Firstname.
	 */
	public String Firstname = "";

	/**
	 * Description of the property Lastname.
	 */
	public String Lastname = "";

	/**
	 * Description of the property Password.
	 */
	public String Password = "";

	// Start of user code (user defined attributes for User)

	// End of user code

	/**
	 * The constructor.
	 */
	public User() {
		// Start of user code constructor for User)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for User)

	// End of user code
	/**
	 * Returns Login.
	 * @return Login 
	 */
	public String getLogin() {
		return this.Login;
	}

	/**
	 * Sets a value to attribute Login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
		this.Login = newLogin;
	}

	/**
	 * Returns Firstname.
	 * @return Firstname 
	 */
	public String getFirstname() {
		return this.Firstname;
	}

	/**
	 * Sets a value to attribute Firstname. 
	 * @param newFirstname 
	 */
	public void setFirstname(String newFirstname) {
		this.Firstname = newFirstname;
	}

	/**
	 * Returns Lastname.
	 * @return Lastname 
	 */
	public String getLastname() {
		return this.Lastname;
	}

	/**
	 * Sets a value to attribute Lastname. 
	 * @param newLastname 
	 */
	public void setLastname(String newLastname) {
		this.Lastname = newLastname;
	}

	/**
	 * Returns Password.
	 * @return Password 
	 */
	public String getPassword() {
		return this.Password;
	}

	/**
	 * Sets a value to attribute Password. 
	 * @param newPassword 
	 */
	public void setPassword(String newPassword) {
		this.Password = newPassword;
	}

}
