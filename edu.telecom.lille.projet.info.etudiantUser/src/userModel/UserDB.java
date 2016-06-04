package userModel;

import java.io.*;
import org.jdom2.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.jdom2.output.*;
import org.jdom2.input.*;
import java.util.List;
import userModel.Admin;

/**
 * 
 * Cette classe gére la base de données d'utilisateurs. Elle doit permettre de
 * sauvegarder et charger les utilisateurs et les groupes à partir d'un fichier
 * XML. La structure du fichier XML devra être la même que celle du fichier
 * userDB.xml.
 * 
 * @see <a href="../../userDB.xml">userDB.xml</a>
 * 
 * @author Jose Mennesson (Mettre à jour)
 * @version 04/2016 (Mettre à jour)
 * 
 */

// TODO Classe à modifier

public class UserDB {

	/**
	 * 
	 * Le fichier contenant la base de données.
	 * 
	 */
	private String file;

public static	HashMap<String, Teacher> mapTeacher = new HashMap<String, Teacher>();
public	HashMap<String, Admin> mapAdmin = new HashMap<String, Admin>();
public	HashMap<String, Student> mapStudent = new HashMap<String, Student>();
public	HashMap<Integer, Group> mapGroup = new HashMap<Integer, Group>();
	Admin Su = new Admin();

	/**
	 * 
	 * Constructeur de UserDB.
	 * 
	 * !!!!!!!!!!!! PENSEZ À AJOUTER UN ADMINISTRATEUR (su par exemple) QUI VOUS
	 * PERMETTRA DE CHARGER LA BASE DE DONNÉES AU DEMARRAGE DE L'APPLICATION
	 * !!!!!!
	 * 
	 * @param file
	 *            Le nom du fichier qui contient la base de données.
	 */
	public UserDB(String file) {
		// TODO Fonction à modifier
		super();
		Su.Login = "su";
		Su.Lastname = "su";
		Su.Firstname = "su";
		Su.Password = "SuperUser";
		Su.adminId = 0;
		mapAdmin.put(Su.Login, Su);
		this.setFile(file);
	}

	/**
	 * Getter de file
	 * 
	 * @return Le nom du fichier qui contient la base de données.
	 */

	public String getFile() {
		return file;
	}

	/**
	 * Setter de file
	 * 
	 * @param file
	 *            Le nom du fichier qui contient la base de données.
	 */

	public void setFile(String file) {
		this.file = file;
	}

	public void addAdmin(String adminLogin, String newAdminlogin, int adminID, String firstname, String surname,
			String pwd) {
		Admin admin = new Admin();
		mapAdmin.get(adminLogin).createAdmin(admin, newAdminlogin, adminID, firstname, surname, pwd);
		mapAdmin.put(newAdminlogin, admin);
	}

	public void addStudent(String adminLogin, String newStudentlogin, int StudentID, String firstname, String surname,
			String pwd) {
		Student student = new Student();
		mapAdmin.get(adminLogin).createStudent(student, newStudentlogin, StudentID, firstname, surname, pwd);
		mapStudent.put(newStudentlogin, student);
	}

	public void addTeacher(String adminLogin, String newteacherlogin, int teacherID, String firstname, String surname,
			String pwd) {
		Teacher teacher = new Teacher();
		mapAdmin.get(adminLogin).createTeacher(teacher, newteacherlogin, teacherID, firstname, surname, pwd);
		mapTeacher.put(newteacherlogin, teacher);
	}

	public void addGroup(String adminLogin, int groupID) {
		Group group = new Group();
		mapAdmin.get(adminLogin).createGroup(group, groupID);
		mapGroup.put(groupID, group);
	}

	public void removeUser(String adminLogin, String userLogin) {
		// Start of user code for method DeleteUser
		if (mapAdmin.containsKey(adminLogin)) {
		mapStudent.remove(userLogin);
			mapTeacher.remove(userLogin);
			mapAdmin.remove(userLogin);
		}

	}
	
	public void removeGroup(String adminLogin, int groupId) {
	// Start of user code for method DeleteGroup
	if (mapAdmin.containsKey(adminLogin)) {

		mapGroup.remove(groupId);

	}

}
	
	public void assosiateStuToGroup(String adminLogin, String studentLogin, int groupId) {
	// Start of user code for method AssosiateStudent
	if (mapAdmin.containsKey(adminLogin)) {
		if (mapGroup.containsKey(groupId) && mapStudent.containsKey(studentLogin)) {
			mapStudent.get(studentLogin).setGroupId(groupId);
	// mapStudent.put(studentLogin,mapStudent.get(studentLogin));
			
			mapGroup.get(groupId).setStudentQuantity(mapGroup.get(groupId).getStudentQuantity() + 1);
			mapGroup.get(groupId).mapStudentOfGroup.put(studentLogin, mapStudent.get(studentLogin));
	

		}
	}

	// End of user code
}



	public void loadDB() {
		org.jdom2.Document document = null;
		Element root;
		Element groups;
		Element students;
		Element teachers;
		Element admins;
		SAXBuilder sxb = new SAXBuilder();
		try {
			document = sxb.build(new File("userDB.xml"));
		} catch (Exception e) {
		}

		if (document != null) {
			root = document.getRootElement();

			groups = root.getChild("Groups");
			List<Element> group = groups.getChildren("Group");
			Iterator<Element> itGroup = group.iterator();
			while (itGroup.hasNext()) {
				Element unGroup = (Element) itGroup.next();
				Group Group = new Group();
				Integer groupId = Integer.parseInt(unGroup.getChild("groupId").getText());
				Group.setGroupId(groupId);
				mapGroup.put(groupId, Group);
			}

			students = root.getChild("Students");
			List<Element> student = students.getChildren("Student");
			Iterator<Element> itStudent = student.iterator();
			while (itStudent.hasNext()) {
				Element unStudent = (Element) itStudent.next();
				Student Student = new Student();

				String studentLogin = unStudent.getChild("login").getText();
				Student.setLogin(studentLogin);

				String studentFirstname = unStudent.getChild("firstname").getText();
				Student.setFirstname(studentFirstname);

				String studentSurename = unStudent.getChild("surename").getText();
				Student.setLastname(studentSurename);

				String studentPwd = unStudent.getChild("pwd").getText();
				Student.setPassword(studentPwd);

				Integer studentId = Integer.parseInt(unStudent.getChild("studentId").getText());
				Student.setStudentId(studentId);

				Integer studentGoupId = Integer.parseInt(unStudent.getChild("groupId").getText());
				Student.setGroupId(studentGoupId);

				mapStudent.put(studentLogin, Student);
			}

			teachers = root.getChild("Teachers");
			List<Element> teacher = teachers.getChildren("Teacher");
			Iterator<Element> itTeacher = teacher.iterator();
			while (itTeacher.hasNext()) {
				Element unTeacher = (Element) itTeacher.next();
				Teacher Teacher = new Teacher();

				String teacherLogin = unTeacher.getChild("login").getText();
				Teacher.setLogin(teacherLogin);

				String teacherFirstname = unTeacher.getChild("firstname").getText();
				Teacher.setFirstname(teacherFirstname);

				String teacherSurename = unTeacher.getChild("surename").getText();
				Teacher.setLastname(teacherSurename);

				String teacherPwd = unTeacher.getChild("pwd").getText();
				Teacher.setPassword(teacherPwd);

				Integer teacherId = Integer.parseInt(unTeacher.getChild("teacherId").getText());
				Teacher.setTeacherId(teacherId);

				mapTeacher.put(teacherLogin, Teacher);
			}

			admins = root.getChild("Administrators");
			List<Element> admin = admins.getChildren("Administrator");
			Iterator<Element> itAdmin = admin.iterator();
			while (itAdmin.hasNext()) {
				Element unAdmin = (Element) itAdmin.next();
				Admin Admin = new Admin();

				String adminLogin = unAdmin.getChild("login").getText();
				Admin.setLogin(adminLogin);

				String adminFirstname = unAdmin.getChild("firstname").getText();
				Admin.setFirstname(adminFirstname);

				String adminSurename = unAdmin.getChild("surename").getText();
				Admin.setLastname(adminSurename);

				String adminPwd = unAdmin.getChild("pwd").getText();
				Admin.setPassword(adminPwd);

				Integer adminId = Integer.parseInt(unAdmin.getChild("adminId").getText());
				Admin.setAdminId(adminId);

				mapAdmin.put(adminLogin, Admin);
			}

		}

	}

	public void saveDB() {

		Element root = new Element("UsersDB");
		org.jdom2.Document document = new Document(root);
		Element Groups = new Element("Groups");
		Element Students = new Element("Students");
		Element Teachers = new Element("Teachers");
		Element Administrators = new Element("Administrators");
		root.addContent(Groups);
		root.addContent(Students);
		root.addContent(Teachers);
		root.addContent(Administrators);

		for (Entry<String, Admin> entry : mapAdmin.entrySet()) {
			String userLogin = entry.getKey();
			Admin admin = entry.getValue();
			Element Administrator = new Element("Administrator");
			Administrators.addContent(Administrator);

			Element login = new Element("login");
			login.setText(admin.getLogin());
			Administrator.addContent(login);

			Element firstname = new Element("firstname");
			firstname.setText(admin.getFirstname());
			Administrator.addContent(firstname);

			Element surename = new Element("surename");
			surename.setText(admin.Lastname);
			Administrator.addContent(surename);

			Element pwd = new Element("pwd");
			pwd.setText(admin.getPassword());
			Administrator.addContent(pwd);

			Element adminId = new Element("adminId");
			adminId.setText(String.valueOf(admin.getAdminId()));
			Administrator.addContent(adminId);
		}

		for (Entry<String, Student> entry : mapStudent.entrySet()) {
			String userLogin = entry.getKey();
			Student student = entry.getValue();
			Element Student = new Element("Student");
			Students.addContent(Student);

			Element login = new Element("login");
			login.setText(student.getLogin());
			Student.addContent(login);

			Element firstname = new Element("firstname");
			firstname.setText(student.getFirstname());
			Student.addContent(firstname);

			Element surename = new Element("surename");
			surename.setText(student.Lastname);
			Student.addContent(surename);

			Element pwd = new Element("pwd");
			pwd.setText(student.getPassword());
			Student.addContent(pwd);

			Element studentId = new Element("studentId");
			studentId.setText(String.valueOf(student.getStudentId()));
			Student.addContent(studentId);

			Element studentGroupId = new Element("groupId");
			studentGroupId.setText(String.valueOf(student.getGroupId()));
			Student.addContent(studentGroupId);

		}

		for (Entry<String, Teacher> entry : mapTeacher.entrySet()) {
			String userLogin = entry.getKey();
			Teacher teacher = entry.getValue();
			Element Teacher = new Element("Teacher");
			Teachers.addContent(Teacher);

			Element login = new Element("login");
			login.setText(teacher.getLogin());
			Teacher.addContent(login);

			Element firstname = new Element("firstname");
			firstname.setText(teacher.getFirstname());
			Teacher.addContent(firstname);

			Element surename = new Element("surename");
			surename.setText(teacher.Lastname);
			Teacher.addContent(surename);

			Element pwd = new Element("pwd");
			pwd.setText(teacher.getPassword());
			Teacher.addContent(pwd);

			Element teacherId = new Element("teacherId");
			teacherId.setText(String.valueOf(teacher.getTeacherId()));
			Teacher.addContent(teacherId);
		}

		for (Entry<Integer, Group> entry : mapGroup.entrySet()) {

			Group group = entry.getValue();
			Element Group = new Element("Group");
			Groups.addContent(Group);

			Element groupId = new Element("groupId");
			groupId.setText(String.valueOf(group.getGroupId()));
			Group.addContent(groupId);
		}

		try {
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, new FileOutputStream("userDB.xml"));
		} catch (java.io.IOException e) {
		}

	}
}
