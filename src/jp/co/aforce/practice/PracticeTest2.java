package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main (String[] args) {
		final double TAX = 1.1;
		System.out.println(TAX);
		
		int x = 480;
		double price  = x * TAX;
		System.out.println(price);
		
		String name = "tuo";
		System.out.println(name);
		
		String a = "この商品の値段は";
		String b = "円です";
		System.out.println(a + price + b);
		
		
	}
}
