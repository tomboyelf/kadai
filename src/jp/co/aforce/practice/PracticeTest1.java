package jp.co.aforce.practice;

public class PracticeTest1 {
	public static void main (String[] args) {
		System.out.println("Hello World");
		
		int x = 11;
		System.out.println("x=" +x);
		
		int y = 13;
		int z = 17;
		System.out.println("y="+y);
		System.out.println("z="+z);
		
		int total = y + z;
		System.out.println(total);
		
		final int w = 6;
		System.out.println(w);
		
		int sum = total + w;
		System.out.println(sum);
	}
}
