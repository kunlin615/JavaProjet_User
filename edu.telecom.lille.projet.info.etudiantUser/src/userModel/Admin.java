/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

import userModel.User;
import userModel.UserDB;
import java.io.*;
import org.jdom2.*;
import org.jdom2.output.*;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Admin.
 * 
 * @author Cristain.L
 */
public class Admin extends User {
	/**
	 * Description of the property adminId.
	 */
	protected Integer adminId = Integer.valueOf(0);

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
	 */
	public void createAdmin(Admin admin,String newAdminlogin, int adminID, String firstname, String surname,
			String pwd) {
		// Start of user code for method CreateAdmin
		//if (userDB.mapAdmin.containsKey(adminLogin)) {
			///if (!userDB.mapAdmin.containsKey(newAdminlogin)) {
				admin.Login = newAdminlogin;
				admin.adminId = adminID;
				admin.Firstname = firstname;
				admin.Lastname = surname;
				admin.Password = pwd;
				//userDB.mapAdmin.put(admin.Login, admin);
			//}
		//}

		// End of user code
	}

	/**
	 * Description of the method CreateStudent.
	 */
	public void createStudent(Student student, String newStudentLogin, int studentID, String firstname,
			String surname, String pwd) {
		// Start of user code for method CreateStudent
		//if (userDB.mapAdmin.containsKey(adminLogin)) {
			//if (!userDB.mapStudent.containsKey(newStudentLogin)) {
				student.Login = newStudentLogin;
				student.studentId = studentID;
				student.Firstname = firstname;
				student.Lastname = surname;
				student.Password = pwd;
				//userDB.mapStudent.put(student.Login, student);
			//}
		//}
		// End of user code
	}

	/**
	 * Description of the method CreateTeacher.
	 */
	public void createTeacher(Teacher teacher, String newteacherLogin, int teacherID, String firstname, String surname,
			String pwd) {
		// Start of user code for method CreateTeacher
		//if (userDB.mapAdmin.containsKey(adminLogin)) {
			//if (!userDB.mapTeacher.containsKey(newteacherLogin)) {
				teacher.Login = newteacherLogin;
				teacher.teacherId = teacherID;
				teacher.Firstname = firstname;
				teacher.Lastname = surname;
				teacher.Password = pwd;
				//userDB.mapTeacher.put(teacher.Login, teacher);
			//}
		//}
		// End of user code
	}

	/**
	 * Description of the method CreateGroup.
	 */
	public void createGroup(Group group, int groupId) {
		// Start of user code for method CreateGroup
		//if (userDB.mapAdmin.containsKey(adminLogin)) {
			//if (!userDB.mapGroup.containsKey(groupId)) {
				group.groupId = groupId;
				//userDB.mapGroup.put(groupId, group);

			//}
		//}
		// End of user code
	}

	/**
	 * Description of the method AssosiateStudent.
	 */
	/*public void assosiateStuToGroup(String adminLogin, String studentLogin, int groupId) {
		// Start of user code for method AssosiateStudent
		if (userDB.mapAdmin.containsKey(adminLogin)) {
			if (userDB.mapGroup.containsKey(groupId) && userDB.mapStudent.containsKey(studentLogin)) {
				userDB.mapStudent.get(studentLogin).setGroupId(groupId);
				userDB.mapGroup.get(groupId).setStudentQuantity(userDB.mapGroup.get(groupId).getStudentQuantity() + 1);
				userDB.mapGroup.get(groupId).mapStudent.put(studentLogin, userDB.mapStudent.get(studentLogin));

			}
		}

		// End of user code
	}

	/**
	 * Description of the method DeleteUser.
	 */
	/*public void removeUser(String adminLogin, String userLogin) {
		// Start of user code for method DeleteUser
		if (userDB.mapAdmin.containsKey(adminLogin)) {

			userDB.mapStudent.remove(userLogin);
			userDB.mapTeacher.remove(userLogin);
			userDB.mapAdmin.remove(userLogin);

		}
		// End of user code
	}

	/**
	 * Description of the method DeleteGroup.
	 */
	/*public void removeGroup(String adminLogin, int groupId) {
		// Start of user code for method DeleteGroup
		if (userDB.mapAdmin.containsKey(adminLogin)) {

			userDB.mapGroup.remove(groupId);

		}
		// End of user code
	}
	*/

	// Start of user code (user defined methods for Admin)

	// End of user code
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
	 */
	public void setAdminId(Integer newAdminId) {
		this.adminId = newAdminId;
	}

}
