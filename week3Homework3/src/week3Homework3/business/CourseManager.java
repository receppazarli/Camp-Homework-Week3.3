package week3Homework3.business;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.core.logging.Logger;
import week3Homework3.dataAcces.BaseDao;
import week3Homework3.entities.Course;

public class CourseManager {

	private BaseDao baseDao;
	private Logger[] loggers;
	List<Course> courses = new ArrayList<Course>();

	public CourseManager(BaseDao baseDao, Logger[] loggers) {
		super();
		this.baseDao = baseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		if (course.getCouserPrice() < 0) {
			throw new Exception("Kursun fiyati 0 dan kucuk olamaz");
		}
		
		for (Course courseInList : courses) {
			if (courseInList.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi ayni olamaz");
			}
		}
		
		courses.add(course);
		baseDao.add(course);
		for (Logger logger : loggers) {
			logger.Log(course.getCourseName());
		}
		
	}

}
