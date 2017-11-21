package com.naxes.dao.impl;

import java.util.List;
import org.apache.log4j.*;

import javax.persistence.UniqueConstraint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.naxes.util.CustomHibernateDaoSupport;
import com.naxes.util.CustomHibernateTemplate;
import com.nxeas.dao.CustomerDAO;
import com.nxeas.model.Customer;

@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
   
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private static final Logger logger=Logger.getLogger(CustomerDAOImpl.class);
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
    @Override
    @Transactional
	public void add(Customer customer) {
    	logger.info("Entered into Add method");
		// TODO Auto-generated method stub
    	getSessionFactory().getCurrentSession().save(customer);
    	
        
	}

	@Override
	@Transactional
	public void edit(Customer customer) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().update(customer);
		
	}
	

	@Override
	@Transactional
	public void delete(int customerId) {
		// TODO Auto-generated method 
		session=getSessionFactory().getCurrentSession();
        Object objCustomer=session.get(Customer.class,new Integer(customerId));
        if(objCustomer!=null){
        	  session.delete(objCustomer);
        }
        
	}

	@Override
	@Transactional
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return (Customer)getSessionFactory().getCurrentSession().get(Customer.class, new Integer(customerId));
	}   

	@Override
	@Transactional
	public List getAllCustomers() {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().createCriteria(Customer.class).list();
		
	}
    

}
