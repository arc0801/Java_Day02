package com.arc.v2;

public class Casting_1 {

	public static void main(String [] args) {
		int number1 = 10;
		double number2 = 20.0;
		
		number2 = number1; //자동형변환
		number1 = (int)number2; //강제형변환
		
		System.out.println(number2);
		number2 = 15.236;
		number1 = (int)number2;
		System.out.println(number1);
		
		long l = 10L;
		float f= 1.2F;
		f = l;
		l = (long)f;
		
		number1 = 99;
		char ch = 'b';
		number1 = ch;
		System.out.println(number1);
		number1 = 60;
		
		ch = (char)number1;
		
		System.out.println(ch);
	}
	
	
	
	
	
}
