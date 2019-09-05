package com.arc.v1;

public class Day02_1 {

	public static void main(String [] args) {
		//학교 성적관리 프로그램
		//학생의 이름
		//국어, 영어, 수학 
		//총점 계산
		//평균 계산
		//학생 이름 출력
		//총점 출력
		//평균 출력
		
		//변수 선언 공식
		//데이터타입 변수명
		
		//이름을 담는 변수
		String name = "Ara";
		//국어점수를 담는 변수 선언과 초기화 : 95
		int kor = 95;
		//영어점수를 담는 변수 선언과 초기화 : 55
		int eng = 55;
		//수학점수를 담는 변수 선언과 초기화 : 20
		int math = 20;
		
		//총점을 담을 변수 선언
		int sum = kor + eng + math;
		
		//평균을 담을 변수 선언
		int avg = sum / 3;
		
		System.out.println(name);
		//170
		System.out.println(sum);
		//56.66
		System.out.println(avg);
		
		
	}
}
