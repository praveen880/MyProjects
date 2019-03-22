package com.diMap;

import java.util.Map;
import java.util.Map.Entry;

public class BeanMap {
	
	private Map<Integer, String> products;

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
   //business Component
	
	public void printProductsInfo()
	{
		for(Entry<Integer, String> me:products.entrySet())
		{
			System.out.println(me.getKey() +" === "+me.getValue());
		}
	}
}
