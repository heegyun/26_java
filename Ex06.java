package day03;

import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// id,pwd 초기화
		String id="hong", pwd="1234";
		
		System.out.println("아이디를 입력하세요: ");
		String myId = scan.next();
		
		System.out.println("비밀번호를 입력하세요: ");
		String myPwd = scan.next();
		
		
		if((myId.equals(id)) && (myPwd.equals(pwd))) {
			//참일 때 실행문
			System.out.println("로그인 성공!!");
		}else {
			System.out.println("로그인 실패!!");
		}
		
		

	}

}
