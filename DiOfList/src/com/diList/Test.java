package com.diList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("config.xml");
		BeanFactory fac= new XmlBeanFactory(res);
		
		MyBean mb=(MyBean)fac.getBean("id1");
		mb.printNames();

	}

}
