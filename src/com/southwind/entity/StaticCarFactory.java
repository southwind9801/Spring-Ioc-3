package com.southwind.entity;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	
	private static Map<Integer,Car> cars;
	
	static{
		cars = new HashMap<Integer,Car>();
		cars.put(1, new Car(1,"°ÂµÏ"));
		cars.put(2, new Car(2,"°ÂÍØ"));
	}
	
	public static Car getCar(int num){
		return cars.get(num);
	}
}
