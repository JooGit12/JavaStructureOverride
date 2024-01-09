package com.kim.javasjan09;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EntrySet {
	
	public void getmap() {
		Map<String, Integer> fruitMap = new HashMap<>();  // 과일 이름과 가격을 저장하는 해시맵을 생성합니다.
		fruitMap.put("Apple", 1000);
		fruitMap.put("Banana", 2000);
		
		for (String key : fruitMap.keySet()) { // 해시맵의 모든 키에 대해 반복문을 실행합니다.
		    System.out.println("key: " + key + " value: " + fruitMap.get(key)); // 각 키와 그에 해당하는 값을 출력합니다.
		}
		
		for (Entry<String, Integer> fruit: fruitMap.entrySet()) { // 해시맵의 모든 엔트리(키-값 쌍)에 대해 반복문을 실행합니다.
		    System.out.println("key: " + fruit.getKey() + " value: " + fruit.getValue()); // 각 엔트리의 키와 값을 출력합니다.
		}
		
		List<Map.Entry<String, Fruit>> orderedTuples = new ArrayList<>(); // 엔트리를 저장하는 리스트를 생성합니다.
		
		orderedTuples.add(new AbstractMap.SimpleEntry<>("1", new Fruit("Banana", 2000)));
		orderedTuples.add(new AbstractMap.SimpleEntry<>("2", new Fruit("Kiwi",3000)));
		orderedTuples.add(new AbstractMap.SimpleEntry<>("2", new Fruit("Kiwi",3000)));
		
		for (Map.Entry<String, Fruit> tuple : orderedTuples) { // 리스트의 모든 엔트리에 대해 반복문을 실행합니다.
		    System.out.println("key: " + tuple.getKey() + " value: " + tuple.getValue()); // 각 엔트리의 키와 값(Fruit 객체)을 출력합니다.
		}
	}
		
	public class Fruit {
		private String name;
		private int price;
		
		public Fruit(String name, int price) { // 생성자입니다. 과일 이름과 가격을 인자로 받아 객체를 생성합니다.
			this.name = name;
			this.price = price;
		}
		      
        @Override
        public String toString() { // toString 메서드를 오버라이드합니다. 객체를 문자열 형태로 반환하는 메서드입니다.
            return "Fruit [name=" + name + ", price=" + price + "]"; // 과일 이름과 가격을 문자열 형태로 반환합니다.
        }
	}
		
	public static void main(String[] args) {
		EntrySet entrySet = new EntrySet(); // EntrySet 객체를 생성합니다.
		entrySet.getmap();	// getmap 메서드를 호출하여 해시맵과 리스트를 출력합니다.	
	}
}
