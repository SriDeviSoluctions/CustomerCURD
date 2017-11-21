package com.naxes.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomHibernateTemplate extends HibernateTemplate {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public void afterPropertiesSet(){
		setSessionFactory(sessionFactory);
		super.afterPropertiesSet();
	}

}
