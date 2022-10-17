package week3Homework3.entities;

public class Course implements IEntity {

	private int id;
	private int courseInstructorId;
	private int categoryId;
	private String courseName;
	private double couserPrice;

	

	public Course(int id, int courseInstructorId, int categoryId, String courseName, double couserPrice) {
		super();
		this.id = id;
		this.courseInstructorId = courseInstructorId;
		this.categoryId = categoryId;
		this.courseName = courseName;
		this.couserPrice = couserPrice;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourseInstructorId() {
		return courseInstructorId;
	}

	public void setCourseInstructorId(int courseInstructorId) {
		this.courseInstructorId = courseInstructorId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCouserPrice() {
		return couserPrice;
	}

	public void setCouserPrice(double couserPrice) {
		this.couserPrice = couserPrice;
	}

}
