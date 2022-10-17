package week3Homework3.business;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.core.logging.Logger;
import week3Homework3.dataAcces.BaseDao;
import week3Homework3.entities.Category;

public class CategoryManager {
	private BaseDao baseDao;
	private Logger[] loggers;
	List<Category> categories=new ArrayList<Category>();

	public CategoryManager(BaseDao baseDao, Logger[] loggers) {

		this.baseDao = baseDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		for (Category categoryInList : categories) {
			if (categoryInList.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori ismi ayni olamaz");
			}
		}
		
		categories.add(category);
		baseDao.add(category);
		for (Logger logger : loggers) {
			logger.Log(category.getCategoryName());
		}
	}

}
