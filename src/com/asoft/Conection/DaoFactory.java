package com.asoft.Conection;

import com.asoft.dao.ClienteDao;

public abstract class DaoFactory  {

	public static DaoFactory getDaoFactory() {
		return new JdbcDaoFactory();
	}
	
	public abstract ClienteDao getClienteDao();
}
