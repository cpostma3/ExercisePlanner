package classes;

public class User {
	String username; // stores the account username
	String password; // stores the account password
	String[] preferences; // stores the workout type preferences of the user
	ExerciseItem[] exercisePlan; // stores the workout plan associated with the user
	int progress; // stores the progress made on the workout plan

	/*
	 * Creates an object storing the username and password of a new user.
	 * 
	 * @param username the username associated with the current user (must be
	 * unique)
	 * 
	 * @param password the password that will be associated with the username
	 */
	User(String username, String password) {
		this.username = username;
		this.password = password;
		this.preferences = null;
		this.exercisePlan = null;
		this.progress = 0;
	}

	/*
	 * Changes the value stored in the object's "username"
	 * 
	 * @param username the new username that is to be stored
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/*
	 * Returns the associated "username" value of the object
	 * 
	 * @return the value stored in the "username" variable of the object
	 */
	public String getUsername() {
		return this.username;
	}

	/*
	 * Changes the value stored in the object's "password"
	 * 
	 * @param password the new password that is to be stored
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * Returns the associated "password" value of the object
	 * 
	 * @return the value stored in the "password" variable of the object
	 */
	public String getPassword() {
		return this.password;
	}

	/*
	 * Changes the value stored in the object's "preferences"
	 * 
	 * @param preferences the new list of preferences that is to be stored
	 */
	public void setPreferences(String[] preferences) {
		this.preferences = preferences;
	}

	/*
	 * Returns the associated "preferences" value of the object
	 * 
	 * @return the list of values stored in the "preferences" variable of the object
	 */
	public String[] getPreferences() {
		return this.preferences;
	}
	
	/*
	 * Creates a new list of exercise items to be used as an exercise plan
	 * 
	 * @param exercisePlan the new list of exercises that is to be stored
	 */
	public void setExercisePlan(ExerciseItem[] exercisePlan) {
		this.exercisePlan = exercisePlan;
	}

	/*
	 * Returns the associated "exercisePlan" value of the object
	 * 
	 * @return the list of exercises that have been created given the plan
	 */
	public ExerciseItem[] getExercisePlan() {
		return this.exercisePlan;
	}

	/*
	 * Changes the value stored in the object's "progress"
	 * 
	 * @param progress the new progress (in number of exercises completed) that is
	 * to be stored
	 */
	public void setProgress(int progress) {
		this.progress = progress;
	}

	/*
	 * Returns the associated "progress" value of the object
	 * 
	 * @return the progress associated with the current object
	 */
	public int getProgress() {
		return this.progress;
	}
}
