package com.arc.v1;

import java.util.Scanner;

public class Day02_4 {

	public static void main(String [] args) {
		//성적관리 프로그램
		//이름, 국어, 영어, 수학 키보드로 입력 받아서
		//총점과 평균을 계산
		//이름, 총점, 평균을 출력하세요
		Scanner sc = new Scanner(System.in);
		String name = null;
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0;
		
				
		System.out.println("이름을 입력하세요");
		name = sc.next();
		//nextLine(); -> 띄어쓰기까지 받고 싶을 때
		System.out.println("국어 점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3;
		
		System.out.println(name);
		System.out.println(sum);
		System.out.println(avg);
		
		
		
		
	}
	
	
	
	
}
