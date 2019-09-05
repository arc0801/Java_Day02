package com.arc.operator;

import java.util.Scanner;

public class Operator_7 {

	public static void main(String [] args) {
		
		//무인편의점..
		//물건의 합계  35860 입력
		//손님이 낸 돈 50000 입력
		//잔돈            14140 계산
		//만원 1장
		//천원 4장
		//백원 1개
		//십원 4개
		//
		
	Scanner sc = new Scanner(System.in);	
	int price = 0;
	int money = 0;
	int change = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	
	
	System.out.println("물건의 합계");
	price = sc.nextInt();
	System.out.println("받은 돈");
	money = sc.nextInt();
	
	change = money - price;
	
	a = change/10000;
	b = (change - 10000*a)/1000;  //change%10000/1000;
	c = (change - 10000*a - 1000*b)/100;  //change%1000/100;
	d = (change - 10000*a - 1000*b - 100*c)/10;  //change%100/10;
			
	System.out.println("거스름 돈 : "+change+" 원");
	System.out.println("만원 : "+a+"장");
	System.out.println("천원 : "+b+"장");
	System.out.println("백원 : "+c+"개");
	System.out.println("십원 : "+d+"개");
	
		
	}
	
	
}
