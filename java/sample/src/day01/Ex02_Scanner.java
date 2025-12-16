package day01;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		// 객체 생성 키워드 : new
		// 클래스타입 객체명 = new 클래스명();
		// Scanner : 표준 입력 객체
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // nextInt() 정수 하나를 입력 받는 메소드
		System.out.println("a : " + a);
		System.out.printf("a value => %d", a);
		
		sc.close(); // close() : 객체를 메모리에서 해제하는 메소드
		// 얘를 작성하므로써 위에 경고 사라짐 이후 sc.nextInt() 작성하면 에러 발생
	}
}
