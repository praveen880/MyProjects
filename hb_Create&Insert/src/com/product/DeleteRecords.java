package com.product;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con=new Configuration();
		con.configure("product.cfg.xml");
		SessionFactory fac=con.buildSessionFactory();
		Session s=fac.openSession();
		Transaction tx=s.beginTransaction();
		 
		Query q=s.createQuery("Delete from Product p where p.pid=1003");
		
		int r=q.executeUpdate();
		
		tx.commit();
		
		System.out.println(r+" RECORD WAS DELETED");
		
		s.close();
		
		fac.close();
	}

}
