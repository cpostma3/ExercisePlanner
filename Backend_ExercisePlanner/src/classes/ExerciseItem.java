package classes;

public class ExerciseItem {

	private String type; // stores the type/genre of the exercise
	private String description; // stores a brief description of how the exercise is performed
	private String[] images; // stores one or more images associated with the exercise

	/*
	 * Creates an object storing the inputed type, description, and image
	 * information.
	 * 
	 * @param type the type/genre of the exercise (yoga, crossfit, etc.)
	 * 
	 * @param description a brief description of how the exercise is supposed to be
	 * performed
	 * 
	 * @param image one or more images that demonstrate the exercise
	 */
	ExerciseItem(String type, String description, String[] images) {
		this.type = type;
		this.description = description;
		this.images = images;
	}

	/*
	 * Returns the associated "type" value of the object
	 * 
	 * @return the value stored in the "type" variable of the object
	 */
	public String getType() {
		return this.type;
	}

	/*
	 * Returns the associated "description" value of the object
	 * 
	 * @return the value stored in the "description" variable of the object
	 */
	public String getDescription() {
		return this.description;
	}

	/*
	 * Returns the associated "images" value of the object
	 * 
	 * @return the value stored in the "images" variable of the object
	 */
	public String[] getImages() {
		return this.images;
	}

}
