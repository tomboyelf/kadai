package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
//	private static int today;

	public static void main (String[] args) {
		ArrayList<String> animal = new ArrayList<>();
//		= {"犬", "猫". "うさぎ", "へび"};
		
		animal.add("犬");
		animal.add("猫");
		animal.add("うさぎ");
		animal.add("へび");
		
//		System.out.println(animal);
		
//		好きな動物を定義
		String myAnimal = "へび";
			if (animal.contains(myAnimal)) {
				System.out.println(myAnimal + "はリストに含まれています");
			} else {
				System.out.println(myAnimal + "はリストに含まれていません");
				
			}	
			
		
		Calendar calendar = Calendar.getInstance();
//		calendar.clear();
//		calendar.set(today);
		
//		変数を定義し、現在の月を代入
		int thisMonth = calendar.get(Calendar.MONTH);
//		System.out.println(thisMonth);
//		
//		switch(thisMonth) {
//		case 0:
//			System.out.println("冬物セール");
//			break;
//		case 1:
//			System.out.println("春物を売る");
//			break;
//		case 2:
//			System.out.println("春物を売る");
//			break;
//		case 3:
//			System.out.println("春物を売る");
//			break;
//		case 4:
//			System.out.println("春物セール");
//			break;
//		case 5:
//			System.out.println("夏物を売る");
//			break;
//		case 6:
//			System.out.println("夏物を売る");
//			break;
//		case 7:
//			System.out.println("夏物セール");
//			break;
//		case 8:
//			System.out.println("秋物を売る");
//			break;
//		case 9:
//			System.out.println("冬物を売る");
//			break;
//		case 10:
//			System.out.println("冬物を売る");
//			break;
//		case 11:
//			System.out.println("冬物を売る");
//			break;
//		}
//		
		if (thisMonth == 0) {
			System.out.println("冬物セール");
		} else if (thisMonth >= 1 && thisMonth <= 3) {
			System.out.println("春物を売る");
		} else if (thisMonth == 4) {
			System.out.println("春物セール");
		} else if (thisMonth >= 5 && thisMonth <= 6) {
			System.out.println("夏物を売る");
		} else if (thisMonth == 7) {
			System.out.println("夏物セール");
		} else if (thisMonth == 8) {
			System.out.println("秋物を売る");
		} else if (thisMonth >= 9 && thisMonth <= 11) {
			System.out.println("冬物を売る");
		} else {
			System.out.println("不正な月です");
			
		}
		 
		
	}
}
