package com.nxeas.model;

import java.sql.Connection;

import javax.sql.DataSource;

public class ConnectionPool {
	
	private DataSource ds;
	private Connection con;
	
	public ConnectionPool(DataSource ds)
	{
		this.ds=ds;
		try{
			con=ds.getConnection();
		}catch(Exception e){e.printStackTrace();}
	}
	
	public Connection getConnection(){
		return con;
	}

}
