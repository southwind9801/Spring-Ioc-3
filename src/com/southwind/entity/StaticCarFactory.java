package com.southwind.entity;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	
	private static Map<Integer,Car> cars;
	
	static{
		cars = new HashMap<Integer,Car>();
		cars.put(1, new Car(1,"�µ�"));
		cars.put(2, new Car(2,"����"));
	}
	
	public static Car getCar(int num){
		return cars.get(num);
	}
}
