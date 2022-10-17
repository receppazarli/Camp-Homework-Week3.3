package week3Homework3.dataAcces;

import week3Homework3.entities.IEntity;

public class JdbcDao implements BaseDao {

	@Override
	public void add(IEntity entity) {
		
		System.out.println("JDBC ile veri tabanina eklendi");
		
	}

}
