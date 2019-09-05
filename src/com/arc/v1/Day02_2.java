package com.arc.v1;

public class Day02_2 {

	public static void main(String [] args) {
		//안과 상담예약
		//이름, 전화번호, 좌우시력, 성별, 나이
		//전체 정보 출력
		
		String name = "아라";
		String phnum = "010-3511-1404";
		//cf) int phnum = 01035111404; -> 숫자 앞에 0이 있으면 8진수로 인식
		double seel = 0.8;
		//float left = 0.8f;
		double seer = 1.0;
		String sex = "여";
		//char sex = '여';
		int age = 25;
		
		System.out.println(name);
		System.out.println(phnum);
		System.out.println(seel);
		System.out.println(seer);
		System.out.println(sex);
		System.out.println(age);
		
		
		
	}
	
}
