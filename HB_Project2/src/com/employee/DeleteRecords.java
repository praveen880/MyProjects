package com.employee;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		SessionFactory fac=con.buildSessionFactory();
		Session s=fac.openSession();
		Transaction tx=s.beginTransaction();
		
		Query q=s.createQuery("Delete from Employee e where e.eid=:v1");
		q.setParameter("v1", 2001);
		
		int r=q.executeUpdate();
		
		System.out.println(r+" Record Deleted");
		
		tx.commit();
		
		s.close();
		
		fac.close();
	}

}
