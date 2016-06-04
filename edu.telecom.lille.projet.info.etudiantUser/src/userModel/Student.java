/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import userModel.User;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Student.
 * 
 * @author Cristain.L
 */
public class Student extends User {
	/**
	 * Description of the property studentId.
	 */
	public Integer studentId = Integer.valueOf(0);

	/**
	 * Description of the property groupId.
	 */
	public Integer groupId = Integer.valueOf(0);

	// Start of user code (user defined attributes for Student)

	// End of user code

	/**
	 * The constructor.
	 */
	public Student() {
		// Start of user code constructor for Student)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Student)

	// End of user code
	/**
	 * Returns studentId.
	 * @return studentId 
	 */
	public Integer getStudentId() {
		return this.studentId;
	}

	/**
	 * Sets a value to attribute studentId. 
	 * @param newStudentId 
	 */
	public void setStudentId(Integer newStudentId) {
		this.studentId = newStudentId;
	}

	/**
	 * Returns groupId.
	 * @return groupId 
	 */
	public Integer getGroupId() {
		return this.groupId;
	}

	/**
	 * Sets a value to attribute groupId. 
	 * @param newGroupId 
	 */
	public void setGroupId(Integer newGroupId) {
		this.groupId = newGroupId;
	}

}
