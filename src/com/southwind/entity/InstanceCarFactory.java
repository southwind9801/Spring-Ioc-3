package com.southwind.entity;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	private Map<Integer,Car> cars;

	public InstanceCarFactory() {
		cars = new HashMap<Integer,Car>();
		cars.put(1, new Car(1,"�µ�"));
		cars.put(2, new Car(2,"����"));
	}
	
	public Car getCar(int num){
		return cars.get(num);
	}
	
}
