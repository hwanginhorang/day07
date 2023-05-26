package mgp;

import java.util.Random;

public class TestClass04 {
	public static void main(String[] args) {
		//o.o ~ 0.99 사이의 수를 뽑아준다
		for(int i=0; i<5; i++) {
			double ran = Math.random();
			//0.00~2.99
			//int형변환 => 0~2총 3개의 값을 가져온다
			System.out.println(ran*3 + " , "+(int)(ran*3));
		}
		System.out.println("=========================");
		for(int i=0; i<5; i++) {
			int n = (int)(Math.random()*10+10);
			System.out.println(n);
		}
		System.out.println("=========================");
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*4 + 10));
		}
		Random rand = new Random();
		for(int i=0; i<5; i++) {
			System.out.println(rand.nextInt(5));
		}
	}
}
