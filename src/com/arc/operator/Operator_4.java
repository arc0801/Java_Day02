package com.arc.operator;

import java.util.Scanner;

public class Operator_4 {

	public static void main(String [] args) {
		//월급을 입력 받아서 실수령액 계산
			
		//국민연금 : 1.2%
		//의료보험 : 0.8%
		//산재보험 : 0.5%
		//고용보험 : 1.7%
		
		//출력 실수령액 :1890000
		
		
		Scanner sc = new Scanner(System.in);
		int money = 0;
		double a = 1.2;
		double b = 0.8;
		double c = 0.5;
		double d = 1.7;
		int result = 0;
		
		
		System.out.println("월급");
		money = sc.nextInt();
		
		result = money - (int)(money*((a+b+c+d)/100));
		
		System.out.println("실수령액 : "+result+" 원");
		
		
		
	}
	
	
	
}
