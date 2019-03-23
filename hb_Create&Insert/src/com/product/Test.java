package com.product;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg=new Configuration();
		cfg.configure("product.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Product p1=new Product();
		p1.setPid(1002);
		p1.setPname("Laptop");
		p1.setPcost(45000);
		s.save(p1);
		System.out.println("Obect Saved Successfully");
		tx.commit();
		s.close();
		sf.close();
		

	}

}
