package com.diProperty;

import java.util.Map.Entry;
import java.util.Properties;

public class BeanProperty {
	
	private Properties database;

	public void setDatabase(Properties database) {
		this.database = database;
	}
	// Business Component
	public void printDataBase()
	{
		for(Entry<Object, Object> me:database.entrySet())
		{
			System.out.println(me.getKey()+" == "+me.getValue());
		}
	}
	

}
