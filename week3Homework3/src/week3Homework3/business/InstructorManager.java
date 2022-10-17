package week3Homework3.business;

import week3Homework3.core.logging.Logger;
import week3Homework3.dataAcces.BaseDao;
import week3Homework3.entities.Instructor;

public class InstructorManager {

	private BaseDao baseDao;
	private Logger[] loggers;

	public InstructorManager(BaseDao baseDao, Logger[] loggers) {
		
		this.baseDao = baseDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor )  {
		
		baseDao.add(instructor);
		for (Logger logger : loggers) {
			logger.Log(instructor.getFirstName()+" "+instructor.getLastName());
		}
	}

}
