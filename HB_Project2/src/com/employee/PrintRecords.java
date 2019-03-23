package com.employee;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PrintRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		SessionFactory fac=con.buildSessionFactory();
		Session s=fac.openSession();
		Transaction tx=s.beginTransaction();
		
		Query q=s.createQuery("from Employee");
		List li=q.list();
		
		Iterator<Employee> it=li.iterator();
		while(it.hasNext())
		{
			Employee e=(Employee)it.next();
			
			System.out.println("==========================");
			System.out.println("eID     = "+e.getEid());
			System.out.println("eNAME   = "+e.getEname());
			System.out.println("eSALARY = "+e.getEsal());
			
		}
		tx.commit();
		s.close();
		fac.close();
		

	}

}
