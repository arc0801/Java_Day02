package com.arc.v1;

import java.util.Scanner;
//Crtl + space bar
public class Day02_3 {

	public static void main(String [] args) {
		//키보드와 연결 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요");
		double ki = sc.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = sc.nextDouble();
		
		System.out.println("NAME : "+name);
		System.out.println(age);
		System.out.println(ki);
		System.out.println(weight);
		
		
		
	}
	
	
}
