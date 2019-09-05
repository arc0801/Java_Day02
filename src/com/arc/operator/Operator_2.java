package com.arc.operator;

public class Operator_2 {

	public static void main(String [] args) {
		
		System.out.println(1+1); //산술연산자
		System.out.println('1'+1); // char + int 산술연산자, 아스키코드
		System.out.println("1"+1); // String + int 연결연산자
		String result = "1"+1;
		
		System.out.println("1"+1+1); //12 -> 111
		//System.out.println("1"+(1+1)); -> 12
		System.out.println("1"+'1'); //149 -> 11
		System.out.println('1'+1+"1"); //501
		
		
		
		
	}
	
	
	
	
	
	
	
}
