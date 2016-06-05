package userController;

import userModel.Admin;
import userModel.Group;
import userModel.Student;
import userModel.Teacher;
import userModel.UserDB;
import java.io.*;
import java.util.Map.Entry;

import org.jdom2.*;
import org.jdom2.input.*;

/**
 * Cette classe est le contrôleur d'utilisateurs que vous devez implémenter.
 * Elle contient un attribut correspondant à la base de données utilisateurs que
 * vous allez créer. Elle contient toutes les fonctions de l'interface
 * IUserController que vous devez implémenter.
 * 
 * @author Jose Mennesson (Mettre à jour)
 * @version 04/2016 (Mettre à jour)
 * 
 */

// TODO Classe à modifier

public class UserController implements IUserController {

	/**
	 * Contient une instance de base de données d'utilisateurs
	 * 
	 */
	public UserDB userDB = null;
	static Document document;
	static Element racine;


	/**
	 * Constructeur de controleur d'utilisateurs créant la base de données
	 * d'utilisateurs
	 * 
	 * @param userfile
	 *            Fichier XML contenant la base de données d'utilisateurs
	 */
	public UserController(String userfile) {
		UserDB userDB = new UserDB(userfile);
		this.setUserDB(userDB);
	}

	@Override
	public String getUserName(String userLogin) {
		if (userDB.mapTeacher.containsKey(userLogin))
			return userDB.mapTeacher.get(userLogin).Firstname + userDB.mapTeacher.get(userLogin).Lastname;
		else if (userDB.mapStudent.containsKey(userLogin))
			return userDB.mapStudent.get(userLogin).Firstname + userDB.mapStudent.get(userLogin).Lastname;
		else if (userDB.mapAdmin.containsKey(userLogin))
			return userDB.mapAdmin.get(userLogin).Firstname + userDB.mapAdmin.get(userLogin).Lastname;
		else
			return "l'utilisateur n'est pas reconnu";
	}

	@Override
	public String getUserClass(String userLogin, String userPwd) {
		if (userDB.mapTeacher.containsKey(userLogin))
			return "Teacher";
		else if (userDB.mapStudent.containsKey(userLogin))
			return "Student";
		else if (userDB.mapAdmin.containsKey(userLogin))
			return "Administrator";
		else
			return "l'utilisateur n'est pas reconnu";
	}

	@Override
	public int getStudentGroup(String studentLogin) {
		if (userDB.mapStudent.containsKey(studentLogin))
			return userDB.mapStudent.get(studentLogin).groupId;
		else
			return -1;
	}

	@Override
	public boolean addAdmin(String adminLogin, String newAdminlogin, int adminID, String firstname, String surname,
			String pwd) {
		userDB.addAdmin(adminLogin, newAdminlogin, adminID, firstname, surname, pwd);
		return userDB.mapAdmin.containsKey(newAdminlogin);
	}

	@Override
	public boolean addTeacher(String adminLogin, String newteacherLogin, int teacherID, String firstname,
			String surname, String pwd) {
		userDB.addTeacher(adminLogin, newteacherLogin, teacherID, firstname, surname, pwd);
		return userDB.mapTeacher.containsKey(newteacherLogin);
	}

	@Override
	public boolean addStudent(String adminLogin, String newStudentLogin, int studentID, String firstname,
			String surname, String pwd) {
		userDB.addStudent(adminLogin, newStudentLogin, studentID, firstname, surname, pwd);
		return userDB.mapTeacher.containsKey(newStudentLogin);
	}

	@Override
	public boolean removeUser(String adminLogin, String userLogin) {
		userDB.removeUser(adminLogin, userLogin);
		if (userDB.mapTeacher.containsKey(userLogin))
			return false;
		else if (userDB.mapStudent.containsKey(userLogin))
			return false;
		else if (userDB.mapAdmin.containsKey(userLogin))
			return false;
		else
			return true;
	}

	@Override
	public boolean addGroup(String adminLogin, int groupId) {
		userDB.addGroup(adminLogin, groupId);
		return userDB.mapGroup.containsKey(groupId);
	}

	@Override
	public boolean removeGroup(String adminLogin, int groupId) {
		userDB.removeGroup(adminLogin, groupId);
		return !(userDB.mapGroup.containsKey(groupId));
	}

	@Override
	public boolean associateStudToGroup(String adminLogin, String studentLogin, int groupId) {
		userDB.assosiateStuToGroup(adminLogin, groupId, studentLogin);
		if (userDB.mapStudent.get(studentLogin).groupId == groupId)
			return true;
		else
			return false;
	}

	@Override
	public String[] usersToString() {
		String[] User;
		int i = 0;
		int m = userDB.mapTeacher.size() + userDB.mapStudent.size() + userDB.mapAdmin.size();
		User = new String[m];
		for (Entry<String, Teacher> entry : userDB.mapTeacher.entrySet()) {
			User[i] = String
					.valueOf(entry.getValue().Firstname + " " + entry.getValue().Lastname + " " + entry.getValue().Login
							+ " " + String.valueOf(entry.getValue().teacherId) + " " + entry.getValue().Password);
			i++;
		}
		for (Entry<String, Student> entry : userDB.mapStudent.entrySet()) {
			User[i] = String.valueOf((entry.getValue().Firstname + " " + entry.getValue().Lastname + " "
					+ entry.getValue().Login + " " + String.valueOf(entry.getValue().studentId) + " "
					+ String.valueOf(entry.getValue().groupId) + " " + entry.getValue().Password));
			i++;
		}
		for (Entry<String, Admin> entry : userDB.mapAdmin.entrySet()) {
			User[i] = String
					.valueOf(entry.getValue().Firstname + " " + entry.getValue().Lastname + " " + entry.getValue().Login
							+ " " + String.valueOf(entry.getValue().adminId) + " " + entry.getValue().Password);
			i++;
		}
		return User;
	}

	@Override
	public String[] usersLoginToString() {
		String[] UserLogin;
		int i = 0;
		int m = userDB.mapTeacher.size() + userDB.mapStudent.size() + userDB.mapAdmin.size();
		UserLogin = new String[m];
		for (Entry<String, Teacher> entry : userDB.mapTeacher.entrySet()) {
			UserLogin[i] = String.valueOf(entry.getValue().Login);
			i++;
		}
		for (Entry<String, Student> entry : userDB.mapStudent.entrySet()) {
			UserLogin[i] = String.valueOf(entry.getValue().Login);
			i++;
		}
		for (Entry<String, Admin> entry : userDB.mapAdmin.entrySet()) {
			UserLogin[i] = String.valueOf(entry.getValue().Login);
			i++;
		}
		return UserLogin;
	}

	@Override
	public String[] studentsLoginToString() {
		String[] studentsLogin;
		int i = 0;
		int m = userDB.mapStudent.size();
		studentsLogin = new String[m];
		for (Entry<String, Student> entry : userDB.mapStudent.entrySet()) {
			studentsLogin[i] = String.valueOf(entry.getValue().Login);
			i++;
		}
		return studentsLogin;
	}

	@Override
	public String[] groupsIdToString() {
		String[] groupId;
		int i = 0;
		int m = userDB.mapGroup.size();
		groupId = new String[m];
		for (Entry<Integer, Group> entry : userDB.mapGroup.entrySet()) {
			groupId[i] = String.valueOf(entry.getValue().groupId);
			i++;
		}
		return groupId;
	}

	@Override
	public String[] groupsToString() {
		String[] group;
		int[] groupID;
		int i = 0;
		int j = 0;
		int m = userDB.mapGroup.size();
		int n = userDB.mapStudent.size();
		groupID = new int[m];
		group = new String[n+m];
		for (Entry<Integer, Group> entry : userDB.mapGroup.entrySet()) {
			groupID[j] = entry.getValue().groupId;
			j++;
		}
		for (int k = 0; k < m; k++) {
			group[i] = "GroupID" +" "+String.valueOf(groupID[k]);
			i++;
			for (Entry<String, Student> entry : userDB.mapStudent.entrySet()) {
				if (entry.getValue().groupId == groupID[k]) {
					group[i] = String.valueOf(entry.getValue().Firstname + " " + entry.getValue().Lastname + " "
							+ entry.getValue().Login + " " + String.valueOf(entry.getValue().studentId) + " "
							+ entry.getValue().Password);
					i++;
				}
			}
		}
		return group;

	}

	@Override
	public boolean loadDB() {
		// TODO Auto-generated method stub
		userDB.loadDB();
		return false;
	}

	@Override
	public boolean saveDB() {
		// TODO Auto-generated method stub
		userDB.saveDB();
		return false;
	}

	public UserDB getUserDB() {
		return userDB;
	}

	public void setUserDB(UserDB userDB) {
		this.userDB = userDB;
	}

}
