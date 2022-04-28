package com.yash;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

public class UserDAO {
	HibernateTransactionManager hbmtemplate;

	public void setHbmtemplate(HibernateTransactionManager hbmtemplate) {
		this.hbmtemplate = hbmtemplate;
	}
		
		public void saveUser(User u)
		{	
			  SessionFactory sf= hbmtemplate.getSessionFactory();
			  Session objSession = sf.openSession();
			  Transaction t = objSession.beginTransaction();
			  
			  objSession.save(u);
			  
			  t.commit();
			  System.out.println("Record saved");
			  objSession.close();		 
		}
		
		public void update(User u) 
		{
			  SessionFactory sf= hbmtemplate.getSessionFactory();
			  Session objSession = sf.openSession();
			  Transaction t = objSession.beginTransaction();
			  objSession.update(u);
			  t.commit();
			  System.out.println("Record updated");
			
		}
	
		public User getUserByuserID(int userid)
		{
			 SessionFactory sf= hbmtemplate.getSessionFactory();
			  Session objSession = sf.openSession();
			  Transaction t = objSession.beginTransaction();
			  User objU =(User) objSession.get(User.class,userid);
			  return objU;
			
		}

		public void delUser(User u) {
			SessionFactory sf = hbmtemplate.getSessionFactory();
			Session objSession = sf.openSession();
			Transaction t = objSession.beginTransaction();
			objSession.delete(u);
			t.commit();
			objSession.close();
			System.out.println("Data deleted");

		}
		public User getEmpById(int i) {
			SessionFactory sf = hbmtemplate.getSessionFactory();
			Session objSession = sf.openSession();
			Transaction t = objSession.beginTransaction();

			User objE = (User) objSession.get(User.class, i);
			return objE;
			
		}
		
		public List<User> getEmpByname(String f) {
			SessionFactory sf = hbmtemplate.getSessionFactory();
			Session objSession = sf.openSession();
			Transaction t = objSession.beginTransaction();
			List<User> ulist=new ArrayList<User>();
			
			Criteria ct=objSession.createCriteria(User.class,f);
			ulist=ct.list();
			return ulist;
		}
		
			
		}




