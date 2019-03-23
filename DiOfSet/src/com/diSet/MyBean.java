package com.diSet;



import java.util.Iterator;
import java.util.Set;

public class MyBean {
	
	private Set<Integer> rollno;

	
	public void printid(){
	Iterator it=rollno.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
	}


	public void setRollno(Set<Integer> rollno) {
		this.rollno = rollno;
	}








	


}
