package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Random;

public class PracticeTest6 {
//	private static int today;

	public static void main (String[] args) {
		
//		問題1///////////////////////////////////////
		Random r = new Random();
		int fortune = r.nextInt(5);
		
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		
//		問題２///////////////////////////////////////
		
		ArrayList<Integer> number = new ArrayList<>();
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
//				System.out.println(i);
//				int u =i;
				number.add(i);
			}
		}
		System.out.println(number);
			
//		問題3///////////////////////////////////////
		ArrayList<Integer> number1 = new ArrayList<>();
		for(int i = 1; i <= 9; i=i+1) {
				number1.add(i);
			}
		System.out.println(number1);
		
		
		number1.clear();
		for(int i = 2; i <= 18; i=i+2) {
			number1.add(i);
		}
		System.out.println(number1);
		
		number1.clear();
		for(int i = 3; i <= 27; i=i+3) {
			number1.add(i);
		}
		System.out.println(number1);
		
		number1.clear();
		for(int i = 4; i <= 36; i=i+4) {
			number1.add(i);
		}
		System.out.println(number1);
		
		number1.clear();
		for(int i = 5; i <= 45; i=i+5) {
			number1.add(i);
		}
		System.out.println(number1);
		
		number1.clear();
		for(int i = 6; i <= 54; i=i+6) {
			number1.add(i);
		}
		System.out.println(number1);
		
		number1.clear();
		for(int i = 7; i <= 63; i=i+7) {
			number1.add(i);
		}
		System.out.println(number1);
		
		number1.clear();
		for(int i = 8; i <= 72; i=i+8) {
			number1.add(i);
		}
		System.out.println(number1);
		
		number1.clear();
		for(int i = 9; i <= 81; i=i+9) {
			number1.add(i);
		}
		System.out.println(number1);
		
//		問題4///////////////////////////////////////
		ArrayList<Integer> number2 = new ArrayList<>();
		
		int num;
//		わからず
		
		
		
//		問題5///////////////////////////////////////	
		ArrayList<String> employees = new ArrayList<>();					
		employees.add("斎藤");					
		employees.add("田中");					
		employees.add("山田");					
		employees.add("鈴木");					
		employees.add("高橋");					
							
		ArrayList<String> submitters = new ArrayList<>();					
		submitters.add("斎藤");					
		submitters.add("高橋");			
		
		
		ArrayList<String> mi = new ArrayList<>();	
		for (String a:employees) {
			if(submitters.contains(a)) {
				mi.add(a);
			}
		}
		
		System.out.println(mi);
		
//		問題6///////////////////////////////////////	
		ArrayList<Integer> sosu = new ArrayList<>();
		
		for(int oNumber = 1; oNumber<100; oNumber++) {
			if(oNumber%2!=0 && oNumber%3!=0 && oNumber%4!=0 && oNumber%5!=0 && oNumber%6!=0 && oNumber%7!=0 && oNumber%8!=0 && oNumber%9!=0) {
				sosu.add(oNumber);
			}
		}
		System.out.println(sosu);

	}
}
