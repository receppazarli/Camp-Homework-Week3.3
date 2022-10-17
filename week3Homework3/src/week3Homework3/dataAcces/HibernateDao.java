package week3Homework3.dataAcces;

import week3Homework3.entities.IEntity;

public class HibernateDao implements BaseDao{

	@Override
	public void add(IEntity entity) {
		
		System.out.println("Hibernate ile veri tabanına eklendi");
		
		
	}

}
