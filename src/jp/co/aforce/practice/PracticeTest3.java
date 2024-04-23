package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeTest3 {
	public static void main (String[] args) {
		String[] bungu = {"シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム"};
		System.out.println(bungu[1]);
		
		ArrayList<String> name = new ArrayList<>();
		name.add("山田太郎");
		name.add("鈴木花子");
		name.add("佐藤二郎");
		name.add("山田太郎");
		name.add("高橋三郎");
		
		String name1 = name.get(2);
		System.out.println(name1);
		
//		ArrayList<Integer> list1 = new ArrayList<>();				
//		list1.add(10);				
//		list1.add(11);				
//		list1.add(12);				
//		list1.add(15);				
//		list1.add(16);				
//		list1.add(18);				
//		list1.add(19);				
//		list1.add(20);	
//		
//		for(int i=0; i<=8; i++) {
//			int number = list1.get(i);
//			System.out.println(number);
//		}
		
		ArrayList<Integer> list1 = new ArrayList<>();				
		list1.add(10);				
		list1.add(15);				
		list1.add(16);				
		list1.add(19);				
						
		ArrayList<Integer> list2 = new ArrayList<>();				
		list2.add(11);				
		list2.add(12);				
		list2.add(18);				
		list2.add(20);				
		
		list1.addAll(list2);
		Collections.sort(list1);
		
		System.out.println("以下問題６");
		
		for(int i=0; i<=7; i++) {
			int number = list1.get(i);
			System.out.println(number);
		}
		
		
		
		System.out.println("以下問題７");
		
		list1.add(13);
		list1.add(14);
		list1.add(17);
		list1.add(21);
		Collections.sort(list1);
		
		
		for(int u=0; u<=11; u++) {
		int number2 = list1.get(u);
			System.out.println(number2);
		}
		

				
		
		
	}
}
