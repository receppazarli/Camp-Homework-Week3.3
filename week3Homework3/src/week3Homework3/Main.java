package week3Homework3;

import week3Homework3.business.CategoryManager;
import week3Homework3.business.CourseManager;
import week3Homework3.business.InstructorManager;
import week3Homework3.core.logging.DatabaseLogger;
import week3Homework3.core.logging.Logger;
import week3Homework3.dataAcces.JdbcDao;
import week3Homework3.entities.Category;
import week3Homework3.entities.Course;
import week3Homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Instructor instructor = new Instructor(1, "Engin", "Demirog");
		Category category= new Category(10, "Programlama");
		//Category category2 = new Category(11, "Programlama");
		Course course = new Course(100, 1, 10, "Java", 150);
		//Course course2 = new Course(100, 1, 10, "Java", 150);
		
		Logger[] loggers= {new DatabaseLogger()};
		
		CourseManager courseManager = new CourseManager(new JdbcDao(),loggers);
		courseManager.add(course);
		//courseManager.add(course2);
		
		InstructorManager instructorManager = new InstructorManager(new JdbcDao(),loggers);
		instructorManager.add(instructor);
		
		CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers);
		categoryManager.add(category);
		//categoryManager.add(category2);		
		

	}

}
