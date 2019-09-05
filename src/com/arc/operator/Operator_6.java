package com.arc.operator;

import java.util.Scanner;

public class Operator_6 {

	public static void main(String [] args) {
		//시급 8350
		//일한 시간 입력
		//급여
		//백단위 이하는 기부
		
	Scanner sc = new Scanner(System.in);
	int t = 0;
	int m = 0;
	int d = 0;
	
	System.out.println("근무시간");
	t = sc.nextInt();
		
	m = 8350*t;
	
	d = m-((int)(m*0.001))*1000; //d = m%1000;
	
	//int d=m/1000;
	//d=d*1000;
	//int m=m-d;
	
	m = m-d;
	
	System.out.println("기부금은 "+d+" 원");	
	System.out.println("실수령액은 "+m+" 원");	
		
		
		
	}
	
	
	
	
}
