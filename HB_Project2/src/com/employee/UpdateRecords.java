package com.employee;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		SessionFactory fac=con.buildSessionFactory();
		Session s=fac.openSession();
		Transaction tx=s.beginTransaction();
		
		Query q=s.createQuery("update from Employee e set e.ename='yanaki880' , e.esal='45000'  where e.eid=:v1");
		
		q.setParameter("v1", 2001);
		int r=q.executeUpdate();
		tx.commit();
		
		System.out.println(r+" RECORD WAS UPDATED");
		
		s.close();
		fac.close();

	}

}
