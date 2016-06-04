/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import userModel.User;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Admin.
 * 
 * @author xubian
 */
public class Admin extends User {
	/**
	 * Description of the property adminId.
	 */
	public Integer adminId = Integer.valueOf(0);

	// Start of user code (user defined attributes for Admin)
	// End of user code

	/**
	 * The constructor.
	 */
	public Admin() {
		// Start of user code constructor for Admin)
		super();

		// End of user code
	}

	/**
	 * Description of the method CreateAdmin.
	 * 
	 * @param admin
	 *            L'objet de admin
	 * @param newAdminlogin
	 *            Le nouveau login de Admin
	 * @param adminID
	 *            le ID de Admin
	 * @param firstname
	 *            le nom de Admin
	 * @param surname
	 *            le pr¨¦nom de Admin
	 * @param pwd
	 *            le mot de passe de Admin
	 */
	public void createAdmin(Admin admin, String newAdminlogin, int adminID, String firstname, String surname,
			String pwd) {
		admin.Login = newAdminlogin;
		admin.adminId = adminID;
		admin.Firstname = firstname;
		admin.Lastname = surname;
		admin.Password = pwd;
	}

	/**
	 * Description of the method CreateStudent.
	 * 
	 * @param student
	 *            L'objet de student
	 * @param newStudentLogin
	 *            Le nouveau login de Student
	 * @param studentID
	 *            le ID de Student
	 * @param firstname
	 *            le nom de Student
	 * @param surname
	 *            le pr¨¦nom de Student
	 * @param pwd
	 *            le mot de passe de Student
	 */
	public void createStudent(Student student, String newStudentLogin, int studentID, String firstname, String surname,
			String pwd) {
		student.Login = newStudentLogin;
		student.studentId = studentID;
		student.Firstname = firstname;
		student.Lastname = surname;
		student.Password = pwd;
	}

	/**
	 * Description of the method CreateTeacher.
	 * 
	 * @param teacher
	 *            L'objet de teacher
	 * @param newteacherLogin
	 *            Le nouveau login de Teacher
	 * @param teacherID
	 *            le ID de Teacher
	 * @param firstname
	 *            le nom de Teacher
	 * @param surname
	 *            le pr¨¦nom de Teacher
	 * @param pwd
	 *            le mot de passe de Teacher
	 */
	public void createTeacher(Teacher teacher, String newteacherLogin, int teacherID, String firstname, String surname,
			String pwd) {
		teacher.Login = newteacherLogin;
		teacher.teacherId = teacherID;
		teacher.Firstname = firstname;
		teacher.Lastname = surname;
		teacher.Password = pwd;
	}

	/**
	 * Description of the method CreateGroup.
	 * 
	 * @param group
	 * 	L'objet de group
	 * @param groupId
	 *        Le ID de group
	 */
	public void createGroup(Group group, int groupId) {
		group.groupId = groupId;

	}

	/**
	 * Returns adminId.
	 * 
	 * @return adminId
	 */
	public Integer getAdminId() {
		return this.adminId;
	}

	/**
	 * Sets a value to attribute adminId.
	 * 
	 * @param newAdminId
	 *        Le nouveau ID de Admin
	 */
	public void setAdminId(Integer newAdminId) {
		this.adminId = newAdminId;
	}

}
