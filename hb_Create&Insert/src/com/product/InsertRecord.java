package com.product;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
		cfg.configure("product.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Product p1=new Product();
		p1.setPid(1004);
		p1.setPname("Cooler");
		p1.setPcost(25000);
		s.save(p1);
		System.out.println("Obect Saved Successfully");
		System.out.println("pid ="+p1.getPid());
		System.out.println("pcost ="+p1.getPname());
		System.out.println("pcost ="+p1.getPcost());
		tx.commit();
		s.close();
		sf.close();
		

	}

}
