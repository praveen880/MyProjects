package com.product;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class PrintRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration();
        con.configure("product.cfg.xml");
        SessionFactory fac=con.buildSessionFactory();
        Session s=fac.openSession();
        Transaction tx=s.beginTransaction();
        
        Query q=s.createQuery("from Product");
        
        
        
        
        List li=q.list();
        
        Iterator<Product> it=li.iterator();
        
        while(it.hasNext())
        {
        	Product p=(Product)it.next();
        	System.out.println("id ="+p.getPid());
        	System.out.println("name ="+p.getPname());
        	System.out.println("cost ="+p.getPcost());
        	
        }
        s.close();
        fac.close();
        tx.commit();
        
        
        
	}

}
