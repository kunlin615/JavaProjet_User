/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package userModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of ContraintesHoraires.
 * 
 * @author Cristain.L
 * @param <EDate>
 */
public class ContraintesHoraires<EDate> {
	/**
	 * Description of the property teacherId.
	 */
	public String teacherId = "";

	/**
	 * Description of the property login.
	 */
	public String login = "";

	/**
	 * Description of the property Start.
	 */
	public EDate Start = null;

	/**
	 * Description of the property End.
	 */
	public EDate End = null;

	/**
	 * Description of the property Comment.
	 */
	public String Comment = "";

	// Start of user code (user defined attributes for ContraintesHoraires)

	// End of user code

	/**
	 * The constructor.
	 */
	public ContraintesHoraires() {
		// Start of user code constructor for ContraintesHoraires)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for ContraintesHoraires)

	// End of user code
	/**
	 * Returns teacherId.
	 * @return teacherId 
	 */
	public String getTeacherId() {
		return this.teacherId;
	}

	/**
	 * Sets a value to attribute teacherId. 
	 * @param newTeacherId 
	 */
	public void setTeacherId(String newTeacherId) {
		this.teacherId = newTeacherId;
	}

	/**
	 * Returns login.
	 * @return login 
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 * Sets a value to attribute login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
		this.login = newLogin;
	}

	/**
	 * Returns Start.
	 * @return Start 
	 */
	public EDate getStart() {
		return this.Start;
	}

	/**
	 * Sets a value to attribute Start. 
	 * @param newStart 
	 */
	public void setStart(EDate newStart) {
		this.Start = newStart;
	}

	/**
	 * Returns End.
	 * @return End 
	 */
	public EDate getEnd() {
		return this.End;
	}

	/**
	 * Sets a value to attribute End. 
	 * @param newEnd 
	 */
	public void setEnd(EDate newEnd) {
		this.End = newEnd;
	}

	/**
	 * Returns Comment.
	 * @return Comment 
	 */
	public String getComment() {
		return this.Comment;
	}

	/**
	 * Sets a value to attribute Comment. 
	 * @param newComment 
	 */
	public void setComment(String newComment) {
		this.Comment = newComment;
	}

}
