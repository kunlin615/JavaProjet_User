/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import java.util.HashMap;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Group.
 * 
 * @author xubian
 */
public class Group {
	/**
	 * Description of the property groupId.
	 */
	public Integer groupId = Integer.valueOf(0);

	/**
	 * Description of the property StudentList.
	 */
	
	HashMap<String ,Object> mapStudent = new HashMap<String ,Object>();  

	/**
	 * Description of the property students.
	 */

	/**
	 * Description of the property StudentQuantity.
	 */
	public Integer StudentQuantity = Integer.valueOf(0);

	// Start of user code (user defined attributes for Group)

	// End of user code

	/**
	 * The constructor.
	 */
	public Group() {
		// Start of user code constructor for Group)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Group)

	// End of user code
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
	 *    le nouveau ID de group
	 */
	public void setGroupId(Integer newGroupId) {
		this.groupId = newGroupId;
	}

	/**
	 * Returns StudentQuantity.
	 * @return StudentQuantity 
	 */
	public Integer getStudentQuantity() {
		return this.StudentQuantity;
	}

	/**
	 * Sets a value to attribute StudentQuantity. 
	 * @param newStudentQuantity 
	 * la quantit¨¦ de Student
	 */
	public void setStudentQuantity(Integer newStudentQuantity) {
		this.StudentQuantity = newStudentQuantity;
	}

}
