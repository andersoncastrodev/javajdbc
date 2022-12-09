package com.asoft.Conection;

public abstract class DaoFactory  {

	public static DaoFactory getDaoFactory() {
		return new JdbcDaoFactory();
	}
}
