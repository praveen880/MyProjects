package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		SessionFactory fac=con.buildSessionFactory();
		Session s=fac.openSession();
		Transaction tx=s.beginTransaction();
		
		Employee e=new Employee();
		
		e.setEid(2004);
		e.setEname("Praveen");
		e.setEsal(50000);
		s.save(e);
		System.out.println("OBJECT SAVED SUCCESSFULLY");
		System.out.println("==========================");
		System.out.println("eID     = "+e.getEid());
		System.out.println("eNAME   = "+e.getEname());
		System.out.println("eSALARY = "+e.getEsal());
		tx.commit();
		s.close();
		fac.close();

	}

}
