package com.diMap;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Resource res=new ClassPathResource("config.xml");
		BeanFactory fac=new XmlBeanFactory(res);
		BeanMap bm=(BeanMap)fac.getBean("id1");
		bm.printProductsInfo();

	}

}
