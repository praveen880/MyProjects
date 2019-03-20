package com.diList;

import java.util.Iterator;
import java.util.List;

public class MyBean {
	
	private List<String> studentnames;

	
	//Business Method
	
	public void printNames()
	{
		Iterator<String> it=studentnames.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}


	public void setStudentnames(List<String> studentnames) {
		this.studentnames = studentnames;
	}



}
