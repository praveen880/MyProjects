package com.diProperty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("config.xml");
		BeanFactory fac=new XmlBeanFactory(res);
		BeanProperty bp=(BeanProperty)fac.getBean("id1");
		bp.printDataBase();

	}

}
