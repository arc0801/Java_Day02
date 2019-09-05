package com.arc.operator2;

import java.util.Scanner;

public class Operator5 {

	public static void main(String [] args) {
		//키보드로부터 나이를 입력
		//미성년자, 성년 인가를 판별
		
		
		Scanner sc = new Scanner(System.in);
		int age = 0;
		String result = null;
		
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		
		//조건식?A:B
		
		result = age>=20?"성년":"미성년";
		
		System.out.println(result);
		
		//10대 여부
		
		result = age>=10 && age<20?"10대":"10대 아님";
		
		System.out.println(result);
		
		
		
		
		
		
	}
}
