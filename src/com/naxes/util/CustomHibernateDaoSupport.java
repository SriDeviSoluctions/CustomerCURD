package com.naxes.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

@Component
public abstract class CustomHibernateDaoSupport extends HibernateDaoSupport {
	@Autowired
	@Qualifier(value="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Autowired
	public void useSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
		setSessionFactory(sessionFactory);
	}

}
