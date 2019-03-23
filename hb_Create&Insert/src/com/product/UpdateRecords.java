package com.product;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecords {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration con=new Configuration();
		
		con.configure("product.cfg.xml");
		
		SessionFactory fac=con.buildSessionFactory();
		
		Session s=fac.openSession();
		
		Transaction tx=s.beginTransaction();
		
		Query q=s.createQuery("update Product p set p.pname='Tablet' where p.pid=:v2");
		
	
		
		q.setParameter("v2",1004);
		
		// EXECUTE QUERY
		
		int r=q.executeUpdate();
		
		tx.commit();
		
		System.out.println(r+" Record is Updated");
		
		s.close();
		fac.close();
		
		
		
		
		
		
		
		
		
	}

}
