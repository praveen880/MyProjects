package com.diObject2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("config.xml");
		
		BeanFactory fac=new XmlBeanFactory(res);
		
		Person p=(Person) fac.getBean("id1");
		p.printPersonDetails();

	}

}
