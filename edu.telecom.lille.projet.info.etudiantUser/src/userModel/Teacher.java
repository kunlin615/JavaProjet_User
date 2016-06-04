/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import userModel.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Teacher.
 * 
 * @author Cristain.L
 */
public class Teacher extends User {
	/**
	 * Description of the property teacherId.
	 */
	public Integer teacherId = Integer.valueOf(0);

	// Start of user code (user defined attributes for Teacher)

	// End of user code

	/**
	 * The constructor.
	 */
	public Teacher() {
		// Start of user code constructor for Teacher)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Teacher)

	// End of user code
	/**
	 * Returns teacherId.
	 * @return teacherId 
	 */
	public Integer getTeacherId() {
		return this.teacherId;
	}

	/**
	 * Sets a value to attribute teacherId. 
	 * @param newTeacherId 
	 */
	public void setTeacherId(Integer newTeacherId) {
		this.teacherId = newTeacherId;
	}

}
