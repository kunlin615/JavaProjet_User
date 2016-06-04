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
 * @author Cristain.L
 */
public class Group {
	/**
	 * Description of the property groupId.
	 */
	public Integer groupId = Integer.valueOf(0);

	/**
	 * Description of the property StudentList.
	 */
	//public EEList StudentList = null;
	
	HashMap<String ,Object> mapStudentOfGroup = new HashMap<String ,Object>();  

	/**
	 * Description of the property students.
	 */
	//public HashSet<Student> students = new HashSet<Student>();

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
	 */
	public void setGroupId(Integer newGroupId) {
		this.groupId = newGroupId;
	}

	/**
	 * Returns StudentList.
	 * @return StudentList 
	 */
	//public EEList getStudentList() {
	//	return this.StudentList;
	//}

	/**
	 * Sets a value to attribute StudentList. 
	 * @param newStudentList 
	 */
	//public void setStudentList(EEList newStudentList) {
	//	this.StudentList = newStudentList;
	//}

	/**
	 * Returns students.
	 * @return students 
	 */
	//public HashSet<Student> getStudents() {
	//	return this.students;
	//}

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
	 */
	public void setStudentQuantity(Integer newStudentQuantity) {
		this.StudentQuantity = newStudentQuantity;
	}

}
