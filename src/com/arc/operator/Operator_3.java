package com.arc.operator;

import java.util.Scanner;

public class Operator_3 {

	public static void main(String [] args) {
		//가로, 세로 값을 실수형으로 키보드로부터 입력 받아서
		//사각형의 면적과 둘레를 계산하여 출력
		
		//결과
		//면적 : 123.4 (가로*세로)
		//둘레 : 523.1 (가로+세로)*2
		
		Scanner sc = new Scanner(System.in);
		double r = 0.0;
		double u = 0.0;
		
		double x = 0.0;
		double l = 0.0;
		
		
		System.out.println("가로길이");
		r = sc.nextDouble();
		
		System.out.println("세로길이");
		u = sc.nextDouble();
		
		x = r*u;
		l = (r+u)*2;
		
		System.out.println("면적 : "+x);
		System.out.println("둘레 : "+l);
		
	}
	
	
	
}
